package BTTHTUAN7;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       QuanLySach qls = new QuanLySach();

       qls.themSach(new SachTieuThuyet("MS001", "Harry Potter", "J.K.Rowling", 2005, 10, 15000, "Võng Sư", true));
       qls.themSach(new SachGiaoTrinh("MS002", "Lập Trình hướng đối tượng", "Trà My", 2015, 20,10000, "Lập Trình", "Cao"));
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
       qls.capNhatSach(macnn, new SachTieuThuyet("MS001", "Ronaldo", "J.K.Rowling", 2005, 10,30000, "Võng Sư", true));
       qls.hienThiDanhSach();
       
       System.out.println("Nhập thông tin sách muốn xóa: ");
       String mxoa = sc.nextLine();
       qls.xoaSach(mxoa);
       qls.hienThiDanhSach();
    }
}
