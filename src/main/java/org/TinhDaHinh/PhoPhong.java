package org.TinhDaHinh;

public class PhoPhong extends NhanSu{
    private int ngaycong=0;
    public PhoPhong() {
    }

    public PhoPhong(String ten, String cccd) {
        super(ten, cccd);
    }

    public PhoPhong(String ten, String cccd, String quequan) {
        super(ten, cccd, quequan);
    }

    public PhoPhong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public PhoPhong(String ten, String cccd, int ngaycong) {
        super(ten, cccd);
        this.ngaycong = ngaycong;
    }

    public PhoPhong(String ten, String cccd, String quequan, int ngaycong) {
        super(ten, cccd, quequan);
        this.ngaycong = ngaycong;
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return ngayCong*40;
    }
}
