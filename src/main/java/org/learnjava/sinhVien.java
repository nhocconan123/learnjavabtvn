package org.learnjava;

public class sinhVien {
    //thuoc tinh
    private String hoten;
    private double diem;

    //constructor mặc đinh
    // khoi tao cac gia tri mặc đinh
    // ngay khi doi tuong vua được tạo ra

    //phuong thuc(cac ham)
    //phuong thuc khong co kieu tra ve


    public sinhVien() {
        hoten="no name";
        diem=0.0;
    }

    public sinhVien(String hoten) {
        this.hoten = hoten;
    }

    public sinhVien(String hoten, double diem) {
        this.hoten = hoten;
        this.diem = diem;
    }
    //phuong thuc khong co kieu tra ve
    public void hienthithongtin()
    {
        System.out.println(hoten+" : "+diem);
    }
    // phuong thuc co kieu tra ve
    public double tinhDTB(double diemToan,double Van)
    {
        return (diemToan+Van)/2;
    }
    //get,set

    public String getHoten() {
        return hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    //tostring

    @Override
    public String toString() {
        return "sinhVien{" +
                "hoten='" + hoten + '\'' +
                ", diem=" + diem +
                '}';
    }
}
