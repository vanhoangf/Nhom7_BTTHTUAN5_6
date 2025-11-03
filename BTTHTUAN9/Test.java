package BTTHTUAN9;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        IQuanLySach quanLy = new QuanLySachImpl();
        quanLy.themSach(new SachGiaoTrinh("GT001", "Sách giáo trình 1", "Lê Doãn Đàn", 2023, 20, 10000, "Toán", "Cấp 1"));
        quanLy.themSach(new SachTieuThuyet("TT001", "Sách tiểu thuyết 1", "Hồ Văn Hoàn", 2023, 35, 12000, "Truyền thuyết", true));
        quanLy.themSach(new SachTieuThuyet("TT002", "Sách tiểu thuyết 2", "Lê Đình Danh", 2023, 18, 9000, "Truyền thuyết", false));
        quanLy.hienThiDanhSach();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Cập nhật sách");
            System.out.println("5. Xóa sách");
            System.out.println("6. Kiểm tra tồn kho");
            System.out.println("7. Cập nhật vị trí sách");
            System.out.println("8. Tính giá bán");
            System.out.println("9. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon)
            {
                case 1:
                    System.out.println("Chọn loại sách muốn nhập:");
                    System.out.println("1. Sách Giáo Trình");
                    System.out.println("2. Sách Tiểu Thuyết");
                    System.out.print("Nhập lựa chọn (1 hoặc 2): ");

                    int loaiSach = sc.nextInt();
                    sc.nextLine();

                    Sach sachMoi;

                    if (loaiSach == 1)
                    {
                        sachMoi = new SachGiaoTrinh();
                        System.out.println("Nhập thông tin sách giáo trình:");
                    }
                    else if (loaiSach == 2)
                    {
                        sachMoi = new SachTieuThuyet();
                        System.out.println("Nhập thông tin sách tiểu thuyết:");
                    }
                    else
                    {
                        System.out.println("Lựa chọn không hợp lệ!");
                        break;
                    }

                    System.out.print("Mã sách: ");
                    String maSach = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String tieuDe = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int namXuatBan = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int soLuong = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaCoBan = sc.nextDouble();
                    sc.nextLine();
                    sachMoi.setMaSach(maSach);
                    sachMoi.setTieuDe(tieuDe);
                    sachMoi.setTacGia(tacGia);
                    sachMoi.setNamXB(namXuatBan);
                    sachMoi.setSL(soLuong);
                    sachMoi.setGiaCoBan(giaCoBan);
                    if (sachMoi instanceof SachGiaoTrinh)
                    {
                        System.out.print("Môn học: ");
                        String monHoc = sc.nextLine();
                        System.out.print("Cấp độ: ");
                        String capDo = sc.nextLine();
                        ((SachGiaoTrinh) sachMoi).setMonHoc(monHoc);
                        ((SachGiaoTrinh) sachMoi).setCapDo(capDo);
                    }
                    else
                        if (sachMoi instanceof SachTieuThuyet)
                    {
                        System.out.print("Thể loại: ");
                        String theLoai = sc.nextLine();
                        System.out.print("Là sách series (true/false): ");
                        boolean laSachSeries = sc.nextBoolean();
                        sc.nextLine();
                        ((SachTieuThuyet) sachMoi).setTheLoai(theLoai);
                        ((SachTieuThuyet) sachMoi).setLaSachSeries(laSachSeries);
                    }
                    quanLy.themSach(sachMoi);
                    break;

                case 2:
                    quanLy.hienThiDanhSach();
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    
                    Sach sachTimDuoc = quanLy.timKiemSach(maTim); 
                    
                    if (sachTimDuoc != null) 
                    {
                        System.out.println("Đã tìm thấy sách:");
                        System.out.println("--------------------------------");
                        System.out.println(sachTimDuoc.toString());
                    } 
                    System.out.println("Không tìm thấy sách có mã: " + maTim); 
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần cập nhật thông tin: ");
                    String maCapNhat = sc.nextLine();
                    Sach sachCanCapNhat = quanLy.timKiemSach(maCapNhat);

                    if (sachCanCapNhat != null)
                    {
                        System.out.println("Bạn muốn cập nhật thông tin nào cho sách [" + sachCanCapNhat.getTieuDe() + "]?");
                        System.out.println("1. Tiêu đề");
                        System.out.println("2. Tác giả");
                        System.out.println("3. Năm xuất bản");
                        System.out.println("4. Số lượng");
                        System.out.println("5. Giá cơ bản");
                        System.out.print("Chọn (1-5): ");

                        int chonThongTin = sc.nextInt();
                        sc.nextLine(); 

                        switch (chonThongTin) 
                        {
                            case 1:
                                System.out.print("Nhập Tiêu đề mới: ");
                                String tieuDeMoi = sc.nextLine();
                                sachCanCapNhat.setTieuDe(tieuDeMoi);
                                System.out.println("Đã cập nhật Tiêu đề.");
                                break;
                            case 2:
                                System.out.print("Nhập Tác giả mới: ");
                                String tacGiaMoi = sc.nextLine();
                                sachCanCapNhat.setTacGia(tacGiaMoi);
                                System.out.println("Đã cập nhật Tác giả.");
                                break;
                            case 3:
                                System.out.print("Nhập Năm xuất bản mới: ");
                                int namXB_Moi = sc.nextInt();
                                sachCanCapNhat.setNamXB(namXB_Moi);
                                System.out.println("Đã cập nhật Năm xuất bản.");
                                sc.nextLine();
                                break;
                            case 4:
                                System.out.print("Nhập Số lượng mới: ");
                                int soLuongMoi = sc.nextInt();
                                sachCanCapNhat.setSL(soLuongMoi);
                                System.out.println("Đã cập nhật Số lượng.");
                                sc.nextLine();
                                break;
                            case 5:
                                System.out.print("Nhập Giá cơ bản mới: ");
                                double giaCoBanMoi = sc.nextDouble();
                                sachCanCapNhat.setGiaCoBan(giaCoBanMoi);
                                System.out.println("Đã cập nhật Giá cơ bản.");
                                sc.nextLine();
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ.");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    quanLy.xoaSach(maXoa);
                    break;

                case 6:
                    System.out.print("Nhập mã sách cần kiểm tra: ");
                    String maKT = sc.nextLine();
                    System.out.print("Nhập số lượng tối thiểu: ");
                    int sl = sc.nextInt();

                    Sach sachKT = quanLy.timKiemSach(maKT);
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
                    Sach sachViTri = quanLy.timKiemSach(maCapNhatViTri);
                    if (sachViTri != null)
                    {
                        sachViTri.capNhatViTri(viTriMoi);
                    }
                    break;

                case 8:
                    System.out.print("Nhập mã sách cần tính giá bán: ");
                    String maTinhGiaBan = sc.nextLine();
                    Sach sachGiaBan = quanLy.timKiemSach(maTinhGiaBan);
                    if (sachGiaBan != null)
                    {
                        double giaBan = sachGiaBan.tinhGiaBan();
                        System.out.println("Giá bán của sách '" + sachGiaBan.getTieuDe() + "' là: " + giaBan);
                    }
                    break;
                case 9:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 9);
    }
}