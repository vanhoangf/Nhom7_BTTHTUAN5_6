package sach_tuan8;
public class Test {
    public static void main(String[] args) 
    {
        IQuanLySach qls = new QuanLySach();

        SachGiaoTrinh sgk1 = new SachGiaoTrinh("SGK01", "Lap trinh huong doi tuong", "Khoa CNTT", 2024, 100, 5000, "Lap trinh  Java", "Dai Hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("STT01", "De Men Phieu Luu Ky", "To Hoai", 1941, 50,5000, "Thieu Nhi", false);
        SachTieuThuyet stt2 = new SachTieuThuyet("STT02", "Harry Potter va Hon Da Phu Thuy", "J.K. Rowling", 1997, 75,10000, "Fantasy", true);

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

        SachTieuThuyet stt1_moi = new SachTieuThuyet("STT01", "De Men Phieu Luu Ky (Tai ban)", "To Hoai", 2020, 150,15000, "Thieu Nhi", false);
        qls.capNhatSach("STT01", stt1_moi);
        qls.hienThiDanhSach();
        System.out.println();

        System.out.println("--- XOA SACH ---");
        qls.xoaSach("SGK01");
        qls.hienThiDanhSach();
        
        // --- Kiểm tra giao diện IKiemKe ---
        System.out.println("=== KIEM TRA GIAO DIEN IKiemKe ===");

        IKiemKe kiemKe = new SachGiaoTrinh("SGK02", "cau truc du lieu", "Tran Thi B", 
                                           2023, 90, 50000, "Lap trinh C", "Dai hoc");

        boolean duTonKho = kiemKe.kiemTraTonKho(100);
        System.out.println("Du ton kho (≥100)? " + duTonKho);

        kiemKe.capNhatViTri("Kho A1 - Ke 5");
    }
}
