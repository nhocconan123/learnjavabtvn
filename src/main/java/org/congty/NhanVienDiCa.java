package org.congty;

public class NhanVienDiCa extends NhanVien{
    private int ca;
    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
        this.ca=ca;
    }

    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhluong() {
        return luongcoban*1.05;
    }
}
