package org.oop;

public class Sale extends Emp{
    private String commission;
    private String region;
    public Sale(int id, String name) {
        super(id, name);
    }

    public Sale(int id, String name, String address, String desc) {
        super(id, name, address, desc);
    }

    public Sale(int id, String name, String address, String desc, String commission, String region) {
        super(id, name, address, desc);
        this.commission = commission;
        this.region = region;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
