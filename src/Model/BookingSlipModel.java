/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hello
 */
public class BookingSlipModel {
    private String VechicleNumber,brand,model,special_request,borrow_date,return_date,customer_name,customer_number,total,collateral,advancePayment;
    private int bookingId;

    public BookingSlipModel(String VechicleNumber, String brand, String model, String special_request, String borrow_date, String return_date, String customer_name, String customer_number, String total,String collateral, String advancePayment, int bookingId) {
        this.VechicleNumber = VechicleNumber;
        this.brand = brand;
        this.model = model;
        this.special_request = special_request;
        this.borrow_date = borrow_date;
        this.return_date = return_date;
        this.customer_name = customer_name;
        this.customer_number = customer_number;
        this.total = total;
        this.collateral=collateral;
        this.advancePayment=advancePayment;
        this.bookingId=bookingId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public String getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(String advancePayment) {
        this.advancePayment = advancePayment;
    }
   

    public String getVechicleNumber() {
        return VechicleNumber;
    }

    public void setVechicleNumber(String VechicleNumber) {
        this.VechicleNumber = VechicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpecial_request() {
        return special_request;
    }

    public void setSpecial_request(String special_request) {
        this.special_request = special_request;
    }

    public String getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
