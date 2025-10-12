package sach;

public class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong; 

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    
    public Sach(String maSach, String tacGia, int soLuong) 
    {
        this.maSach = maSach;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
    }

    public Sach(String maSach, String tieuDe, String tacGia) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
    }
    
    
    public String getmaSach()
    {
        return maSach;
    }
    public void setmaSach(String maSach)
    {
        this.maSach=maSach;
    }
    public String gettieuDe()
    {
        return tieuDe;
    }
    public void settieuDe(String tieuDe)
    {
        this.tieuDe=tieuDe;
    }
    public String gettacGia()
    {
        return tacGia;
    }
    public void settacGia(String tacGia)
    {
        this.tacGia=tacGia;
    }
    public int getnamXuatBan()
    {
        return namXuatBan;
    }
    public void setnamXuatBan(int namXuatBan)
    {
        this.namXuatBan=namXuatBan;
    }
    public int getsoLuong()
    {
        return soLuong;
    }
    public void setsoLuong(int soLuong)
    {
        this.soLuong=soLuong;
    }
    
    public void hienThi() 
    {
        System.out.println("Ma sach: " + (maSach != null ? maSach : "--"));
        System.out.println("Tieu de: " + (tieuDe != null ? tieuDe : "--"));
        System.out.println("Tac gia: " + (tacGia != null ? tacGia : "--"));
        System.out.println("Nam xuat ban: " + (namXuatBan != 0 ? namXuatBan : "--"));
        System.out.println("So luong: " + (soLuong != 0 ? soLuong : "--"));
    }

    
}