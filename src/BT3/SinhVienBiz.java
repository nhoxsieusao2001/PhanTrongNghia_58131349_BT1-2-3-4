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
public class SinhVienBiz extends SinhVienPoly{
    private double diemMakerting;
    private double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMakerting, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMakerting = diemMakerting;
        this.diemSales = diemSales;
    }

   

    public double getDiemMakerting() {
        return diemMakerting;
    }

    public void setDiemMakerting(double diemMakerting) {
        this.diemMakerting = diemMakerting;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    @Override
    public double getDiem() {

            return (2*diemMakerting+diemSales)/3;
    }
    
}