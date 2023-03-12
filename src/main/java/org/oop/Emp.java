package org.oop;

public class Emp {
    private int id;
    private  String name;
    private String address;
    private String desc;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Emp(int id, String name, String address, String desc) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
