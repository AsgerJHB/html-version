package com.example.demo.Model;

public class CustomerModel {

    private int id;
    private String firstName;
    private String lastName;
    private String cpr;
    private String address;
    private String phoneNumber;
    private String email;

    public CustomerModel(int id, String firstName, String lastName, String cpr, String address, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }



    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpr=" + cpr +  '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +  '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public CustomerModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }






}