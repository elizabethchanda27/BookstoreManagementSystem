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
public class PremiumMemberships {
    
    //Attributes
    private String typesOfPayment;
    private String preName;
    private String preEmail;
    private int preNumber;
    private String preAddress;
    private double currentTotal;
    private double correctTotal;
    private int premiumTotal = 0;
    private final ArrayList<PremiumMemberships> premiumMemberList = new ArrayList<>();
    private final ArrayList<PremiumMemberships> premiumFees = new ArrayList<>();
    
    
    //Constructors
    public PremiumMemberships() {
        
    }

    //Constructors(Payment Method)
    /**
     * 
     * @param typesOfPayment 
     */
    public PremiumMemberships(String typesOfPayment){
        this.typesOfPayment = typesOfPayment;
    }
    
    //Constructors (Memberships)
    /**
     * 
     * @param preName
     * @param preEmail
     * @param preNumber
     * @param preAddress 
     */
    public PremiumMemberships(String preName, String preEmail, int preNumber, String preAddress, double currentTotal, double correctTotal) {
        this.preName = preName;
        this.preEmail = preEmail;
        this.preNumber = preNumber;
        this.preAddress = preAddress;
        this.currentTotal = currentTotal;
        this.correctTotal = correctTotal;
        
    }
    
    //Increment
    //Only meant for new members
    public void incrementCurrentTotalFee() {
        currentTotal += 10.00; 
    }
    
    //Increment
    //Only meant for new members
    public void incrementCorrectTotalFee() {
        correctTotal += 10.00;
    }
    
    //Getters
    /**
     * 
     * @return typesOfPayment
     */
    public String getTypesOfPayment() {
        return typesOfPayment;
    }
    
    //Setters
    /**
     * 
     * @param typesOfPayment 
     */
    public void setTypesOfPayment(String typesOfPayment) {
        this.typesOfPayment = typesOfPayment;
    }
    
    //Getter
    /**
     * 
     * @return name for Premium Member
     */
    public String getPreName() {
        return preName;
    }
    
    //Setter
    /**
     * 
     * @param preName 
     */
    public void setPreName(String preName) {
        this.preName = preName;
    }
    
    //Getter
    /**
     * 
     * @return email for Premium Member
     */
    public String getPreEmail() {
        return preEmail;
    }
    
    //Setter
    /**
     * 
     * @param preEmail 
     */
    public void setPreEmail(String preEmail) {
        this.preEmail = preEmail;
    }
    
    //Getter
    /** 
     * 
     * @return phone number of Premium Member
     */
    public int getPreNumber() {
        return preNumber;
    }
    
    //Setter
    /**
     * 
     * @param preNumber 
     */
    public void setPreNumber(int preNumber) {
        this.preNumber = preNumber;
    }
    
    //Getter
    /** 
     * 
     * @return address of Premium Member
     */
    public String getPreAddress() {
        return preAddress;
    }
    
    //Setter
    /**
     * 
     * @param preAddress 
     */
    public void setPreAddress(String preAddress) {
        this.preAddress = preAddress;
    }
    
    //Getter
    /** 
     * 
     * @return current total that Premium Member has paid
     */
    public double getCurrentTotal() {
        return currentTotal;
    }
    
    //Setter
    /**
     * 
     * @param currentTotal 
     */
    public void setCurrentTotal(double currentTotal) {
        this.currentTotal = currentTotal;
    }
    
    //Getter
    /** 
     * 
     * @return correct total that the Premium Member should have paid
     */
    public double getCorrectTotal() {
        return correctTotal;
    }
    
    //Setter
    /**
     * 
     * @param correctTotal 
     */
    public void setCorrectTotal(double correctTotal) {
        this.correctTotal = correctTotal;
        System.out.println("Correct Total Updated for " + this.preName + ": " + correctTotal);
    }
    
    
    //Increment
    private void incrementPremiumTotal() {
        premiumTotal++;
    }   
    
    //Methods for input validation
    
    //Method
    //Checks if the input only contains letters
    /**
     * 
     * @param preName
     * @return if the user input for name is correct or not
     */
    private static boolean isPreValidName(String preName) {
        return preName.matches("[a-zA-Z]+$");
        
    }
    
    //Method
    //Allows the isPreValidName method to be used in main
    /**
     * 
     * @param preName
     * @return isPreValidName
     */
    public boolean validatePreName(String preName) {
        return isPreValidName(preName);
    }   
    
    //Method
    /**
     * 
     * @param preEmail
     * @return if the user input for email is correct or not
     */
    private static boolean isPreValidEmail(String preEmail) {
        return preEmail.matches("[^@]+@[^@]+\\.com$");
    }
    
    //Method
    //Allows the isPreValidEmail method to be used in main
    /**
     * 
     * @param preEmail
     * @return isPreValidEmail
     */
    public boolean validatePreEmail(String preEmail) {
        return isPreValidEmail(preEmail);
    }
    
    //Method
    /**
     * 
     * @param preNumber
     * @return if user input for phone number is valid or not
     */
    private static boolean isPreValidPhoneNumber(int preNumber) {
        String prePhoneNumberString = Integer.toString(preNumber);
        
        return prePhoneNumberString.matches("\\d{10}");
    }
    
    //Method
    //Allows the isPreValidPhoneNumber method to be used in main
    /**
     * 
     * @param preNumber
     * @return isPreValidPhoneNumber
     */
    public boolean validatePrePhoneNumber(int preNumber) {
        return isPreValidPhoneNumber(preNumber);
    }
    
    //Method
    /**
     * 
     * @param preAddress
     * @return if user input for address is correct or not
     */
    private boolean isPreValidAddress(String preAddress) {
        //What the user inputted for address
        String[] parts = preAddress.split(",");
    
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
        if (!street.isEmpty() && !city.isEmpty() && state.length() == 2 && zip.matches("\\d{5}")) {
            return true;
        }
        else {
            return false;
        }
    }
    
    //Method
    //Allows the isPreValidAddress method to be used in main
    /**
     * 
     * @param preAddress
     * @return isPreValidAddress
     */
    public boolean validatePreAddress(String preAddress) {
        return isPreValidAddress(preAddress);
    }
    
    //Gather Method
    //Initialize the list with premium members personal information
    /**
     * 
     * @return Member List for Premium Members
     */
    public ArrayList <PremiumMemberships> getPremiumMemberList() {
        return premiumMemberList;
    }
    //Gather Method
    //Current totals of each member's fees
    /**
     * 
     * @return Fees for Premium Members
     */
    public ArrayList <PremiumMemberships> getPremiumFees() {
        return premiumFees;
    }
    
    //Method
    //Add Premium Member to System
    public void addPremiumMember() {
        PremiumMemberships premium = new PremiumMemberships(preName, preEmail, preNumber, preAddress, currentTotal, correctTotal);
        premiumMemberList.add(premium);
        incrementPremiumTotal();
    }
    
    //Payment Method for Monthly Fee
    
    //Method
    //This method will determine how the premium membership is being paid and the process will be recorded in the system for future reference
    /**
     * 
     * @param typesOfPayment
     * @return The type of payment method or confirmation that it is the wrong payment method
     */
    public String membershipPaymentPending(String typesOfPayment) {
        if(typesOfPayment.equals("credit") || typesOfPayment.equals("Credit") ) {
            return("Payment Method: credit");
        }
        
        else if (typesOfPayment.equals("debit") || typesOfPayment.equals("Debit") ){
            return("Payment method: debit");
        }
        
        else {
            return("Invalid payment method");
        }
    }
        
    //Method
    //If they choose a name that is a part of the premium members list, check if their fees are paid
    /**
     * 
     * @return true (fees are paid, then they will continue with their purchase) and false (they need to pay their fees)
     */
    public boolean checkFeesAndProceed() {       
        if(this.currentTotal >= this.correctTotal) {
            return true;
        }
        else {
            return false;
        }
    }
}
