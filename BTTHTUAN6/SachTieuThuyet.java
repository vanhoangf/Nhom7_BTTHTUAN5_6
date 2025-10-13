 package BTTHTUAN6;

 public class SachTieuThuyet extends Sach
 {
    private String theLoai;
    private Boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, Boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
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
        return super.toString() + "\nThể loại: " + theLoai + 
                                   "\nLà sách series: " + laSachSeries;
    }
 }
