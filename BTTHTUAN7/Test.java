package BTTUAN5;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       QuanLySach qls = new QuanLySach();
       qls.themSach(new SachTieuThuyet("S001", "Harry Potter", "J.K.Rowling", 2005, 10, 20000, "Trinh Thám", true));
       qls.themSach(new SachGiaoTrinh("S003", "Lập Trình Java", "Nguyễn Nguyệt Nga", 2015, 20,  20000, "Lthdt",  "Cao"));
       qls.hienThiDanhSach();
       System.out.print("Nhập mã sách muốn tìm: ");
       String masach = sc.nextLine();
       Sach timsach = qls.timKiemSach(masach);
       if (timsach != null)
            timsach.hienThiThongTin();
       else
            System.out.println("Không tìm thấy sách.");
       System.out.println("Nhập thông tin mã sách muốn cập nhật: ");
       String macnn = sc.nextLine();
       qls.capNhatSach(macnn, new SachTieuThuyet("S001", "ROnaldinho", "J.K.Rowling", 2005, 10, 20000, "Võng Sư", true));
       qls.hienThiDanhSach();
       System.out.println("Nhập thông tin sách muốn xóa: ");
       String mxoa = sc.nextLine();
       qls.xoaSach(mxoa);
       qls.hienThiDanhSach();
    }

}
