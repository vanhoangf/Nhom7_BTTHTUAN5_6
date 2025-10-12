package BTTUAN5;
import java.util.ArrayList;
public class QuanLiSach
{
    private ArrayList<Sach> dsSach;

    public QuanLiSach()
    {
        dsSach = new ArrayList<>();
    }
    public void themSach(Sach sachCanThem)
    {
        for (Sach sachTrongDS : dsSach)
        {
            if (sachTrongDS.getMaSach().equals(sachCanThem.getMaSach()))
            {
                System.out.println("Lỗi: Sách có mã '" + sachCanThem.getMaSach() + "' đã tồn tại.");
                return;
            }
        }
        dsSach.add(sachCanThem);
        System.out.println("Đã thêm thành công sách: " + sachCanThem.getTenSach());
    }
    public void hienThiDanhSach()
    {
        if (dsSach.isEmpty())
        {
            System.out.println("Danh sách hiện đang trống.");
            return;
        }
        System.out.println("\n--- DANH SÁCH SÁCH ---");
        for (Sach sach : dsSach)
        {
            sach.hienThiThongTin();
            System.out.println("--------------------");
        }
    }
    public Sach timKiemSach(String maSach)
    {
        for (Sach sach : dsSach)
        {
            if (sach.getMaSach().equals(maSach))
            {
                return sach;
            }
        }
        return null;
    }
    public void capNhatSach(String maSachCanCapNhat, Sach thongTinMoi)
    {
        Sach sachCanTim = timKiemSach(maSachCanCapNhat);

        if (sachCanTim != null)
        {
            int index = dsSach.indexOf(sachCanTim);
            dsSach.set(index, thongTinMoi);
            System.out.println("Đã cập nhật thành công sách có mã: " + maSachCanCapNhat);
        }
        else
        {
            System.out.println("Không tìm thấy sách có mã '" + maSachCanCapNhat + "' để cập nhật.");
        }
    }
    public void xoaSach(String maSach)
    {

        for (int i = 0; i < dsSach.size(); i++)
        {
            if (dsSach.get(i).getMaSach().equals(maSach))
            {
                dsSach.remove(i);
                break;
            }
        }
    }
}
