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
public class Returns {
    
    //Attributes
    private String typesOfPayment;
    private int creditCardNumber;
    private int debitCardNumber;
    private int itemID;
    private String title;
    private String author;
    private double cost;
    private String genre;
    private boolean inStock;
    private String typeOfProduct;
    private int days;
    private String returnItem;
    private boolean checkReturnStatus;
    private ArrayList <Returns> returningSection = new ArrayList<>();
    
    //Constructors    
    public Returns() {
        
    }
    
    //Constructors
    /**
     * 
     * @param itemID 
     */
    public Returns(int itemID) {
        this.itemID = itemID;
    }
    
    //Constructors
    /**
     * 
     * @param itemID
     * @param title
     * @param author
     * @param cost
     * @param genre
     * @param inStock
     * @param typeOfProduct
     * @param days
     * @param checkReturnStatus 
     */
    public Returns(int itemID, String title, String author, double cost, String genre, boolean inStock, String typeOfProduct, int days, boolean checkReturnStatus){
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.genre = genre;
        this.inStock = inStock;
        this.typeOfProduct = typeOfProduct;
        this.itemID = itemID;
        this.days = days;
        this.checkReturnStatus = checkReturnStatus;
    }

    //Constructors
    /**
     * 
     * @param typesOfPayment
     * @param creditCardNumber
     * @param debitCardNumber 
     */
    public Returns (String typesOfPayment, int creditCardNumber, int debitCardNumber) {
        this.typesOfPayment = typesOfPayment;
        this.creditCardNumber = creditCardNumber;
        this.debitCardNumber = debitCardNumber;
        
        //Constructor for ArrayList to be used in Main
        returningSection = new ArrayList<>();
    }
    
    //Getters
    /**
     * 
     * @return cost
     */
    public double getCost() {
        return cost;
    }
    
    //Setters
    /**
     * 
     * @param cost 
     */
    public void setCost(double cost) {
        this.cost = cost;
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
    
    //Getters
    /**
     * 
     * @return creditCardNumber
     */
    public int getCreditCardNumber() {
        return creditCardNumber;
    }
    
    //Setters
    /**
     * 
     * @param creditCardNumber 
     */
    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    //Getters
    /**
     * 
     * @return debitCardNumber
     */
    public int getDebitCardNumber() {
        return debitCardNumber;
    }
    
    //Setters
    /**
     * 
     * @param debitCardNumber 
     */
    public void setDebitCardNumber(int debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }
    
    //Getters
    /**
     * 
     * @return itemID
     */
    public int getItemID() {
        return itemID;
    }
    
    //Setters
    /**
     * 
     * @param itemID 
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    
    //Getters
    /**
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }
    
    //Setters
    /**
     * 
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    //Getters
    /**
     * 
     * @return author
     */
    public String getAuthor() {
        return author;
    }
    
    //Setters
    /**
     * 
     * @param author 
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    //Getters
    /** 
     * 
     * @return genre
     */
    public String getGenre() {
        return genre;
    }
    
    //Setters
    /**
     * 
     * @param genre 
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    //Getters
    /**
     * 
     * @return inStock
     */
    public boolean getInStock() {
        return inStock;
    }
    
    //Setters
    /**
     * 
     * @param inStock 
     */
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    
    //Getters
    /**
     * 
     * @return typeOfProduct
     */
    public String getTypeOfProduct() {
        return typeOfProduct;
    }
    
    //Setters
    /**
     * 
     * @param typeOfProduct 
     */
    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }
    
    //Getters
    /**
     * 
     * @return returnItem
     */
    public String getReturnItem() {
        return returnItem;
    }
    
    //Setters
    /**
     * 
     * @param returnItem 
     */
    public void setReturnItem(String returnItem) {
        this.returnItem = returnItem;
    }
    
    //Getters
    /**
     * 
     * @return days
     */
    public int getDays() {
        return days;
    }
    
    //Setters
    /**
     * 
     * @param days 
     */
    public void setDays(int days) {
        this.days = days;
    }
    
    //Getters
    /**
     * 
     * @return checkReturnStatus
     */
    public boolean getCheckReturnStatus() {
        return checkReturnStatus;
    }
    
    //Setters
    /**
     * 
     * @param checkReturnStatus 
     */
    public void setCheckReturnStatus(boolean checkReturnStatus) {
        this.checkReturnStatus = checkReturnStatus;
    }

    
    //Returns + Changes
    
    //Gather Method
    /**
     * 
     * @return returningSection
     */
    public ArrayList <Returns> getReturningSection() {
        return returningSection;
    }
    
    // Method
    // This method will show the list of return items
    /**
     * 
     * @param returningSection 
     */
    public static void displayReturnsList(ArrayList<ArrayList<Returns>> returningSection) {
        for (ArrayList<Returns> memberReturns : returningSection) {
            for (Returns back : memberReturns) {
                System.out.println("Return Title: " + back.getTitle());
                System.out.println("Return Author: " + back.getAuthor());
                System.out.println("Return Cost: " + back.getCost());
                System.out.println("Return Genre: " + back.getGenre());
                System.out.println("Return InStock: " + back.getInStock());
                System.out.println("Return Type of Product: " + back.getTypeOfProduct());
                System.out.println("Return Item ID: " + back.getItemID());
                System.out.println("Return Number of days since it has been bought: " + back.getDays());
                System.out.println(" ");
        }
    }
}
    
    //Method
    //This method will see if requested item to be returned is still eligible for return based on "return policy"
    //Return Policy: After 30 days, an item is not eligible for return
    /**
     * 
     * @param days
     * @return number of days less than or equal to 30
     */
    public boolean eligibleReturn(int days){
        return days <= 30;
    }
    
    //Method
    //This method will add the requested item to a pending return list (a list of items to be returned)
    /**
     * 
     * @param returnItems 
     */
    public void addReturnItem(Returns returnItems) {
        returningSection.add(returnItems);
    }

    //Method
    //This method will see what form of payment was used
    /**
     * 
     * @param typesOfPayment
     * @return The type of payment method or confirmation that it is the wrong payment method
     */
    public String returnItemPayment(String typesOfPayment) {
        if(typesOfPayment.equals("credit") || typesOfPayment.equals("Credit")) {
            return("Payment Method: credit");
        }
        
        else if (typesOfPayment.equals("debit") || typesOfPayment.equals("Debit")){
            return("Payment method: debit");
        }
        
        else {
            return("Invalid payment method");
        }
    }
    
    //Method
    //This method will tell how much money was refunded from return of the item you had just returned
    /**
     * 
     * @param itemID
     * @return refund amount of requested return item
     */
    public double refundTotal(int itemID) {
        double refundAmount = 0.0;
        
        for (Returns item : returningSection) {
        if (item.getItemID() == itemID) {
            refundAmount = item.getCost(); 
            break; 
            }
        }
        return refundAmount;
    }
}


