import java.util.Scanner;

public interface IQuanLySach 
{
    public void themSach(Scanner sc);
    public void themSach(Sach sach);
    public void xoaSach(String maSach);
    public void capNhatSach(String maSach, Sach thongTinSachMoi);
    public Sach timSach(String maSach);
    public void hienThiDanhSach();
}