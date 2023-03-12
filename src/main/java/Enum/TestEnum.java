package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        // kiem tra thu tu trong enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.gioi.ordinal());

        // tao list danh sach
        ArrayList<SV> ds=new ArrayList<>();
        //tao doi tuong sinh vien
        SV sv1=new SV(1,"huy",9);
        SV sv2=new SV(2,"huy",8);
        SV sv3=new SV(3,"huy",7);
        SV sv4=new SV(4,"huy",6);
        SV sv5=new SV(5,"huy",5);
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        ds.add(sv4);
        ds.add(sv5);
        for (SV ttSinhVien:ds
             ) {
            System.out.println(ttSinhVien);
        }
    }
}
