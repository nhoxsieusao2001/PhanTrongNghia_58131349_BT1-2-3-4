/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Admin
 */
public abstract class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc() {
        if (getDiem() >9 ) return "Xuất Sắc";
        else if (7.5 <= getDiem() && getDiem() < 9) 
            return "Giỏi";
        else if (6.5 <= getDiem() && getDiem() < 7.5) 
            return "Khá";
        else if(5 <= getDiem() && getDiem() < 6.5) 
            return "Trung bình";        
        return "Yếu";	
    }
    
    public void xuatSV() {
        System.out.println("Bọ Tên Sinh Viên : " + hoTen);
        System.out.println("Ngành Học : " + nganh);
        System.out.println("Điểm TB : " + getDiem());
        System.out.println("Học Lực : " + getHocLuc());
    }
}