package BTTHTUAN9;
import java.util.HashMap;
import java.util.Map;
public class QuanLySachImpl implements IQuanLySach
{
    private Map<String, Sach> dsSach;

    public QuanLySachImpl()
    {
        dsSach = new HashMap<>();
    }

    @Override
    public void themSach(Sach sach)
    {
        if (dsSach.containsKey(sach.getMaSach()))
        {
            System.out.println("Lỗi: Sách có mã '" + sach.getMaSach() + "' đã tồn tại.");
            return;
        }
        dsSach.put(sach.getMaSach(), sach);
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
        for (Sach sach : dsSach.values())
        {
            System.out.println(sach.toString());
        }
    }

    @Override
    public Sach timKiemSach(String maSach)
    {
        if (dsSach.containsKey(maSach))
        {
            Sach sach = dsSach.get(maSach);
            System.out.println("Tìm thấy sách: " + sach.toString());
            return sach;
        }
        System.out.println("Không tìm thấy sách có mã '" + maSach + "'");
        return null;
    }

    @Override
    public void capNhatSoLuongSach(String maSach, int soLuongMoi)
    {
        if (dsSach.containsKey(maSach))
        {
            Sach sach = dsSach.get(maSach);
            sach.setSoLuong(soLuongMoi);
            System.out.println("Đã cập nhật số lượng sách có mã: " + maSach + " thành " + soLuongMoi);
            return;
        }
        System.out.println("Không tìm thấy sách có mã '" + maSach + "' để cập nhật.");
    }

    @Override
    public void xoaSach(String maSach)
    {
        if (dsSach.containsKey(maSach))
        {
            dsSach.remove(maSach);
            System.out.println("Đã xóa thành công sách có mã: " + maSach);
        }
        else
        {
            System.out.println("Không tìm thấy sách có mã '" + maSach + "' để xóa.");
        }
    }
    
    @Override
    public void hienThiDanhSachSapHetHang(int soLuongToiThieu)
    {
        System.out.println("\n--- DANH SÁCH SÁCH SẮP HẾT HÀNG ---");
        for (Sach sach : dsSach.values())
        {
            if (sach.getSoLuong() <= soLuongToiThieu)
            {
                System.out.println(sach.toString());
            }
        }
    }

    @Override
    public double tinhTongGiaTriTonKho()
    {
        double tongGiaTri = 0;
        for (Sach sach : dsSach.values())
        {
            tongGiaTri += sach.tinhGiaBan() * sach.getSoLuong();
        }
        return tongGiaTri;
    }

}
