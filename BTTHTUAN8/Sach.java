package BTTHTUAN8;

public abstract class Sach implements IGiaBan, IKiemKe
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public Sach()
    {  
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

    public void setNamXB(int namXuatBan) 
    {
        this.namXuatBan = namXuatBan;
    }
    public int getNamXB() 
    {
        return namXuatBan;
    }

    public void setSL(int soLuong) 
    {
        this.soLuong = soLuong;
    }
    public int getSL() {
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
        return "Mã sách: " + maSach +
               "\nTiêu đề: " + tieuDe +
               "\nTác giả: " + tacGia +
               "\nNăm xuất bản: " + namXuatBan +
               "\nSố lượng: " + soLuong;
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
        System.out.println("Đã chuyển sách ["+ this.tieuDe +"] đến khu vực [" + viTriMoi + "]");
    }

}
