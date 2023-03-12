package org.oopSXclass;

public class SanPham implements Comparable<SanPham>{
    private int ma;
    private String ten;
    private double gia;

    public SanPham() {
    }

    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }

    @Override
    public int compareTo(SanPham o) {
        return this.ten.compareToIgnoreCase(o.ten);
    }

//    @Override
//    public int compareTo(SanPham o) {
//        if(this.gia <o.gia)
//        {
//            return -1;
//        }
//        if(this.gia>o.gia)
//        {
//            return 1;
//        }
//        return 0;
//    }
}
