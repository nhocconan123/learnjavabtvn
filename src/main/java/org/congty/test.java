package org.congty;

public class test {
    public static void main(String[] args) {

        //tao doi tuong la nhan vien hanh chinh

        NhanVienHanhChinh hc1=new NhanVienHanhChinh("hanh chinh 1","thai ngueyen",123445);
        hc1.tinhluong();

        //tao nhan vien di ca
        NhanVienDiCa dica=new NhanVienDiCa("nhan vien di ca","bac giang",45789);
        dica.tinhluong();
    }
}
