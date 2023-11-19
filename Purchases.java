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
public class Purchases {
    
    //Fields
    private String paymentMethod;
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
    private static int numOrder = 0;
    private final ArrayList <Purchases> currentPurchases = new ArrayList<>();
    
    //Constructors
    public Purchases() {
        
    }
    
    //Constructors
    /**
     * 
     * @param title
     * @param author
     * @param cost
     * @param genre
     * @param inStock
     * @param typeOfProduct
     * @param itemID
     * @param days 
     */
    public Purchases(String title, String author, double cost, String genre, boolean inStock, String typeOfProduct, int itemID, int days){
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.genre = genre;
        this.inStock = inStock;
        this.typeOfProduct = typeOfProduct;
        this.itemID = itemID;
        this.days = days;
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
     * @return payment method
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    //Setters
    /**
     * 
     * @param paymentMethod 
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    //Getters
    /**
     * 
     * @return credit card number
     */
    protected int getCreditCardNumber() {
        return creditCardNumber;
    }
    
    //Setters
    /**
     * 
     * @param creditCardNumber 
     */
    protected void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    //Getters
    /**
     * 
     * @return debit card number
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
     * @return item ID
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
    
    //Increment
    public static void incrementNumOrder() {
        numOrder++;
    }
    
    //Getters
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
     * @return type of product
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
    
    //Current Purchases (already bought)
    
    //Gather Method
    //Items that have already been purchased (not planning on being returned)
    /**
     * 
     * @return List of Current Purchases
     */
    public ArrayList <Purchases> getCurrentPurchases() {
        return currentPurchases;
    }
   
    // Method
    // This method will show purchased items history (list of all purchased items)
    /**
     * 
     * @param purchaseList 
     */
    public static void displayPurchaseList(ArrayList <Purchases> purchaseList) {
            for (Purchases purchase : purchaseList) {
                System.out.println("Title: " + purchase.getTitle());
                System.out.println("Author: " + purchase.getAuthor());
                System.out.println("Cost: " + purchase.getCost());
                System.out.println("Genre: " + purchase.getGenre());
                System.out.println("InStock: " + purchase.getInStock());
                System.out.println("Type of Product: " + purchase.getTypeOfProduct());
                System.out.println("Item ID: " + purchase.getItemID());
                System.out.println("Number of days since it has been bought: " + purchase.getDays());
                System.out.println(" ");
            }
        }
    
    //Method
    //Doesn't include the checkout list items due to adding the items that have recently been purchased would take 1-3 business days
    public void displayAllPurchasedItems() {
        System.out.println("=== Current Purchases ===");
        displayPurchaseList(currentPurchases);
    }
}






