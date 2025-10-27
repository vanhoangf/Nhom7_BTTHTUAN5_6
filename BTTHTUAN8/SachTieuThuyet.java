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
    public SachTieuThuyet() {}
    
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
    public boolean isLaSachSeries()
    {
        return laSachSeries;
    }

    public void Nhap()
    {
        super.Nhap();
        sc.nextLine();
        System.out.print("Nhap vao the loai: ");
        this.theLoai = sc.nextLine();
        System.out.print("Nhap vao true neu la sach seri nguoc lai nhap false: ");
        this.laSachSeries = sc.nextBoolean();
        sc.nextLine();
    }

    @Override
    public double tinhGiaBan()
    {
        int soNamXB = 2025 - this.getNamXB();
        if (this.isLaSachSeries())
            return this.getGiaCoBan() + 15000;
        else
            return this.getGiaCoBan();
    }
    @Override
    public String toString()
    {
        return super.toString() + ", The loai: " + theLoai + ", La sach series: " + laSachSeries + ", Gia Ban: " + this.tinhGiaBan();
    }    
}
