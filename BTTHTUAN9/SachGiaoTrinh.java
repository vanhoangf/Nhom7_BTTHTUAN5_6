package sach;
public class SachGiaoTrinh extends Sach implements IKiemKe
{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
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
    public String toString()
    {
        return super.toString() + ", Mon hoc: " + monHoc + ", Cap do: " + capDo;
    }
    @Override
    public double tinhGiaBan ()
    {
        int soNamXuatBan=2025-getNamXuatBan();
        return  getGiaCoBan()+(soNamXuatBan*5000);
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        if(this.soLuong >= soLuongToiThieu)
            return true;
        else 
            return false;
    }
    @Override
    public void capNhatViTri(String viTriMoi){
        System.out.println("Đã chuyển sách" + this.tieuDe + "đến khu vực:" + viTriMoi);
}
}
