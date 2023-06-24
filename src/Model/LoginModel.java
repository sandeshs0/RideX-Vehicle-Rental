/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Controller.LoginController;
/**
 *
 * @author hello
 */
public class LoginModel {
 private String PhoneNum;
 private String password;

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginModel(String PhoneNum, String password) {
        this.PhoneNum = PhoneNum;
        this.password = password;
    }
 
 public void AdminLogin(){
     LoginController AdminLog= new LoginController();
     AdminLog.LoginQuery(PhoneNum, password);
 }
}
