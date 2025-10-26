import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySachImpl implements IQuanLySach
{
    private List<Sach> danhSachSach;

    public QuanLySachImpl() 
    {
        danhSachSach = new ArrayList<>();
    }

    public void Nhap(Scanner sc)
    {
        Sach sach = null;
        System.out.print("Nhap ki tu G la sach giao trinh, ki tu T la sach tieu thuyet: ");
        char type = ' ';
        
        try 
        {
            type = sc.nextLine().toLowerCase().charAt(0);
        } 
        catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println("Ban chua nhap loai sach!");
            return;
        }

        switch (type) 
        {
            case 'g':
                sach = new SachGiaoTrinh();
                sach.Nhap();
                this.themSach(sach);
                break;
            case 't':
                sach = new SachTieuThuyet();
                sach.Nhap();
                this.themSach(sach);
                break;
            default:
                System.out.println("Nhap sai loai sach!");
                break;
        }
    }

    @Override 
    public void themSach(Sach sach) 
    {      
        if (timSach(sach.getMaSach()) != null) 
        {
            System.out.println("Ma sach " + sach.getMaSach() + " da ton tai.");
            return;
        }
        danhSachSach.add(sach);
        System.out.println("Da them sach: " + sach.getTieuDe());
    }
    @Override
    public void xoaSach(String maSach) 
    {
        Sach sachCanXoa = timSach(maSach);
        if (sachCanXoa != null) 
        {
            danhSachSach.remove(sachCanXoa);
            System.out.println("Da xoa sach co ma: " + maSach);
        } 
        else 
            System.out.println("Khong tim thay sach co ma: " + maSach + " de xoa");
    }
    @Override
    public void capNhatSach(String maSach, Sach thongTinSachMoi) 
    {
        Sach sachTrungID = timSach(thongTinSachMoi.getMaSach());
        
        if (sachTrungID != null && !sachTrungID.getMaSach().equals(maSach)) 
        {
            System.out.println("Loi: Ma sach moi '" + thongTinSachMoi.getMaSach() + "' da ton tai cho mot cuon sach khac.");
            System.out.println("Cap nhat that bai.");
            return;
        }

        for (int i = 0; i < danhSachSach.size(); i++) 
        {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) 
            {
                danhSachSach.set(i, thongTinSachMoi);
                System.out.println("Da cap nhat thanh cong cho sach co ma: " + maSach);
                return;
            }
        }
        
        System.out.println("Khong tim thay sach co ma: " + maSach + " de cap nhat.");
    }
    @Override
    public Sach timSach(String maSach) 
    {
        for (Sach sach : danhSachSach) 
            if (sach.getMaSach().equals(maSach)) 
                return sach;
        return null; 
    }
    @Override
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
