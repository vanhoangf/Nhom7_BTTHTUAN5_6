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
    @Override
    public void themSach() {
        System.out.println("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.println("Nhap tieu de: ");
        String tieuDe = sc.nextLine();
        System.out.println("Nhap tac gia ");
        String tacGia = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia co ban: ");
        double giaCoBan = Double.parseDouble(sc.nextLine());

        System.out.println("Chon loai sach can them:");
        System.out.println("1. Sach giao trinh");
        System.out.println("2. Sach tieu thuyet");
        System.out.print("Lựa chọn: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        Sach sachMoi = null;

        if (luaChon == 1) {
            System.out.println("Nhap mon hoc: ");
            String monHoc = sc.nextLine();
            System.out.println("Nhap cap do: ");
            String capDo = sc.nextLine();

            sachMoi = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, monHoc, capDo);
        } else if (luaChon == 2) {
            System.out.println("Nhap the loai: ");
            String theLoai = sc.nextLine();
            System.out.println("Nhập thông tin series (có/không hoặc tên series): ");
            String laSachSeries = sc.nextLine();

            sachMoi = new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, theLoai, laSachSeries);
        } else {
            System.out.println("Lua chon khong hop le!");
            return;
        }

        danhSachSach.add(sachMoi);
        System.out.println("Da them thanh cong!\n");
    }
    public void themSachCoSan(Sach sach) {
    danhSachSach.add(sach);
}

    @Override
    public void xoaSach(String maSach) {
        Sach sachCanXoa = timSach(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

     @Override
    public void capNhatSoLuongSach(String maSach, int soLuongMoi)
    {
        Sach sachCanTim = null;
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach))
            {
                sachCanTim = sach;
                break;
            }
        }

        if (sachCanTim != null)
        {
            sachCanTim.setSoLuong(soLuongMoi);
            System.out.println("Đã cập nhật số lượng sách có mã: " + maSach + " thành " + soLuongMoi);
        }
        else
        {
            System.out.println("Không tìm thấy sách có mã '" + maSach + "' để cập nhật.");
        }
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
            System.out.println("❗ Danh sach trong.");
            return;
        }
        System.out.println("\n======= DANH SACH SACH =======");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString());
            System.out.println("Gia ban uoc tinh: " + sach.tinhGiaBan() + " VND");
            System.out.println("------------------------------");
        }
        System.out.println("==============================\n");
    }
    
    
    
}
