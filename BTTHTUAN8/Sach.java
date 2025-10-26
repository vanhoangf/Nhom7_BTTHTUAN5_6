package BTTHTUAN8;
public abstract class Sach implements IGiaBan, IKiemKe
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    public Sach()
    {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan)
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }


    public void hienThiThongTin()
    {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
    }

    public void setMaSach(String maSach)
    {
        this.maSach = maSach;
    }
    public String getMaSach()
    {
        return maSach;
    }

    public void setTieuDe(String tieuDe)
    {
        this.tieuDe = tieuDe;
    }
    public String getTieuDe()
    {
        return tieuDe;
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
    public String toString()
    {
        return "Mã sách: " + this.maSach +
                ", Tên sách: " + this.tieuDe +
                ", Tác giả: " + this.tacGia +
                ", Năm xuất bản: " + this.namXuatBan +
                ", Số lượng: " + this.soLuong +
                ", Giá cơ bản: " + this.giaCoBan;
    }
    @Override
    public abstract double tinhGiaBan();
    @Override
     public boolean kiemTraTonKho(int soLuongToiThieu)
    {
        return this.soLuong >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi)
    {
        System.out.println("Đã cập nhật vị trí của sách có tiêu đề '" + this.tieuDe + "' thành '" + viTriMoi + "'.");
    }
}
