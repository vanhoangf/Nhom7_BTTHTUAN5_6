package sach;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLySach qlSach = new QuanLySach();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--Quan ly sach--");
            System.out.println("1. Them moi sach");
            System.out.println("2. Xoa sach");
            System.out.println("3. Cap nhat thong tin sach");
            System.out.println("4. Tim kiem sach");
            System.out.println("5. Hien thi sach");
            System.out.println("6. Thoat");
            System.out.print("Chon chuc nang: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    qlSach.themSach();
                    break;
                case 2:
                    qlSach.xoaSach();
                    break;
                case 3:
                    qlSach.capNhatSach();
                    break; 
                case 4:
                    qlSach.timKiemSach();
                    break;    
                case 5:
                    qlSach.hienThiSach();
                    break;             
                case 6:
                    System.out.println("Thoat chuong trinh...");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
