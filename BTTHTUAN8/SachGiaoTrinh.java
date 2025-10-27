package BTTHTUAN8;

public class SachGiaoTrinh extends Sach
{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan, String monHoc, String capDo)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    public SachGiaoTrinh()
    {
    }
    public String getMonHoc()
    {
        return monHoc;
    }
    public void setMonHoc(String monHoc)
    {
        this.monHoc = monHoc;
    }
    public String getCapDo()
    {
        return capDo;
    }
    public void setCapDo(String capDo)
    {
        this.capDo = capDo;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Môn học: " + this.monHoc + ", Cấp độ: " + this.capDo +",giá bán:" + this.tinhGiaBan();
    }
    @Override
    public double tinhGiaBan()
    {
        int sonamxuatban;
        sonamxuatban=2025-this.namXuatBan;
        return this.giaCoBan +(sonamxuatban*5000);
    }

}
