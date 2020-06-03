package com.example.demo.Reps;

import com.example.demo.Model.RentalModel;
import com.example.demo.Util.DatabaseConnectionManager;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

@Controller
public class RentalRep implements IRentalRep {

    private Connection conn;

    public RentalRep () { this.conn = DatabaseConnectionManager.getDatabaseConnection(); }


    //Extra
    //Cancellation
    //Season
    //pickup/Dropoff

    public boolean createRental (RentalModel rentalModel) {


        try {
            PreparedStatement createStatement = conn.prepareStatement("INSERT INTO rentals (rental_id, dateOfSale, saleAmount, rentalDate,  returnDate, customerFirstName, customerLastName, customerAddress, customerPhoNo, customerEmail, rental_active) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");

            SimpleDateFormat convert = new SimpleDateFormat("yyyy-MM-dd");

            String dateOfSaleInCorrectFormat = convert.format(rentalModel.getDateOfSale());
            String rentalDateInCorrectFormat = convert.format(rentalModel.getRentalDate());
            String returnDateInCorrectFormat = convert.format(rentalModel.getReturnDate());
            System.out.println(dateOfSaleInCorrectFormat);
            System.out.println(rentalDateInCorrectFormat);
            System.out.println(returnDateInCorrectFormat);

            createStatement.setInt(1, rentalModel.getId());
            createStatement.setString(2, dateOfSaleInCorrectFormat);
            createStatement.setDouble(3, rentalModel.getSaleAmount());
            createStatement.setString(4, rentalDateInCorrectFormat);
            createStatement.setString(5, returnDateInCorrectFormat);
            createStatement.setString(6, rentalModel.getCustomerFirstName());
            createStatement.setString(7, rentalModel.getCustomerLastName());
            createStatement.setString(8, rentalModel.getCustomerAddress());
            createStatement.setLong(9, rentalModel.getCustomerPhoNo());
            createStatement.setString(10, rentalModel.getCustomerEmail());
            createStatement.setBoolean(11, rentalModel.isRentalActive());
            createStatement.executeUpdate();



        }catch (SQLException e) {
            System.out.println(e);
        }
        return true;
    }




}
