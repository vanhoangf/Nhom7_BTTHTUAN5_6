 package BTTHTUAN8;

 public class SachTieuThuyet extends Sach
 {
    private String theLoai;
    private Boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan, String theLoai, boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public SachTieuThuyet()
    {
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
    public double tinhGiaBan()
    {
        if (laSachSeries)
            return this.giaCoBan + 15000;
        else
            return this.giaCoBan;
    }

    @Override
    public String toString()    
    {
        return super.toString() + "\nThể loại: " + theLoai + 
                                   "\nLà sách series: " + laSachSeries +
                                   "\nGiá bán: " + this.tinhGiaBan();
    }
 }
