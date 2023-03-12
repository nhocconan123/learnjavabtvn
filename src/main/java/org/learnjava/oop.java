package org.learnjava;

public class oop {
    public static void main(String[] args) {
        // khoi tao doi tuong thuoc sinh vien
        sinhVien sv= new sinhVien();
        sv.hienthithongtin();
        sinhVien sv3=new sinhVien("huy");
        sv3.hienthithongtin();
        sinhVien sv4 =new sinhVien("huy",10);
        sv4.hienthithongtin();
        System.out.println(sv4.getHoten());
        sv4.setHoten("duong dinh huy");
        sv4.hienthithongtin();
        double diemtbsv4=sv4.tinhDTB(8,9);
        System.out.println(diemtbsv4);

        //test phuong thuc tostring
        System.out.println(sv4.toString());
    }
}
