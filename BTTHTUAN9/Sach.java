package BTTHTUAN9;
public abstract class Sach implements IGiaBan, IKiemKe
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    protected String viTri;
    public Sach()
    {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan,  String viTri)
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
        this.viTri = viTri;
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
    public void setViTri(String viTri)
    {
        this.viTri = viTri;
    }
    public String getViTri()
    {
        return viTri;
    }
    @Override
    public String toString()
    {
        return "Mã sách: " + this.maSach +
                ", Tên sách: " + this.tieuDe +
                ", Tác giả: " + this.tacGia +
                ", Năm xuất bản: " + this.namXuatBan +
                ", Số lượng: " + this.soLuong +
                ", Giá cơ bản: " + this.giaCoBan +
                ", Vị trí: " + this.viTri;
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
        this.viTri=viTriMoi;
        System.out.println("Đã cập nhật vị trí của sách có tiêu đề '" + this.tieuDe + "' thành '" + viTriMoi + "'.");
    }
}
