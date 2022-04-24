package com.company;

public class Computer {
    private double cost;
    private String model;
    private HDD hdd;
    private RAM ram;



    public Computer(double cost, String model){
        this.cost = cost;
        this.model = model;
        this.hdd = new HDD();
        this.ram = new RAM();
    }

    public Computer(double cost, String model, String ramName, int ramSize, String hddName, int hddSize, HDD_TYPE hddType){
        this.cost = cost;
        this.model = model;
        this.hdd = new HDD(hddName, hddSize, hddType);
        this.ram = new RAM(ramName, ramSize);
    }

    @Override
    public String toString() {
        return "\ncost=" + this.cost + "$\nmodel=" + this.model + "\n" + this.hdd + "\n" + this.ram + "\n";
    }
}
