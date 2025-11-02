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
    public SachGiaoTrinh() {}
    
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

    public void Nhap()
    {
        super.Nhap();
        sc.nextLine();
        System.out.print("Nhap vao mon hoc: ");
        this.monHoc = sc.nextLine();
        System.out.print("Nhap vao cap do: ");
        this.capDo = sc.nextLine();
    }

     @Override
    public double tinhGiaBan()
    {
        int soNamXB = 2025 - this.getNamXB();
        return this.getGiaCoBan() + (soNamXB * 5000);
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Mon hoc: " + monHoc + ", Cap do: " + capDo + ", Gia Ban: " + this.tinhGiaBan();
    }
}
