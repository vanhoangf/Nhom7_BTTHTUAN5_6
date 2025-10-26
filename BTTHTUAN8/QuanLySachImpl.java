package BTTHTUAN8;
import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach 
{
    
    private ArrayList <Sach> danhSachSach;

    public QuanLySachImpl() 
    {
        danhSachSach = new ArrayList<>();
    }
    
    @Override
    public void themSach(Sach s) 
    {
        for(Sach sach : danhSachSach) 
        {
            if (sach.getMaSach().equals(s.getMaSach())) 
            {
                System.out.println("Sách với mã " + s.getMaSach() + " đã tồn tại. Không thể thêm.");
                return;
            }
        }
        danhSachSach.add(s);
        System.out.println("Đã thêm sách: " + s.getMaSach());
    }
   
    @Override
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

    @Override
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

    @Override
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

    @Override
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
