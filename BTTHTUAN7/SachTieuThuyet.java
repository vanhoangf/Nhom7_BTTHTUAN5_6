package sach;
public class SachTieuThuyet extends Sach
{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String thLoai, boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = thLoai;
        this.laSachSeries = laSachSeries;
    }
    public void setTheLoai(String theLoai)
    {
        this.theLoai = theLoai;
    } 
    public String getTheLoai()
    {
        return theLoai;
    }
    public void setLaSachSeries(boolean laSachSeries)
    {
        this.laSachSeries = laSachSeries;
    } 
    public boolean getLaSachSeries()
    {
        return laSachSeries;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", The loai: " + theLoai + ", La sach series: " + laSachSeries;
    }   
    @Override
    public double tinhGiaBan ()
    {
        if(laSachSeries)
            return giaCoBan+15000;
        else
            return giaCoBan;
    }
}
