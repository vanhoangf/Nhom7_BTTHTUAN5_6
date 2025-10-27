package BTTHTUAN8;

public interface IQuanLySach
{
    void themSach(Sach sach);
    void hienThiDanhSach();
    Sach timKiemSach(String maSach);
    void  capNhatSoLuongSach(String maSach, int soluongMoi);
    void xoaSach(String maSach);
}
