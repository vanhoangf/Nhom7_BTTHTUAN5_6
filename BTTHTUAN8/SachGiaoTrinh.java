package BTTHTUAN8;

public class SachGiaoTrinh extends Sach
{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public SachGiaoTrinh()
    {
    }

     public void setMonHoc(String monHoc)
    {
        this.monHoc = monHoc;
    } 

    public String getMonHoc()
    {
        return monHoc;
    }

    public void setCapDo(String capDo)
    {
        this.capDo = capDo;
    } 

    public String getCapDo()
    {
        return capDo;
    }

    @Override
    public double tinhGiaBan()
    {
        return this.giaCoBan + (2025 - this.namXuatBan)*5000;
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nMôn học: " + monHoc + 
                                   "\nCấp độ: " + capDo +
                                   "\nGiá bán: " + this.tinhGiaBan();
    }
}