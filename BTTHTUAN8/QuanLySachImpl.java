package BTTHTUAN8;
import java.util.ArrayList;
public class QuanLySachImpl implements IQuanLySach
{
    private ArrayList<Sach> dsSach;

    public QuanLySachImpl()
    {
        dsSach = new ArrayList<>();
    }
    @Override
    public void themSach(Sach sach)
    {
        for (Sach sachTrongDS : dsSach)
        {
            if (sachTrongDS.getMaSach().equals(sach.getMaSach()))
            {
                System.out.println("Lỗi: Sách có mã '" + sach.getMaSach() + "' đã tồn tại.");
                return;
            }
        }
        dsSach.add(sach);
        System.out.println("Đã thêm thành công sách: " + sach.getTieuDe());
    }


    @Override
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
            System.out.println(sach.toString());
        }
    }

    @Override
    public Sach timKiemSach(String maSach)
    {
        for (Sach sach : dsSach)
        {
            if (sach.getMaSach().equals(maSach))
            {
                System.out.println("Tìm thấy sách: " + sach.toString());
                return sach;
            }
        }
        System.out.println("Không tìm thấy sách có mã '" + maSach + "'");
        return null;
    }

    @Override
    public void capNhatSoLuongSach(String maSach, int soLuongMoi)
    {
        Sach sachCanTim = null;
        for (Sach sach : dsSach) {
            if (sach.getMaSach().equals(maSach))
            {
                sachCanTim = sach;
                break;
            }
        }

        if (sachCanTim != null)
        {
            sachCanTim.setSoLuong(soLuongMoi);
            System.out.println("Đã cập nhật số lượng sách có mã: " + maSach + " thành " + soLuongMoi);
        }
        else
        {
            System.out.println("Không tìm thấy sách có mã '" + maSach + "' để cập nhật.");
        }
    }

    @Override
    public void xoaSach(String maSach)
    {
    Sach sachCanXoa = null;
    for (Sach sach : dsSach)
    {
        if (sach.getMaSach().equals(maSach))
        {
            sachCanXoa = sach;
            break;
        }
    }

    if (sachCanXoa != null)
    {
        dsSach.remove(sachCanXoa);
        System.out.println("Đã xóa thành công sách có mã: " + maSach);
    }
    else
    {
        System.out.println("Không tìm thấy sách có mã '" + maSach + "' để xóa.");
    }
    }

}
