package BTTUAN5;

public abstract class Sach
{
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    public Sach()
    {
    }

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong,double giaCoBan)
    {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }


    public void hienThiThongTin()
    {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
    }

    // setter trước rồi getter sau
    public void setMaSach(String maSach)
    {
        this.maSach = maSach;
    }
    public String getMaSach()
    {
        return maSach;
    }

    public void setTenSach(String tenSach)
    {
        this.tenSach = tenSach;
    }
    public String getTenSach()
    {
        return tenSach;
    }

    public void setTacGia(String tacGia)
    {
        this.tacGia = tacGia;
    }
    public String getTacGia()
    {
        return tacGia;
    }

    public void setNamXuatBan(int namXuatBan)
    {
        this.namXuatBan = namXuatBan;
    }
    public int getNamXuatBan()
    {
        return namXuatBan;
    }

    public void setSoLuong(int soLuong)
    {
        this.soLuong = soLuong;
    }
    public int getSoLuong()
    {
        return soLuong;
    }
    public void setGiaCoBan(double giaCoBan)
    {
        this.giaCoBan = giaCoBan;
    }
    public double getGiaCoBan()
    {
        return giaCoBan;
    }
    @Override
    public String toString() {
        return "Mã sách: " + this.maSach +
                ", Tên sách: " + this.tenSach +
                ", Tác giả: " + this.tacGia +
                ", Năm xuất bản: " + this.namXuatBan +
                ", Số lượng: " + this.soLuong +
                ", Giá cơ bản: " + this.giaCoBan;
    }
    public abstract double tinhGiaBan();
}
