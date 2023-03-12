package org.oop;

public class engineer extends  Emp{
    private String product;
    private String team;
    public engineer(int id, String name) {
        super(id, name);
    }

    public engineer(int id, String name, String address, String desc) {
        super(id, name, address, desc);
    }

    public engineer(int id, String name, String address, String desc, String product, String team) {
        super(id, name, address, desc);
        this.product = product;
        this.team = team;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
