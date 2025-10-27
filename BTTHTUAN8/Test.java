import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        IQuanLySach qls = new QuanLySachImpl();

        SachGiaoTrinh sgk1 = new SachGiaoTrinh("SGK01", "Lap trinh huong doi tuong", "Khoa CNTT", 2024, 100, 5000,"Lap trinh Java", "Dai Hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("STT01", "De Men Phieu Luu Ky", "To Hoai", 1941, 50, 5000, "Thieu Nhi", false);
        SachTieuThuyet stt2 = new SachTieuThuyet("STT02", "Harry Potter va Hon Da Phu Thuy", "J.K. Rowling", 1997, 75, 5000, "Fantasy", true);

        qls.themSach(sgk1);
        qls.themSach(stt1);
        qls.themSach(stt2);

        int chon;
        do
        {
            System.out.println("\n=============MENU=============");
            System.out.println("1. Them sach");
            System.out.println("2. Xoa sach");
            System.out.println("3. Cap nhat sach");
            System.out.println("4. Tim sach");
            System.out.println("5. Hien thi danh sach sach");
            System.out.println("6. Kiem tra ton kho");
            System.out.println("7. Cap nhat vi tri sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap vao lua chon cua ban: ");
            
            chon = sc.nextInt();
            sc.nextLine();
            
            switch (chon) 
            {
                case 1:
                {   
                    qls.Nhap(sc); 
                    break;
                }
                case 2:
                {
                    System.out.print("Nhap vao ma sach muon xoa: ");
                    String ms = sc.nextLine();
                    qls.xoaSach(ms);
                    break;
                }
                case 3:
                {
                    System.out.print("Nhap vao ma sach can cap nhat: ");
                    String maSachCu = sc.nextLine();
                    
                    Sach sachCanSua = qls.timSach(maSachCu);
                    
                    if (sachCanSua == null) 
                    {
                        System.out.println("Khong tim thay sach co ma: " + maSachCu);
                        break;
                    }

                    System.out.println("Tim thay sach: " + sachCanSua.getTieuDe());
                    System.out.println("--- MOI BAN NHAP THONG TIN SACH MOI DE THAY THE ---");
                    
                    System.out.print("Nhap loai sach moi (G - Giao trinh, T - Tieu thuyet): ");
                    char type = ' ';
                    try 
                    {
                        type = sc.nextLine().toLowerCase().charAt(0); 
                    } 
                    catch (StringIndexOutOfBoundsException e) 
                    {
                        System.out.println("Ban chua nhap loai sach!");
                        break;
                    }

                    Sach sachMoi = null;
                    switch (type) 
                    {
                        case 'g':
                            sachMoi = new SachGiaoTrinh();
                            sachMoi.Nhap();
                            break;
                        case 't':
                            sachMoi = new SachTieuThuyet();
                            sachMoi.Nhap();
                            break;
                        default:
                            System.out.println("Loai sach khong hop le.");
                            break;
                    }
                    if (sachMoi != null) 
                        qls.capNhatSach(maSachCu, sachMoi);
                    break;
                }
                case 4:
                {
                    System.out.print("Nhap vao ma sach muon tim: ");
                    String ms = sc.nextLine();
                    Sach sachTimThay = qls.timSach(ms);
                    
                    if(sachTimThay != null)
                    {
                        System.out.println("Tim thay sach:");
                        System.out.println(sachTimThay.toString()); 
                    }
                    else
                    {
                        System.out.println("Khong tim thay sach co ma " + ms);
                    }
                    break;
                }
                case 5:
                    qls.hienThiDanhSach();
                    break;
                case 6:
                {
                    System.out.print("Nhap vao ma sach can kiem tra ton kho: ");
                    String ms = sc.nextLine();
                    Sach sachKiemTra = qls.timSach(ms);
                    if (sachKiemTra != null) 
                    {
                        System.out.print("Nhap vao so luong ton kho toi thieu can kiem tra: ");
                        int soLuongToiThieu = sc.nextInt();
                        sc.nextLine();
                        boolean ketQua = sachKiemTra.kiemTraTonKho(soLuongToiThieu); 
                        if (ketQua) 
                            System.out.println("-> KET QUA: Sach '" + sachKiemTra.getTieuDe() + "' (SL: " + sachKiemTra.getSL() + ") DU ton kho (>= " + soLuongToiThieu + ").");
                        else 
                            System.out.println("-> KET QUA: Sach '" + sachKiemTra.getTieuDe() + "' (SL: " + sachKiemTra.getSL() + ") KHONG DU ton kho (< " + soLuongToiThieu + ").");
                        
                    } 
                    else 
                        System.out.println("Khong tim thay sach co ma: " + ms);
                    break;
                }
                case 7:
                {
                    System.out.print("Nhap vao ma sach can cap nhat vi tri: ");
                    String ms = sc.nextLine();
                    Sach sachCapNhat = qls.timSach(ms);
                    if (sachCapNhat != null) 
                    {
                        System.out.print("Nhap vao vi tri moi (Vi du: Ke A1, Khu B...): ");
                        String viTriMoi = sc.nextLine();
                        sachCapNhat.capNhatViTri(viTriMoi); 
                        System.out.println();
                    } 
                    else 
                        System.out.println("Khong tim thay sach co ma: " + ms);
                    break;
                }
                case 0:
                    System.out.println("Dang thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Nhap sai lua chon! Vui long chon lai!");
                    break;
            }
        }
        while (chon != 0);

        sc.close();
    }
}