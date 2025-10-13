public class Test 
{
    public static void main(String[] args) 
    {
        Sach s1 = new Sach("sach1", "Tiểu thuyết", "Hồ Văn Hoàng", 2020, 10);
        s1.hienThiThongTin();
        System.out.println();
        Sach s2 = new Sach();
        s2.setMaSach("sach2");
        s2.setTieuDe("Truyện Doraemon");
        s2.setTacGia("Fujiko Fujio");
        s2.setNamXB(2015);
        s2.setSL(1000);
        s2.hienThiThongTin();
    }
}
