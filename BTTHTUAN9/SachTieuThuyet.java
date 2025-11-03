package BTTHTUAN9;

public class SachTieuThuyet extends Sach
{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,String viTri, String theLoai, boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giaCoBan,viTri);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public SachTieuThuyet()
    {
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
        return super.toString() + ", Thể loại: " + this.theLoai + ", Là sách series: " + this.laSachSeries +",giá bán:" + this.tinhGiaBan();
    }
    @Override
    public double tinhGiaBan()
    {
        if(this.laSachSeries)
            return this.giaCoBan + 15000;
        else
            return this.giaCoBan;
    }

}
