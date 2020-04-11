/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantrongnghia_58131349_bt1.pkg2.pkg3.pkg4.BT1;

/**
 *
 * @author Admin
 */
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongsogioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongsogioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongsogioLam = tongsogioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongsogioLam;
    }

    public void setTongGioLam(int tongsogioLam) {
        this.tongsogioLam = tongsogioLam;
    }
    
    public void getThongTin(){
        System.out.println("Tên nhân viên : " + ten );
        System.out.println("Tuổi nhân viên : " + tuoi );
        System.out.println("Địa chỉ nhân viên : " + diaChi);
        System.out.println("Tiền lương nhân viên : " + tienLuong );
        System.out.println("Tổng số giờ làm : " + tongsogioLam );
        System.out.println("Tiền thưởng : "+ tinhThuong());
    }
          
    
    
    public double tinhThuong(){
        double thuong;
        if (tongsogioLam >= 200) 
            thuong = tienLuong*0.2 ;
        else if (100 <= tongsogioLam && tongsogioLam <200) 
            return tienLuong*0.1;
        else thuong=0;
        return thuong;  
    }
            
}
