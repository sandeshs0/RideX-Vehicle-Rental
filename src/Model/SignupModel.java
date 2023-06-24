/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Controller.SignupController;
/**
 *
 * @author hello
 */
public class SignupModel {
    private String FName;
    private String LName;
    private String PhoneNo;
    private String Password;
    private String ConPassword;
    private String SecurityQuestion;
    private String SecurityAnswer;

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getConPassword() {
        return ConPassword;
    }

    public void setConPassword(String ConPassword) {
        this.ConPassword = ConPassword;
    }

    public String getSecurityQuestion() {
        return SecurityQuestion;
    }

    public void setSecurityQuestion(String SecurityQuestion) {
        this.SecurityQuestion = SecurityQuestion;
    }

    public String getSecurityAnswer() {
        return SecurityAnswer;
    }

    public void setSecurityAnswer(String SecurityAnswer) {
        this.SecurityAnswer = SecurityAnswer;
    }

    public SignupModel(String FName, String LName, String PhoneNo, String Password, String ConPassword, String SecurityQuestion, String SecurityAnswer) {
        this.FName = FName;
        this.LName = LName;
        this.PhoneNo = PhoneNo;
        this.Password = Password;
        this.ConPassword = ConPassword;
        this.SecurityQuestion = SecurityQuestion;
        this.SecurityAnswer = SecurityAnswer;
    }
    public void registerAdmin() {
        SignupController registrationController = new SignupController();  
        registrationController.registerUser(FName,LName,PhoneNo,Password,ConPassword,SecurityQuestion,SecurityAnswer);
//        registrationController.validation(FName,LName,PhoneNo,Password,ConPassword,SecurityQuestion,SecurityAnswer);
    }
    
    
}
