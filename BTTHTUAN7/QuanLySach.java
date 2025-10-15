package BTTHTUAN7;
import java.util.ArrayList;
import java.util.List;

public class QuanLySach
{
    private List<Sach> danhSachSach;

    public QuanLySach() 
    {
        danhSachSach = new ArrayList<>();
    }
      
    public void themSach(Sach sach) 
    {
        danhSachSach.add(sach);
        System.out.println("Đa them sach: " + sach.getTieuDe());
    }

    public void xoaSach(String maSach) 
    {
        Sach sachCanXoa = timSach(maSach);
        if (sachCanXoa != null) 
        {
            danhSachSach.remove(sachCanXoa);
            System.out.println("Đa xoa sach co ma: " + maSach);
        } 
        else 
            System.out.println("Khong tim thay sach co ma: " + maSach);
    }

    public void capNhatSach(String maSach, Sach thongTinSachMoi) 
    {
        for (int i = 0; i < danhSachSach.size(); i++) 
        {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) 
            {
                danhSachSach.set(i, thongTinSachMoi);
                System.out.println("Da cap nhat sach co ma: " + maSach);
                return;
            }
        }
        System.out.println("Khong tim thay sach de cap nhat.");
    }

    public Sach timSach(String maSach) 
    {
        for (Sach sach : danhSachSach) 
            if (sach.getMaSach().equals(maSach)) 
                return sach;
        return null; 
    }

    public void hienThiDanhSach() 
    {
        if (danhSachSach.isEmpty()) 
        {
            System.out.println("Danh sach sach trong.");
            return;
        }
        System.out.println("======= DANH SACH SACH =======");
        for (Sach sach : danhSachSach) 
        {
            System.out.println(sach.toString()); 
        }
        System.out.println("==============================");
    }
}
