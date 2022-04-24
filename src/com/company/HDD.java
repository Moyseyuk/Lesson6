package com.company;

public class HDD {
    private String name;
    private int size;
    private HDD_TYPE type;

    public HDD() {
        this.name = "SATA";
        this.size = 250;
        this.type = HDD_TYPE.interior;
    }

    public HDD(String name, int size, HDD_TYPE type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD: " + "\nname=" + this.name + "\nsize=" + this.size + "GB\ntype=" + this.type;
    }
}
