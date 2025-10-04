package BTTUAN5;

public class Sach
{
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach()
    {
    }

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong)
    {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public Sach(String maSach, String tenSach, int namXuatBan)
    {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
    }

    public Sach(String maSach, String tenSach, int soLuong)
    {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
    }

    public Sach (String maSach, String tenSach)
    {
        this.maSach = maSach;
        this.tenSach = tenSach;
    }

    public String getMaSach()
    {
        return maSach;
    }

    public void setMaSach(String maSach)
    {
        this.maSach = maSach;
    }

    public String getTenSach()
    {
        return tenSach;
    }

    public void setTenSach(String tenSach)
    {
        this.tenSach = tenSach;
    }

    public String getTacGia()
    {
        return tacGia;
    }

    public void setTacGia(String tacGia)
    {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan()
    {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan)
    {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong()
    {
        return soLuong;
    }

    public void setSoLuong(int soLuong)
    {
        this.soLuong = soLuong;
    }

    public void hienThiThongTin()
    {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
    }
}