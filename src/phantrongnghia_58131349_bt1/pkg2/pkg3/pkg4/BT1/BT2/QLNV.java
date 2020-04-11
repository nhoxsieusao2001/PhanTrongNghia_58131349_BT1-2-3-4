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
public class QLNV implements IQLNV{
    NhanVien[] NV = new NhanVien[100];
    int n = 1;
    
    @Override
    public void themNV(NhanVien nv) {
        NV[n] = new NhanVien();
        NV[n] = nv;
        n++;
    }
    
    @Override
    public void inDS() {
        for(int i = 1; i<n; i++) {
            System.out.println("\nNhân viên thứ " + i);
            NV[i].getThongTin();
        }
    }
}
