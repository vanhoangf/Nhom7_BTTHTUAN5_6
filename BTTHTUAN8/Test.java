package sach_tuan8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();
        SachGiaoTrinh sgk1 = new SachGiaoTrinh("SGK01", "Lap trinh huong doi tuong", "Khoa CNTT", 2024, 100, 5000, "Lap trinh  Java", "Dai Hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("STT01", "De Men Phieu Luu Ky", "To Hoai", 1941, 50,5000, "Thieu Nhi", false);
        SachTieuThuyet stt2 = new SachTieuThuyet("STT02", "Harry Potter va Hon Da Phu Thuy", "J.K. Rowling", 1997, 75,10000, "Fantasy", true);

        qls.themSachCoSan(sgk1);
        qls.themSachCoSan(stt1);
        qls.themSachCoSan(stt2);
        
        int luaChon;

        do {
            System.out.println("\n=========== MENU QUAN LY SACH ===========");
            System.out.println("1. Them sach moi");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Cap nhat thong tin sach");
            System.out.println("6. Kiem ke ton kho");
            System.out.println("7: Cap nhat vi tri sach");
            System.out.println("8.Tinh gia ban sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon : ");

            luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    qls.themSach();
                    break;
                case 2:
                    qls.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = qls.timSach(maTim);
                    if (s != null) {
                        System.out.println("Da tim thay: ");
                        System.out.println(s.toString());
                        System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VNĐ");
                    } else {
                        System.out.println("Khong tim thay sach co ma " + maTim);
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    qls.xoaSach(maXoa);
                    break;
                case 5:
                    System.out.print("Nhập mã sách cần cập nhật số lượng: ");
                    String maCapNhat = sc.nextLine();
                    Sach sachCanCapNhat = qls.timSach(maCapNhat);
                    if (sachCanCapNhat != null)
                    {
                        System.out.print("Nhập số lượng mới: ");
                        int soLuongMoi = sc.nextInt();
                        sc.nextLine();
                        qls.capNhatSoLuongSach(maCapNhat, soLuongMoi);
                    }
                    break;
                case 6:
                    System.out.print("Nhập mã sách cần kiểm tra: ");
                    String maKT = sc.nextLine();
                    System.out.print("Nhập số lượng tối thiểu: ");
                    int sl = sc.nextInt();

                    Sach sachKT = qls.timSach(maKT);
                    if (sachKT != null)
                    {
                        boolean duHang = sachKT.kiemTraTonKho(sl);
                        if (duHang)
                        {
                            System.out.println("Sách '" + sachKT.getTieuDe() + "' còn đủ hàng (tối thiểu " + sl + " quyển)");
                        }
                        else
                        {
                            System.out.println("Sách '" + sachKT.getTieuDe() + "' sắp hết hàng (dưới " + sl + " quyển)");
                        }
                    }
                    break;

                case 7:
                    System.out.print("Nhập mã sách cần cập nhật vị trí: ");
                    String maCapNhatViTri = sc.nextLine();
                    System.out.print("Nhập vị trí mới: ");
                    String viTriMoi = sc.nextLine();
                    Sach sachViTri = qls.timSach(maCapNhatViTri);
                    if (sachViTri != null)
                    {
                        sachViTri.capNhatViTri(viTriMoi);
                    }
                    break;

                case 8:
                    System.out.print("Nhập mã sách cần tính giá bán: ");
                    String maTinhGiaBan = sc.nextLine();
                    Sach sachGiaBan = qls.timSach(maTinhGiaBan);
                    if (sachGiaBan != null)
                    {
                        double giaBan = sachGiaBan.tinhGiaBan();
                        System.out.println("Giá bán của sách '" + sachGiaBan.getTieuDe() + "' là: " + giaBan);
                    }
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 0);
    }
}
