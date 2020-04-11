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
public class Main {
    public static void main(String[] args) {
       NhanVien NV1 = new NhanVien("Phan Trọng Nghĩa",23,"Phú Ninh, Quảng Nam",150000,210);
       NhanVien NV2 = new NhanVien("Huỳnh Van Khuyên",23,"Quế Son, Quảng Nam",150000,150);
       NhanVien NV3 = new NhanVien("Ngô Quang Tiến",23,"Quảng Tri",150000,50); 
       NV1.getThongTin();
       NV2.getThongTin();
       NV3.getThongTin();
}}
