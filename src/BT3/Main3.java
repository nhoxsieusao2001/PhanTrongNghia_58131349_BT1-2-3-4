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
public class Main3 {
    
    public static void main(String[] args) {
        SinhVienPoly SV1 = new SinhVienIT(7,7,7,"Phan Trọng Nghĩa","CNTT");
        SV1.xuatSV();
        
       
        SinhVienPoly SV2 = new SinhVienIT(7,7,7,"Phan Trọng Nghĩa","CNTT");       
        System.out.println("\nSinh viên IT : ");
        SV2.xuatSV();

        
        SinhVienPoly SV3 = new SinhVienBiz(5,6,"Huỳnh Van Khuyên","Kinh Tế");
        System.out.println("\nSinh viên Biz :");
        SV3.xuatSV();
    }
    
}