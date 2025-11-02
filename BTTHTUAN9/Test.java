package BTTHTUAN9;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        IQuanLySach quanLy = new QuanLySachImpl();
        quanLy.themSach(new SachGiaoTrinh("GT001", "Toán Học Đại Cương", "Nguyễn Văn A", 2023, 10, 150000,"kệ 1A" ,"Toán", "Cấp 1"));
        quanLy.themSach(new SachTieuThuyet("TT001", "Truyện Kiều", "Nguyễn Văn B", 2023, 5, 120000,"kệ 1B", "Truyền thuyết", true));
        quanLy.themSach(new SachTieuThuyet("TT002", "Sách tiểu thuyết 2", "Nguyễn Văn C", 2023, 8, 90000,"kệ 2C", "Truyền thuyết", false));
        quanLy.hienThiDanhSach();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Cập nhật số lượng sách");
            System.out.println("5. Xóa sách");
            System.out.println("6. Kiểm tra tồn kho");
            System.out.println("7. Cập nhật vị trí sách");
            System.out.println("8. Tính giá bán");
            System.out.println("9. Hiển thị danh sách sách hết hàng");
            System.out.println("10. Tính tổng giá trị tồn kho");
            System.out.println("11. Thoát");
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
                    System.out.print("Vị trí: ");
                    String viTri = sc.nextLine();
                    sc.nextLine();
                    sachMoi.setMaSach(maSach);
                    sachMoi.setTieuDe(tieuDe);
                    sachMoi.setTacGia(tacGia);
                    sachMoi.setNamXuatBan(namXuatBan);
                    sachMoi.setSoLuong(soLuong);
                    sachMoi.setGiaCoBan(giaCoBan);
                    sachMoi.setViTri(viTri);
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
                    quanLy.timKiemSach(maTim);
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần cập nhật số lượng: ");
                    String maCapNhat = sc.nextLine();
                    Sach sachCanCapNhat = quanLy.timKiemSach(maCapNhat);
                    if (sachCanCapNhat != null)
                    {
                        System.out.print("Nhập số lượng mới: ");
                        int soLuongMoi = sc.nextInt();
                        sc.nextLine();
                        quanLy.capNhatSoLuongSach(maCapNhat, soLuongMoi);
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
                    System.out.print("Nhập số lượng tối thiểu để kiểm tra sách sắp hết: ");
                    int slToiThieu = sc.nextInt();
                    quanLy.hienThiDanhSachSapHetHang(slToiThieu);
                    break;
                case 10:
                    System.out.println("Tổng giá trị tồn kho: " + quanLy.tinhTongGiaTriTonKho());
                    break;
                case 11:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 11);
    }
}
