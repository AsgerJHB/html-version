package com.example.demo.Model;

public class MotorhomeModel {

    private int id;
    private String manufacturer;
    private String model;
    private int year;
    private int seating;
    private int beds;
    private double mileage;
    private double price;

    public MotorhomeModel() {

    }

    @Override
    public String toString() {
        return "MotorhomeModel{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year + '\'' +
                ", seating=" + seating + '\'' +
                ", beds=" + beds + '\'' +
                ", mileage=" + mileage + '\'' +
                ", price=" + price + '\'' + '}';
    }

    public MotorhomeModel(int id, String manufacturer, String model, int year, int seating, int beds, double mileage, double price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.seating = seating;
        this.beds = beds;
        this.mileage = mileage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//VehicleSpecification()

}
