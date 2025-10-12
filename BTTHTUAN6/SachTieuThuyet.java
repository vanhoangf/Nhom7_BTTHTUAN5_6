package BTTUAN5;

public class SachTieuThuyet extends Sach
{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries)
    {
        super(maSach, tenSach, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai()
    {
        return theLoai;
    }
    public void setTheLoai(String theLoai)
    {
        this.theLoai = theLoai;
    }
    public boolean isLaSachSeries()
    {
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries)
    {
        this.laSachSeries = laSachSeries;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Thể loại: " + this.theLoai + ", Là sách series: " + this.laSachSeries;
    }
}
