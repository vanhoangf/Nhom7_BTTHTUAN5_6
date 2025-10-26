package sach_tuan8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach implements IQuanLySach {
    private List<Sach> danhSachSach;
    private Scanner sc = new Scanner(System.in);

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach() {
        System.out.println("Nhập mã sách: ");
        String maSach = sc.nextLine();
        System.out.println("Nhập tiêu đề: ");
        String tieuDe = sc.nextLine();
        System.out.println("Nhập tác giả: ");
        String tacGia = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá cơ bản: ");
        double giaCoBan = Double.parseDouble(sc.nextLine());

        System.out.println("Chọn loại sách cần thêm:");
        System.out.println("1. Sách giáo trình");
        System.out.println("2. Sách tiểu thuyết");
        System.out.print("Lựa chọn: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        Sach sachMoi = null;

        if (luaChon == 1) {
            System.out.println("Nhập môn học: ");
            String monHoc = sc.nextLine();
            System.out.println("Nhập cấp độ: ");
            String capDo = sc.nextLine();

            sachMoi = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, monHoc, capDo);
        } else if (luaChon == 2) {
            System.out.println("Nhập thể loại: ");
            String theLoai = sc.nextLine();
            System.out.println("Nhập thông tin series (có/không hoặc tên series): ");
            String laSachSeries = sc.nextLine();

            sachMoi = new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, theLoai, laSachSeries);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        danhSachSach.add(sachMoi);
        System.out.println("Đã thêm sách mới thành công!\n");
    }

    @Override
    public void xoaSach(String maSach) {
        Sach sachCanXoa = timSach(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("✅ Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách có mã: " + maSach);
        }
    }

    @Override
    public void capNhatSach(String maSach, Sach thongTinSachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) {
                danhSachSach.set(i, thongTinSachMoi);
                System.out.println("✅ Đã cập nhật sách có mã: " + maSach);
                return;
            }
        }
        System.out.println("Không tìm thấy sách để cập nhật.");
    }

    @Override
    public Sach timSach(String maSach) {
        for (Sach sach : danhSachSach)
            if (sach.getMaSach().equals(maSach))
                return sach;
        return null;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("❗ Danh sách sách trống.");
            return;
        }
        System.out.println("\n======= DANH SÁCH SÁCH =======");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString());
            System.out.println("Giá bán ước tính: " + sach.tinhGiaBan() + " VNĐ");
            System.out.println("------------------------------");
        }
        System.out.println("==============================\n");
    }

    @Override
    public void themSach(Sach sach) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
