package org.oop;

public class main {
    public static void main(String[] args) {
        engineer eg=new engineer(1,"huy");
        eg.setAddress("thai nguyen");
        eg.setDesc("adddd");
        System.out.println(eg.toString());

        Sale sa=new Sale(2,"test");
        sa.setRegion("abc");
        sa.setCommission("bbb");
        sa.setAddress("thai nguyen");
        sa.setDesc("tets");
        System.out.println(sa.toString());


    }
}
