package org.oopSXclass;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<SanPham> ds=new ArrayList<>();
        SanPham sp1=new SanPham(1,"samsung",1000);
        SanPham sp2=new SanPham(2,"iphone",5000);
        SanPham sp3=new SanPham(3,"xiaomi",200);

        //add vao danh sach list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        for (SanPham sp:ds) {
            System.out.println(sp);
        }

        //goi pt sap xep
        Collections.sort(ds);
        System.out.println("sp sau khi sx");
        for (SanPham sp:ds) {
            System.out.println(sp);
        }
    }
}
