package org.oop;

public class SinhVien {
    //thuoc tinh (giong voi bien)
    private String hoTen;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //phuong thuc
    //phuong thuc k co kieu tra ve
     public   void hienThiThongTinSinhVien(){
        System.out.println(hoTen+" "+ diem);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
