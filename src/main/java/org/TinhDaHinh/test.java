package org.TinhDaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu ns1=new PhoPhong("huy","123","thai nguyen");
        System.out.println(ns1.tinhLuong(30));
        System.out.println(ns1.getTen()+" "+ns1.getCccd());
        //thay doi chuc vu
        ns1=new TruongPhong(ns1.getTen(),ns1.getCccd(),ns1.getQuequan());
        System.out.println(" ns1 lam truong phong");
        System.out.println(ns1.getTen()+" : "+ns1.getCccd());
        System.out.println(ns1.tinhLuong(30));
    }
}
