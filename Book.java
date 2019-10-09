package ru.mirea.Lab1;

public class Book {
    private String name;
    private double volume;

    public Book(String n, double v) {
        this.name = n;
        this.volume = v;
    }

    public Book(String n) {
        this.name = n;
        this.volume = 0;
    }

    public Book() {
        this.name = "Little mistress of a big house";
        this.volume = 0;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public double getVolume() {
        return this.volume;
    }

    public String toString() {
        return this.name + ", volume " + this.volume;
    }

    public void Book() {
        System.out.println(this.name + " contains " + this.volume + " pages");
    }
}
