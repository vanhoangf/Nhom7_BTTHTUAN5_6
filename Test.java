package BTTUAN5;

public class Test {
    public static void main(String[] args) {
        Sach s1 = new Sach("MS001", "truyen tranh", "Nguyen Van B", 2000, 100);
        s1.hienThiThongTin();

        Sach s2 = new Sach();
        s2.setMaSach("MS002");
        s2.setTenSach("tieu thuyet");
        s2.setNamXuatBan(2020);
        s2.hienThiThongTin();
        
        Sach s3 = new Sach();
        s3.setMaSach("MS003");
        s3.setTenSach("giao khoa");
        s3.setSoLuong(50);
        s3.hienThiThongTin();

        Sach s4 = new Sach();
        s4.setMaSach("MS004");
        s4.setTenSach("khoa hoc");
        s4.hienThiThongTin();
    }
}