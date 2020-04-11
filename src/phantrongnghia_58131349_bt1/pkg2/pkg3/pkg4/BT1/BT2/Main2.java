/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantrongnghia_58131349_bt1.pkg2.pkg3.pkg4.BT1.BT2;
import phantrongnghia_58131349_bt1.pkg2.pkg3.pkg4.BT1.NhanVien;
/**
 *
 * @author Admin
 */
public class Main2 {

   
    public static void main(String[] args) {
        QLNV ds = new QLNV();
        NhanVien NV1 = new NhanVien("Phan Trọng Nghĩa",23,"Phú Ninh, Quảng Nam",150000,210);
        NhanVien NV2 = new NhanVien("Huỳnh Van Khuyên",23,"Quế Son, Quảng Nam",150000,150);
        NhanVien NV3 = new NhanVien("Ngô Quang Tiến",23,"Quảng Tri",150000,50);
        NhanVien NV4 = new NhanVien("Phan Trọng Hoàng Yến",23,"Phú Ninh, Quảng Nam",150000,210);
        NhanVien NV5 = new NhanVien("Phan Trọng Hoàng",40,"Phú Ninh, Quảng Nam",150000,210);
        ds.themNV(NV1);
        ds.themNV(NV2);
        ds.themNV(NV3);
        ds.themNV(NV4);
        ds.themNV(NV5);
       
        for (int i=1; i<6; i++){
            System.out.println("\nNhân viên thứ " + i);
            ds.NV[i].getThongTin();
        }
    }
    
}
