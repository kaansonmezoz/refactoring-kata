package com.sonmezoz.kaan.kata.refactoring.case3;

public class Robot {
    private Machine location;
    private String bin;

    public Robot() {
    }

    public Machine location() {
        return location;
    }

    public void moveTo(Machine location) {
        this.location = location;
    }

    public void pick() {
        this.bin = location.take();
    }

    public String bin() {
        return bin;
    }

    public void release() {
        location.put(bin);
        bin = null;
    }
}