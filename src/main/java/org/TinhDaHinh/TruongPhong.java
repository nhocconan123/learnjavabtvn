package org.TinhDaHinh;

public class TruongPhong extends NhanSu{

    public TruongPhong() {
    }

    public TruongPhong(String ten, String cccd) {
        super(ten, cccd);
    }

    public TruongPhong(String ten, String cccd, String quequan) {
        super(ten, cccd, quequan);
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return ngayCong*50;
    }
}
