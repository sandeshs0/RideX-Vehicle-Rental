/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hello
 */
public class ReturnModel {
    private int BookingId;
    private String vehicleNo, Brand,Model,cusPhone,cusID,Collateral,BookingDate,ExpectedRetDate,ActualRetDate;

    public ReturnModel(int BookingId, String vehicleNo, String Brand, String Model, String cusPhone, String cusID, String Collateral, String BookingDate, String ExpectedRetDate, String ActualRetDate) {
        this.BookingId = BookingId;
        this.vehicleNo = vehicleNo;
        this.Brand = Brand;
        this.Model = Model;
        this.cusPhone = cusPhone;
        this.cusID = cusID;
        this.Collateral = Collateral;
        this.BookingDate = BookingDate;
        this.ExpectedRetDate = ExpectedRetDate;
        this.ActualRetDate = ActualRetDate;
    }

    
    
  public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int BookingId) {
        this.BookingId = BookingId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public String getCollateral() {
        return Collateral;
    }

    public void setCollateral(String Collateral) {
        this.Collateral = Collateral;
    }

    public String getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(String BookingDate) {
        this.BookingDate = BookingDate;
    }

    public String getExpectedRetDate() {
        return ExpectedRetDate;
    }

    public void setExpectedRetDate(String ExpectedRetDate) {
        this.ExpectedRetDate = ExpectedRetDate;
    }

    public String getActualRetDate() {
        return ActualRetDate;
    }

    public void setActualRetDate(String ActualRetDate) {
        this.ActualRetDate = ActualRetDate;
    }
    
}
