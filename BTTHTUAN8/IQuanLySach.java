package BTTHTUAN8;

public interface IQuanLySach
{
    public void themSach(Sach s);

    public boolean xoaSach(String maSach);

    public boolean capNhatSach(String maSach, Sach sachMoi);

    public Sach timKiemSach(String maSach);

    public void hienThiDanhSach();
}
