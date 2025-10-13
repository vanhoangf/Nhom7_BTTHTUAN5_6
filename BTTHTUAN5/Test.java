package BTTUAN5;
public class Test
{
    public static void main(String[] args)
    {
        Sach s1 = new Sach("S01","Truyện tranh","Nguyễn Văn A",2015,10);
        s1.hienThiThongTin();
        System.out.println("----------------------");
        Sach s2 = new Sach();
        s2.setMaSach("S02");
        s2.setTenSach("Sách giáo khoa");
        s2.setTacGia("Nguyễn Văn B");
        s2.setNamXuatBan(2020);
        s2.setSoLuong(5);
        s2.hienThiThongTin();
    }
}
