
package sach_tuan8;

public interface IQuanLySach {
    void themSach();
    void themSachCoSan(Sach sach);
    Sach timSach(String MaSach);
    void xoaSach(String maSach);
    void capNhatSoLuongSach(String maSach, int soLuongMoi);
    void hienThiDanhSach();
    
}
