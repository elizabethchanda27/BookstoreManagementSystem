/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chandaelizabethproject1;
import java.util.ArrayList;

/**
 *
 * @author elizabethchanda
 */
public class RegularMemberships {
    
    //Attributes
    protected String regResponse;
    private String regName;
    private String regEmail;
    private int regNumber;
    private String regAddress;
    private int regularTotal = 0;
    private final ArrayList<RegularMemberships> regularMemberList = new ArrayList<>();
    
    //Constructors
    public RegularMemberships() {
        
    }
    
    //Constructors
    /**
     * 
     * @param regName
     * @param regEmail
     * @param regNumber
     * @param regAddress 
     */
    public RegularMemberships (String regName, String regEmail, int regNumber, String regAddress) {
        this.regName = regName;
        this.regEmail = regEmail;
        this.regNumber = regNumber;
        this.regAddress = regAddress;
    }
    
    //Getter
    public String getRegName() {
        return regName;
    }
    
    //Setter
    /**
     * 
     * @param regName 
     */
    public void setRegName(String regName) {
        this.regName = regName;
    }
    
    //Getter
    /**
     * 
     * @return email for Regular Member
     */
    public String getRegEmail() {
        return regEmail;
    }
    
    //Setter
    /**
     * 
     * @param regEmail 
     */
    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }
    
    //Getter
    /**
     * 
     * @return number for Regular Member
     */
    public int getRegNumber() {
        return regNumber;
    }
    
    //Setter
    /**
     * 
     * @param regNumber 
     */
    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    //Getter
    /**
     * 
     * @return address for Regular Member
     */
    public String getRegAddress() {
        return regAddress;
    }
    
    //Setter
    /**
     * 
     * @param regAddress 
     */
    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }
    
    //Increment
    private void incrementRegularTotal() {
        regularTotal++;
    }
    
    //Methods for input validation
    
    //Method
    //Checks if the input only contains letters
    /**
     * 
     * @param regName
     * @return if the user input for name is correct or not
     */
    private static boolean isRegValidName(String regName) {
        return regName.matches("[a-zA-Z]+$");
    }
    
    //Method
    //Allows the isRegValidName method to be used in main
    /**
     * 
     * @param regName
     * @return isRegValidName
     */
    public boolean validateRegName(String regName) {
        return isRegValidName(regName);
    }

    //Method
    /**
     * 
     * @param regEmail
     * @return if the user input for email is correct or not
     */
    private static boolean isRegValidEmail(String regEmail) {
        return regEmail.matches("[^@]+@[^@]+\\.com$");
    }
    
    //Method
    //Allows the isRegValidEmail method to be used in main
    /**
     * 
     * @param regEmail
     * @return isRegValidEmail
     */
    public boolean validateRegEmail(String regEmail) {
        return isRegValidEmail(regEmail);
    }

    //Method
    /**
     * 
     * @param regNumber
     * @return if the user input for phone number is correct or not
     */
    private static boolean isRegValidPhoneNumber(int regNumber) {
        String regPhoneNumberString = Integer.toString(regNumber);
        
        return regPhoneNumberString.matches("\\d{10}");
    }
    
    //Method
    //Allows the isRegValidPhoneNumber method to be used in main
    /**
     * 
     * @param regNumber
     * @return isRegValidPhoneNumber
     */
    public boolean validateRegPhoneNumber(int regNumber){
        return isRegValidPhoneNumber(regNumber);
    }

    //Method
    /**
     * 
     * @param regAddress
     * @return if the user input for address is correct or not
     */
    private static boolean isRegValidAddress(String regAddress) {
        //What the user inputted for address
        String[] parts = regAddress.split(",");
    
        //Sees if there is 4 parts that make up an address (Street, City, State (in acronym form), and Zip Code)
        if (parts.length != 4) {
            return false;
        }

        //This removes spaces between the parts that make up an address
        String street = parts[0].trim();
        String city = parts[1].trim();
        String state = parts[2].trim();
        String zip = parts[3].trim();

        //Checks if there is a street, city, state in acronym form, and a zipcode with 5 numbers
        if(!street.isEmpty() && !city.isEmpty() && state.length() == 2 && zip.matches("\\d{5}")) {
            return true;
        }
        else { 
            return false;
        }
    }
    
    //Method
    //Allows the isRegValidAddress method to be used in main
    /**
     * 
     * @param regAddress
     * @return isRegValidAddress
     */
    public boolean validateRegAddress(String regAddress) {
        return isRegValidAddress(regAddress);
    }
    
    //Method
    //This method will add the current user to the list with all the regular members
    /**
     * 
     * @param regName
     * @param regEmail
     * @param regNumber
     * @param regAddress 
     */
    public void addRegularMember(String regName, String regEmail, int regNumber, String regAddress){
        RegularMemberships regular = new RegularMemberships(regName, regEmail, regNumber, regAddress);
        regularMemberList.add(regular);
        incrementRegularTotal();
    }
    
    //Gather Method
    /**
     * 
     * @return Member List for Regular Members
     */
    public ArrayList <RegularMemberships> getRegularMemberList() {
        return regularMemberList;
    }
}
