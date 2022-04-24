package com.company;

public class RAM {
    String name;
    int size;

    public RAM() {
        this.name = "DDR3";
        this.size = 2048;
    }

    public RAM(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "RAM:" + "\nname=" + this.name + "\nsize=" + this.size + "MB";
    }
}
