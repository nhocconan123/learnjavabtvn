package org.congty;

public abstract class NhanVien {
    private String Ten;
    private String que;
    private int cccd;
    protected double luongcoban;

    //constructor




    public NhanVien(String ten, String que, int cccd) {
        Ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

    public abstract double tinhluong();

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }
}
