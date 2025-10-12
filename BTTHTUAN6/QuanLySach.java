
package sach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class QuanLySach 
{
    private List<Sach> Books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    public void themSach()
    {
        System.out.println("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.println("Nhap tieu de: ");
        String tieuDe = sc.nextLine();
        System.out.println("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Chon loai sach can them : 1.Sach giao trinh 2.Sach tieu thuyet");
        int luaChon = Integer.parseInt(sc.nextLine().trim());
        if(luaChon == 1)
        {
            System.out.println("Nhap mon hoc: ");
            String monHoc = sc.nextLine();
            System.out.println("Nhap cap do : ");
            String capDo = sc.nextLine();
            System.out.println("Sach giao trinh");
            SachGiaoTrinh sachGiaoTrinh = new SachGiaoTrinh();
            sachGiaoTrinh.setMaSach(maSach);
            sachGiaoTrinh.setTieuDe(tieuDe);
            sachGiaoTrinh.setTacGia(tacGia);
            sachGiaoTrinh.setNamXuatBan(namXuatBan);
            sachGiaoTrinh.setSoLuong(soLuong);
            sachGiaoTrinh.setMonHoc(monHoc);
            sachGiaoTrinh.setCapDo(capDo); 
            Books.add(sachGiaoTrinh);
        }
        else 
            if(luaChon==2)
            {
                System.out.println("Nhap the loai: ");
                String theLoai = sc.nextLine();
                System.out.println("La sach co series hay khong: ");
                boolean laSachSeries = Boolean.parseBoolean(sc.nextLine().trim());
                System.out.println("Sach tieu thuyet");
                SachTieuThuyet sachTieuThuyet = new SachTieuThuyet();
                sachTieuThuyet.setMaSach(maSach);
                sachTieuThuyet.setTieuDe(tieuDe);
                sachTieuThuyet.setTacGia(tacGia);
                sachTieuThuyet.setNamXuatBan(namXuatBan);
                sachTieuThuyet.setSoLuong(soLuong);
                sachTieuThuyet.setTheLoai(theLoai);
                sachTieuThuyet.setLaSachSeries(laSachSeries);
                Books.add(sachTieuThuyet);
            }
            else
            {
                System.out.println("Chi duoc chon 1 hoac 2");
                return;

            }
        System.out.println("Them moi thanh cong!");
    }
    public void xoaSach() 
    {
        System.out.println("Nhap ma sach can xoa:");
        String maSach = sc.nextLine();
        for (int i = 0; i < Books.size(); i++) 
        {
            if (Books.get(i).getMaSach().equals(maSach)) 
            {
                Books.remove(i);
                System.out.println("Xoa sach thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }
    public void capNhatSach() 
    {
        System.out.println("Nhap ma sach can cap nhat: ");
        String maSach = sc.nextLine();
        for (Sach sach : Books) 
        {
            if (sach.getMaSach().equals(maSach)) 
            {
                System.out.println("Nhap tieu de moi:");
                String tieuDe = sc.nextLine();
                System.out.println("Nhap tac gia moi: ");
                String tacGia = sc.nextLine();
                System.out.println("Nhap nam xuat ban moi: ");
                int namXuatBan = Integer.parseInt(sc.nextLine().trim());
                System.out.println("So luong moi: ");
                int soLuong = Integer.parseInt(sc.nextLine().trim());
                sach.setTieuDe(tieuDe);
                sach.setTacGia(tacGia);
                sach.setNamXuatBan(namXuatBan);
                sach.setSoLuong(soLuong);
                if(sach instanceof SachGiaoTrinh)
                {
                    SachGiaoTrinh sgt = (SachGiaoTrinh) sach;
                    System.out.println("Nhap mon hoc moi (hien tai: " + sgt.getMonHoc() + "):"); 
                    sgt.setMonHoc(sc.nextLine());
                    System.out.println("Nhap cap do moi (hien tai: " + sgt.getCapDo() + "):");
                    sgt.setCapDo(sc.nextLine());
                } 
                else 
if(sach instanceof SachTieuThuyet) 
                    {
                        SachTieuThuyet stt = (SachTieuThuyet) sach;
                        System.out.println("Nhap the loai moi (hien tai: " + stt.getTheLoai() + "):");
                        stt.setTheLoai(sc.nextLine());
                        System.out.println("La sach series (true/false) (hien tai: " + stt.isLaSachSeries() + "):");
                        stt.setLaSachSeries(Boolean.parseBoolean(sc.nextLine().trim()));
                    }   
                System.out.println("Cap nhat sach thanh cong!");
                return;
            }
        }
    }
    public void timKiemSach() 
    {
        System.out.println("Nhap ma sach can tim kiem: ");
        String maSach = sc.nextLine();
        for (Sach sach : Books) 
        {
            if (sach.getMaSach().equals(maSach)) 
            {
                System.out.println("Thong tin sach can tim:");
                sach.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }
    public void hienThiSach() 
    {
        if (Books.isEmpty()) 
        {
            System.out.println("Khong co sach trong thu vien!");
            return;
        }
        System.out.println("Danh sach sach trong thu vien:");
        for (Sach sach : Books) 
        {
            sach.hienThiThongTin();
        }
    }
    
}
