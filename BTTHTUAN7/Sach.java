package BTTHTUAN7;
public abstract class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;
    
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    /*public Sach()
    {  
    }*/

    public void hienThiThongTin()
    {
        System.out.println("Ma Sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So Luong: " + soLuong);
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
    public int getSL()
    {
        return soLuong;
    }
    public void setGiaCoBan(double giaCoBan) 
    {
        this.giaCoBan = giaCoBan;
    }
    public double getGiaCoBan() 
    {
        return this.giaCoBan;
    }
    @Override
    public String toString() 
    {
        return "Ma Sach: " + maSach +
            ", Tieu de: '" + tieuDe + 
            ", Tac gia: '" + tacGia + 
            ", Nam Xuat Ban: " + namXuatBan +
            ", So Luong: " + soLuong;
    }
    @Override
    public abstract double tinhGiaBan();
}
