package com.example.demo.Model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RentalModel {

    private int  id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfSale;
    private double saleAmount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date rentalDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date returnDate;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private long customerPhoNo;
    private String customerEmail;
    private boolean rentalActive;
    @DateTimeFormat(pattern = "yyyy-MM-dd") // needed for input field on html pages (in order to serve the right format)


    public boolean isRentalActive() {
        return rentalActive;
    }

    @Override
    public String toString() {
        return "RentalModel{" +
                "id=" + id +
                ", dateOfSale=" + dateOfSale +
                ", saleAmount=" + saleAmount +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerPhoNo=" + customerPhoNo +
                ", customerEmail='" + customerEmail + '\'' +
                ", rentalActive=" + rentalActive +
                '}';
    }

    public void setRentalActive(boolean rentalActive) {
        this.rentalActive = rentalActive;
    }

    public RentalModel(int id, Date dateOfSale, double saleAmount, Date rentalDate, Date returnDate, String customerFirstName, String customerLastName, String customerAddress, long customerPhoNo, String customerEmail, boolean rentalActive) {
        this.id = id;
        this.dateOfSale = dateOfSale;
        this.saleAmount = saleAmount;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
        this.customerPhoNo = customerPhoNo;
        this.customerEmail = customerEmail;
        this.rentalActive = rentalActive;
    }

    public RentalModel (){

    }

    public int getId() {
        return id;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public long getCustomerPhoNo() {
        return customerPhoNo;
    }

    public void setCustomerPhoNo(long customerPhoNo) {
        this.customerPhoNo = customerPhoNo;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }
}
