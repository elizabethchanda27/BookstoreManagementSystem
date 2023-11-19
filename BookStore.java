/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chandaelizabethproject1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elizabethchanda
 */
public final class BookStore {
    
    //Attributes
    private static int numBooks = 0;
    private static int numCD = 0;
    private static int numDVD = 0;
    private String title;
    private int itemID;
    private String author;
    private double cost;
    private String genre;
    private boolean inStock;
    private String typeOfProduct;
    private static int numOrder = 0;
    private static int numDays = 31;
    private int days;
    private Scanner scan;
    private final ArrayList<BookStore> bookInventory = new ArrayList<>();
    private final ArrayList<BookStore> cdInventory = new ArrayList<>();
    private final ArrayList<BookStore> dvdInventory = new ArrayList<>();
    public ArrayList <BookStore> checkOutList = new ArrayList<>();
    
    
    //Constructors
    //Add to inventory
    public BookStore() {
        addToCDList();
        addToDVDList();
        addToBookList();
        scan = new Scanner(System.in);
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
    public BookStore(String title, String author, double cost, String genre, boolean inStock, String typeOfProduct, int itemID, int days) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.genre = genre;
        this.inStock = inStock;
        this.typeOfProduct = typeOfProduct;
        this.itemID = itemID;
        this.days = days;
    }
    
    //Constructors
    /**
     * 
     * @param numBooks
     * @param numCD
     * @param numDVD 
     */
    public BookStore(int numBooks, int numCD, int numDVD) {
        BookStore.numBooks = numBooks;
        BookStore.numCD = numCD;
        BookStore.numDVD = numDVD;
    }
    
    //Getter
    public int getNumBooks() {
        return numBooks;
    }
    
    //Setter
    /**
     * 
     * @param numBooks 
     */
    public void setNumBooks(int numBooks) {
        BookStore.numBooks = numBooks;
    }
    
    //Getter
    /**
     * 
     * @return number of CDs
     */
    public int getNumCDs() {
        return numCD;
    }
    
    //Setter
    /**
     * 
     * @param numCD 
     */
    public void setNumCDs(int numCD) {
        BookStore.numCD = numCD;
    }
    
    //Getter
    /**
     * 
     * @return number of DVDs
     */
    public int getNumDVDs() {
        return numDVD;
    }
    
    //Setter
    /**
     * 
     * @param numDVD 
     */
    public void setNumDVDs (int numDVD) {
        BookStore.numDVD = numDVD;
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
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("Cost cannot be negative.");
        }
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
     * @return Title
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
    
    //Decrement (Books)
    public static void decrementNumBooks() {
        numBooks--;
    }

    //Decrement (DVD)
    public static void decrementNumDVD() {
        numDVD--;
    }
    
    //Decrement (CD)
    public static void decrementNumCD() {
        numCD--;
    }
    
    //Increment (Books)
    public void incrementNumBooks() {
        numBooks++;
    }

    //Increment (DVD)
    public void incrementNumDVD() {
        numDVD++;
    }
    
    //Increment (CD)
    public void incrementNumCD() {
        numCD++;
    }
    
    //Increment
    public void incrementNumOrder() {
        numOrder++;
    }
    
    //Decrement
    protected void decrementNumDays() {
        numDays--;
    }
    
    
    //Inventory + Search
    
    //Gather Method
    public void addToCDList() {
        BookStore cd1 = new BookStore("Speak Now", "Taylow Swift", 15.04, "POP Music", true, "CD", 16, 30);
        BookStore cd2 = new BookStore("Give or Take", "Giveon", 13.99, "Contemporary R&B Music", false, "CD", 17, 30);
        BookStore cd3 = new BookStore("I Never Die", "G-IDLE", 13.99, "K-POP Music", true, "CD", 18, 30);
        
        cdInventory.add(cd1);
        incrementNumCD();
        
        cdInventory.add(cd2);
        incrementNumCD();
        
        cdInventory.add(cd3);
        incrementNumCD();
    }
    
    //Gather Method
    public void addToDVDList() {
        BookStore dvd1 = new BookStore("To All the Boys I've Loved", "Jenny Han", 13.99, "Romance/Realistic Fiction", true, "DVD", 11, 30);
        BookStore dvd2 = new BookStore("Kim Yi-Joun, Born 1982", "Cho Nam-ju", 13.99, "Psychological Fiction", true, "DVD", 12, 30);
        BookStore dvd3 = new BookStore("Pride and Prejudice", "Jane Austen", 13.99, "Classic/Romance/Literary Fiction", false, "DVD", 13, 30);
        BookStore dvd4 = new BookStore("Ocean 8", "Jane Austen", 13.99, "Action", true, "DVD", 14, 30);
        BookStore dvd5 = new BookStore("Ponyo", "Studio Ghibli", 14.96, "Animation", true, "DVD", 15, 30);
        
        dvdInventory.add(dvd1);
        incrementNumDVD();
        
        dvdInventory.add(dvd2);
        incrementNumDVD();
        
        dvdInventory.add(dvd3);
        incrementNumDVD();
        
        dvdInventory.add(dvd4);
        incrementNumDVD();
        
        dvdInventory.add(dvd5);
        incrementNumDVD();
    }
    
    //Gather Method
    public void addToBookList() {
        
        BookStore book1 = new BookStore("Tomorrow, Tomorrow, and Tomorrow", "Gabrielle Zevin", 13.99, "Literary Fiction", true, "Book", 1, 30);
        BookStore book2 = new BookStore("Phenomenal Woman", "Maya Angelou", 13.99, "Poetry", true, "Book", 2, 30);
        BookStore book3 = new BookStore("Where the Forest Meets the Stars", "Glendy Vanerah", 13.99, "Domestic Fiction", false, "Book", 3, 30);
        BookStore book4 = new BookStore("The World Keeps Ending, and the World Goes On", "Franny Choi", 13.99, "Poetry", true, "Book", 4, 30);
        BookStore book5 = new BookStore("The Code Breaker", "N.K. Jemisin", 15.59, "Fiction/Magic Realism", true, "Book", 5, 30);
        BookStore book6 = new BookStore("The City We Became", "", 13.99, "Literary Fiction", true, "Book", 6, 30);
        BookStore book7 = new BookStore("Almond", "Sohn Won-pyung", 13.39, "Fiction", false, "Book", 7, 30);
        BookStore book8 = new BookStore("The Physicists Daughter", "Mary Anna Evans", 9.39, "Historical Fiction", true, "Book", 8, 30);
        BookStore book9 = new BookStore("If This Book Exists, Your in the Wrong Universe", "Jason Pargin", 19.27, "Thriller", true, "Book", 9, 30);
        BookStore book10 = new BookStore("Version Zero", "David Yoon" , 18.58, "Science Fiction", true, "Book", 10, 30);
        
        bookInventory.add(book1);
        incrementNumBooks();
        
        bookInventory.add(book2);
        incrementNumBooks();
        
        bookInventory.add(book3);
        incrementNumBooks();
        
        bookInventory.add(book4);
        incrementNumBooks();
        
        bookInventory.add(book5);
        incrementNumBooks();
        
        bookInventory.add(book6);
        incrementNumBooks();
        
        bookInventory.add(book7);
        incrementNumBooks();
        
        bookInventory.add(book8);
        incrementNumBooks();
        
        bookInventory.add(book9);
        incrementNumBooks();
        
        bookInventory.add(book10);
        incrementNumBooks();
    }
    
    //Method
    //Displays Inventory (books, cds, dvds)
    public void displayInventory() {
        
        System.out.println("Book Inventory:");
        int bookIndex = 1;
        for (BookStore products : bookInventory) {
            System.out.println("\t " + bookIndex + ". " + products.getTitle() + " " + "by " + products.getAuthor() + " (Price: " + products.getCost() + " " + ", Genre: " + products.getGenre() + " " + ", Type: " + products.getTypeOfProduct() + ")");
            bookIndex++;
        }

        System.out.println("DVD Inventory:");
        int dvdIndex = 11;
        for (BookStore products : dvdInventory) {
            System.out.println("\t " + dvdIndex + ". " + products.getTitle() + " " + "by " + products.getAuthor() + " (Price: " + products.getCost() + " " + ", Genre: " + products.getGenre() + " " + ", Type: " + products.getTypeOfProduct() + ")");
            dvdIndex++;
        }

        System.out.println("CD Inventory:");
        int cdIndex = 16;
        for (BookStore products : cdInventory) {
            System.out.println("\t " + cdIndex + ". " + products.getTitle() + " " + "by " + products.getAuthor() + " (Price: " + products.getCost() + " " + ", Genre: " + products.getGenre() + " " + ", Type: " + products.getTypeOfProduct() + ")");
            cdIndex++;
        }
    }
    
    /*
      The methods below are used towards a user making a purchase, specifically when they are at checkout. A user would request an item, that item
      is searched for, and then a user can do things such as pay for their items or edit their order if needed. 
    */
    
    
    //Method
    //Searches through inventory for requested item
    /**
     * 
     * @param itemID
     * @return the item that is being requested from inventory
     */
    public BookStore findItemInInventory(int itemID) {
        BookStore itemToPurchase = new BookStore();
        
        // First, search in the book ArrayList
        for (BookStore bookItem : bookInventory) {
            if (bookItem.getItemID() == itemID) {
                itemToPurchase = bookItem;
                break;
            }
        }
            for (BookStore dvdItem : dvdInventory) {
                if (dvdItem.getItemID() == itemID) {
                    itemToPurchase = dvdItem;
                    break;
                }
            }
        

        
            for (BookStore cdItem : cdInventory) {
                if (cdItem.getItemID() == itemID) {
                    itemToPurchase = cdItem;
                    break;
                }
            }
       
        return itemToPurchase;
    }
    
    
    //Method
    //This method will add items to a user's current list of items that they will be paying at checkout
    /**
     * 
     * @param itemID 
     */
    public void addNewOrder(int itemID) {
       
        BookStore product =  findItemInInventory(itemID);
       
        
        //Add item to checkout list
        checkOutList.add(product);
        
        //increment number of items
        incrementNumOrder();
        
        //decrement number of days for item
        decrementNumDays();
    }
    
    //Method
    //This method will say how many items in checkout cart
    /**
     * 
     * @return size of CheckOut List
     */
    public int itemsInCart() {
        return checkOutList.size();
    }
    
    //Method
    //This method will give the total of all items in checkout cart
    /**
     * 
     * @param itemID
     * @return Total Cost of all items in CheckOut List
     */
    public double checkOutCost(int itemID) {
        double totalCost = 0.0;
        for(BookStore itemList : checkOutList) {
            totalCost += itemList.getCost();
        }
        return totalCost;
    }
}
