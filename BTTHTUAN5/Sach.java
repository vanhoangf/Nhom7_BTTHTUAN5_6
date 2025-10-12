public class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    int namXuatBan;
    int soLuong;
    
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
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
    public String getMaSach(String maSach)
    {
        return maSach;
    }

    public void setTieuDe(String tieuDe)
    {
        this.tieuDe = tieuDe;
    }
    public String getTieuDe(String tieuDe)
    {
        return tieuDe;
    }

    public void setTacGia(String tacGia)
    {
        this.tacGia = tacGia;
    }
    public String getTacGia(String tacGia)
    {
        return tacGia;
    }

    public void setNamXB(int namXuatBan)
    {
        this.namXuatBan = namXuatBan;
    }
    public int getNamXB(int namXuatBan)
    {
        return namXuatBan;
    }

    public void setSL(int soLuong)
    {
        this.soLuong = soLuong;
    }
    public int getSL(int soLuong)
    {
        return soLuong;
    }
}