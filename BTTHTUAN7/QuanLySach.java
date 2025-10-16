package BTTHTUAN7;
import java.util.ArrayList;

public class QuanLySach 
{
    
    private ArrayList <Sach> danhSachSach;

    public QuanLySach() 
    {
        danhSachSach = new ArrayList<>();
    }
    
    public void themSach(Sach s) 
    {
        danhSachSach.add(s);
        System.out.println("Đã thêm sách: " + s.getMaSach());
    }
   
    public boolean xoaSach(String maSach) 
    {
        for (Sach s : danhSachSach) 
        {
            if (s.getMaSach().equals(maSach)) 
            {
                danhSachSach.remove(s);
                System.out.println("Đã xóa sách có mã: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) 
    {
        for (int i = 0; i < danhSachSach.size(); i++) 
        {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) 
            {
                danhSachSach.set(i, sachMoi);
                System.out.println("Đã cập nhật sách có mã: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    public Sach timKiemSach(String maSach) 
    {
        for (Sach s : danhSachSach) 
        {
            if (s.getMaSach().equals(maSach)) 
            {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() 
    {
        if (danhSachSach.isEmpty()) 
        {
            System.out.println("Danh sách sách trống!");
        } 
        else 
        {
            System.out.println("Danh sách các sách hiện có:");
            for (Sach s : danhSachSach) 
            {
                System.out.println("--------------------------------");
                System.out.println(s.toString());
            }
        }
    }
}
