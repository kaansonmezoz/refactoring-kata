package com.sonmezoz.kaan.kata.refactoring.case3;

public class Machine {
    private String name;
    private String location;
    private String bin;

    public Machine(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String take() {
        String result = bin;
        bin = null;
        return result;
    }

    public String bin() {
        return bin;
    }

    public void put(String bin) {
        this.bin = bin;
    }

    public String name() {
        return name;
    }
}