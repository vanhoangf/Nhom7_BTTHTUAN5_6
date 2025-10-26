
package sach_tuan8;

public interface IQuanLySach {
    void themSach(Sach sach);
    Sach timSach(String MaSach);
    void xoaSach(String maSach);
    void capNhatSach(String maSach, Sach thongTinSachMoi);
    void hienThiDanhSach();
}
