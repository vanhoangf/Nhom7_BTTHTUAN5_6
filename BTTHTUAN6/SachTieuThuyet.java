package Nhom7_BTHI.J_Test;
public class SachTieuThuyet extends Sach
{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String thLoai, boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
}
