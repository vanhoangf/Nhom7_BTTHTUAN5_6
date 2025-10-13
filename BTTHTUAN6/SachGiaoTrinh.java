
package sach;

public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;
    
    public SachGiaoTrinh()
    {
        super();
    }
    public SachGiaoTrinh( String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    public String getMonHoc() 
    {
        return monHoc;
    }
    public void setMonHoc(String monHoc)
    {
        this.monHoc=monHoc;
    }
    public String getCapDo() 
    {
        return capDo;
    }
    public void setCapDo(String capDo)
    {
        this.capDo = capDo;
    }
    
    public String toString() 
    {
        return maSach + "\t" + tieuDe + "\t" + tacGia + "\t" + namXuatBan + "\t" + soLuong + "\t" + monHoc + "\t" + capDo;
    }
    @Override
    public void hienThiThongTin() 
    {
        super.hienThiThongTin(); 
        System.out.println("Mon hoc: " + (monHoc != null ? monHoc : "--"));
        System.out.println("Cap do: " + (capDo != null ? capDo : "--"));
        System.out.println("---------------------------------");
    }
}
