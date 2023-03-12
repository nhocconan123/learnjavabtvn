package org.TinhDaHinh;

public abstract class NhanSu {
    //them cac thuoc tinh
    private String ten;
    private String cccd;
    private String quequan;

    //tao construct


    public NhanSu() {
    }

    public NhanSu(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public NhanSu(String ten, String cccd, String quequan) {
        this.ten = ten;
        this.cccd = cccd;
        this.quequan = quequan;
    }

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getQuequan() {
        return quequan;
    }

    public abstract double tinhLuong(int ngayCong);
}
