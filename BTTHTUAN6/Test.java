package Nhom7_BTHI.J_Test;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) 
    {
        QuanLySach qls = new QuanLySach();

        SachGiaoTrinh sgk1 = new SachGiaoTrinh("SGK01", "Lap trinh huong doi tuong", "Khoa CNTT", 2024, 100, "Lap trinh  Java", "Dai Hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("STT01", "De Men Phieu Luu Ky", "To Hoai", 1941, 50, "Thieu Nhi", false);
        SachTieuThuyet stt2 = new SachTieuThuyet("STT02", "Harry Potter va Hon Da Phu Thuy", "J.K. Rowling", 1997, 75, "Fantasy", true);

        qls.themSach(sgk1);
        qls.themSach(stt1);
        qls.themSach(stt2);
        System.out.println();

        qls.hienThiDanhSach();
        System.out.println();

        System.out.println("--- TIM KIEM SACH ---");
        String maCanTim = "STT01";
        Sach ketQuaTim = qls.timSach(maCanTim);
        if (ketQuaTim != null) 
            System.out.println("Tim thay sach: " + ketQuaTim.toString());
        else 
            System.out.println("Khong tim thay sach co ma " + maCanTim);
        System.out.println();

        SachTieuThuyet stt1_moi = new SachTieuThuyet("STT01", "De Men Phieu Luu Ky (Tai ban)", "To Hoai", 2020, 150, "Thieu Nhi", false);
        qls.capNhatSach("STT01", stt1_moi);
        qls.hienThiDanhSach();
        System.out.println();

        System.out.println("--- XOA SACH ---");
        qls.xoaSach("SGK01");
        qls.hienThiDanhSach();
    }
}