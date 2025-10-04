package sach;

public class Test {
    public static void main(String[] args)
    {
       Sach s1=new Sach("sach1", "Giao khoa","Nguyen Van A", 2024,10);
       s1.hienThi();
       System.out.println("");
       Sach s2=new Sach("sach2", "Nguyen Van B",20);
       s2.hienThi();
       System.out.println("");
       Sach s3=new Sach("sach2", "Truyen tranh","Nguyen Van B");
       s3.hienThi();
    }
    
}