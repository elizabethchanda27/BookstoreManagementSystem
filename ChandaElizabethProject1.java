/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chandaelizabethproject1;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author elizabethchanda
 */
public class ChandaElizabethProject1 {

    public static void main(String[] args) {

        //Scanners
        Scanner scan = new Scanner(System.in);
 
        //Objects
        RegularMemberships regular = new RegularMemberships();
        PremiumMemberships premium = new PremiumMemberships();
        BookStore book = new BookStore();
        Returns process = new Returns();
        Purchases money = new Purchases();
        
        
        //Instances

        //Regular Members
        RegularMemberships member1 = new RegularMemberships("Beomgyu", "beoomgy@txtmember@gmail.com", 0, "842 Sherman St., Long Beach, NY, 11561");
        RegularMemberships member2 = new RegularMemberships("Felix", "Felixsunshine@gmail.com", 1, "8206 Queen Drive, Allison Park, PA, 15101");
        RegularMemberships member3 = new RegularMemberships("Lisa", "Lisamoney@gmail.com", 2, "9656 Foxrun Street, Anaheim, CA, 92806");
        RegularMemberships member4 = new RegularMemberships("Jennie", "Jenniesolo@gmail.com", 3, "South Race Street, San Jose, CA, 95127");
        RegularMemberships member5 = new RegularMemberships("Gudatama", "GudatamatheEgg@yahoo.com", 4, "Pierce Lane, Jacksonville, NC, 28540");

        regular.getRegularMemberList().add(member1);
        regular.getRegularMemberList().add(member2);
        regular.getRegularMemberList().add(member3);
        regular.getRegularMemberList().add(member4);
        regular.getRegularMemberList().add(member5);
        
        //Premium Members
        PremiumMemberships member6 = new PremiumMemberships ("Laura", "lauraandspringrolls@yahoo.com", 6, "842 Sherman St., Long Beach, NY 11561", 80.00, 200.00);
        PremiumMemberships member7 = new PremiumMemberships ("Andrew", "andrew123@gmail.com", 7, "8206 Queen Drive, Allison Park, PA, 15101", 100.00, 90.50);
        PremiumMemberships member8 = new PremiumMemberships ("Mathew", "mathewrice201@gmail.com", 8, "9656 Foxrun Street, Anaheim, CA, 92806", 10.75, 35.10);
        PremiumMemberships member9 = new PremiumMemberships ("Katherine", "katherinekimichi789@gmail.com", 9, "South Race Street, San Jose, CA, 95127", 400.00, 75.00);
        PremiumMemberships member10 = new PremiumMemberships ("Taehyun", "taehyun22@yahoo.com", 10, "Pierce Lane, Jacksonville, NC, 28540", 700.00, 700.00);
        
        premium.getPremiumMemberList().add(member6);
        premium.getPremiumMemberList().add(member7);
        premium.getPremiumMemberList().add(member8);
        premium.getPremiumMemberList().add(member9);
        premium.getPremiumMemberList().add(member10);
        
        //Purchases History 
        //Member1
        Purchases bought1 = new Purchases("Tomorrow, Tomorrow, and Tomorrow", "Gabrielle Zevin", 13.99, "Literary Fiction", true, "Book", 9, 7);
        Purchases bought2 = new Purchases("The City We Became", "", 13.99, "Literary Fiction", true, "Book", 6, 7);
        
        //Member2
        Purchases bought3 = new Purchases("Speak Now", "Taylow Swift", 15.04, "POP Music", true, "CD", 16, 7);
        Purchases bought4 = new Purchases("Ponyo", "Studio Ghibli", 14.96, "Animation", true, "DVD", 15, 13);
        
        //Member3
        Purchases bought5 = new Purchases("Tomorrow, Tomorrow, and Tomorrow", "Gabrielle Zevin", 13.99, "Literary Fiction", true, "Book", 1, 19);
        Purchases bought6 = new Purchases("Ponyo", "Studio Ghibli", 14.96, "Animation", true, "DVD", 15, 13);
        Purchases bought7 = new Purchases("Almond", "Sohn Won-pyung", 13.39, "Fiction", false, "Book", 7, 9);
        
        //Member4
        Purchases bought8 = new Purchases("Give or Take", "Giveon", 13.99, "Contemporary R&B Music", false, "CD", 17, 10);
        
        //Member5
        Purchases bought9 = new Purchases("I Never Die", "G-IDLE", 13.99, "K-POP Music", true, "CD", 18, 20);
        
        //Member6
        Purchases bought10 = new Purchases("Version Zero", "David Yoon" , 18.58, "Science Fiction", true, "Book", 10, 25);
        
        //Member7
        Purchases bought11 = new Purchases("Tomorrow, Tomorrow, and Tomorrow", "Gabrielle Zevin", 13.99, "Literary Fiction", true, "Book", 9, 2);
        
        //Member8
        Purchases bought12 = new Purchases("Phenomenal Woman", "Maya Angelou", 13.99, "Poetry", true, "Book", 2, 18);
        
        //Member9
        Purchases bought13 = new Purchases("Pride and Prejudice", "Jane Austen", 13.99, "Classic/Romance/Literary Fiction", false, "DVD", 13, 30);
        
        //Member10
        Purchases bought14 = new Purchases("The Code Breaker", "N.K. Jemisin", 15.59, "Fiction/Magic Realism", true, "Book", 5, 15);

        
        money.getCurrentPurchases().add(bought1);
        money.getCurrentPurchases().add(bought2);
        money.getCurrentPurchases().add(bought3);
        money.getCurrentPurchases().add(bought4);
        money.getCurrentPurchases().add(bought5);
        money.getCurrentPurchases().add(bought6);
        money.getCurrentPurchases().add(bought7);
        money.getCurrentPurchases().add(bought8);
        money.getCurrentPurchases().add(bought9);
        money.getCurrentPurchases().add(bought10);
        money.getCurrentPurchases().add(bought11);
        money.getCurrentPurchases().add(bought12);
        money.getCurrentPurchases().add(bought13);
        money.getCurrentPurchases().add(bought14);
        
        //Return List
        //Member1
        Returns items1 = new Returns(16, "Speak Now", "Taylow Swift", 15.04, "POP Music", true, "CD", 7, true);
        Returns items2 = new Returns(14, "Ocean 8", "Jane Austen", 13.99, "Action", true, "DVD", 15, false);
        
        //Member2
        Returns items3 = new Returns(2, "Phenomenal Woman", "Maya Angelou", 13.99, "Poetry", true, "Book", 11, true);
        Returns items4 = new Returns(7, "Almond", "Sohn Won-pyung", 13.39, "Fiction", false, "Book", 7, true);
        
        //Member3
        Returns items5 = new Returns(1, "Tomorrow, Tomorrow, and Tomorrow", "Gabrielle Zevin", 13.99, "Literary Fiction", true, "Book", 3, false);
        
        //Member4
        Returns items6 = new Returns(10, "Version Zero", "David Yoon" , 18.58, "Science Fiction", true, "Book", 2, true);
        Returns items7 = new Returns(8, "The Physicists Daughter", "Mary Anna Evans", 9.39, "Historical Fiction", true, "Book", 20, true);
        
        //Member5
        Returns items8 = new Returns(10, "Version Zero", "David Yoon" , 18.58, "Science Fiction", true, "Book", 12, false);
        Returns items9 = new Returns(1, "Tomorrow, Tomorrow, and Tomorrow", "Gabrielle Zevin", 13.99, "Literary Fiction", true, "Book", 20, false);
        
        //Member6
        Returns items10 = new Returns(14, "Ocean 8", "Jane Austen", 13.99, "Action", true, "DVD", 7, true);
        Returns items11 = new Returns(1, "Tomorrow, Tomorrow, and Tomorrow", "Gabrielle Zevin", 13.99, "Literary Fiction", true, "Book", 25, false);
        
        //Member7
        Returns items12 = new Returns(5, "The Code Breaker", "N.K. Jemisin", 15.59, "Fiction/Magic Realism", true, "Book", 5, false);
        
        //Member8
        Returns items13 = new Returns(10, "Version Zero", "David Yoon" , 18.58, "Science Fiction", true, "Book", 0, false);
        Returns items14 = new Returns(16, "Speak Now", "Taylow Swift", 15.04, "POP Music", true, "CD", 3, true);
        Returns items15 = new Returns(15, "Ponyo", "Studio Ghibli", 14.96, "Animation", true, "DVD", 18, true);
        
        //Member9
        Returns items16 = new Returns(1, "Tomorrow, Tomorrow, and Tomorrow", "Gabrielle Zevin", 13.99, "Literary Fiction", true, "Book", 29, false);
        Returns items17 = new Returns(6, "The City We Became", "", 13.99, "Literary Fiction", true, "Book", 8, true);
        Returns items18 = new Returns(13, "Pride and Prejudice", "Jane Austen", 13.99, "Classic/Romance/Literary Fiction", false, "DVD", 1, false);
        
        //Member10
        Returns items19 = new Returns(18, "I Never Die", "G-IDLE", 13.99, "K-POP Music", true, "CD", 1, true);
        
        process.getReturningSection().add(items1);
        process.getReturningSection().add(items2);
        process.getReturningSection().add(items3);
        process.getReturningSection().add(items4);
        process.getReturningSection().add(items5);
        process.getReturningSection().add(items6);
        process.getReturningSection().add(items7);
        process.getReturningSection().add(items8);
        process.getReturningSection().add(items9);
        process.getReturningSection().add(items10);
        process.getReturningSection().add(items11);
        process.getReturningSection().add(items12);
        process.getReturningSection().add(items13);
        process.getReturningSection().add(items14);
        process.getReturningSection().add(items15);
        process.getReturningSection().add(items16);
        process.getReturningSection().add(items17);
        process.getReturningSection().add(items18);
        process.getReturningSection().add(items19);
        
        while (true) {
            System.out.println("Welcome to the automated Bookstore System!");
            System.out.println("Select from one of the following options: ");
            System.out.println("\t 1. Make a purchase");
            System.out.println("\t 2. Become a member");
            System.out.println("\t 3. Return an item");
            System.out.println("\t 4. Exit");
            
            int num = scan.nextInt();
            boolean exitMenu = false;
            
            switch(num) {
                case 1:
                while(!exitMenu) {
                    while(true) {
                    //Asks user what they would like to purchase
                    System.out.println("Which of the following items would you like to purchase?");
                    
                    //Display Book Inventory
                    book.displayInventory();
                    
                    int num1 = scan.nextInt();
                    scan.nextLine();

                    // Search for the requested item in the book, dvd, and cd ArrayLists
                    BookStore itemToPurchase = book.findItemInInventory(num1);

                    if (!itemToPurchase.equals(new BookStore())) {
                        //Adds item to order
                        book.addNewOrder(num1);
                        System.out.println("You have added " + itemToPurchase.getTitle() + " to your cart.");
                    } 
                    else {
                        // Item not found in any inventory
                        System.out.println("Item not found in inventory.");
                    }
                    
                    //Tells user how many items is currently in their cart
                    System.out.println("You have " + book.itemsInCart() + " items in your cart. Are you done editing your cart?");
                    System.out.println("\t 1. Yes");
                    System.out.println("\t 2. No");
                    
                    int num2 = scan.nextInt();
                    scan.nextLine();

                    
                    //Ask if they are done ordering
                    //If they are done, take them to checkout                    
                    if(num2 == 1) {

                        //Rings up the cost and shows user (Checkout)
                        double cost = book.checkOutCost(num1);
                        System.out.println("Your total comes to " + cost);


                        //When item is bought, inventory changes
                        if(num2 <= 10) {
                            book.getNumBooks();
                            book.incrementNumBooks();
                        }
                        else if(num2 > 10 && num2 <= 15 ) {
                            book.getNumDVDs();
                            book.incrementNumDVD();
                        }
                        else if(num2 >= 16) {
                            book.getNumCDs();
                            book.incrementNumCD();
                        }

                        //If the user is done shopping, then ask which member is shopping today
                        //Members are already sorted as premium members or regular members in methods
                        int memberIndex = 1;
                        System.out.println("Which member is making a purchase today?");
                        System.out.println("Please select which member is making this purchase");

                        // Display regular members' names
                        for (RegularMemberships regularMember : regular.getRegularMemberList()) {
                            System.out.println("\t " + memberIndex + ". " + regularMember.getRegName());
                            memberIndex++;
                        }

                        // Display premium members' names
                        for (PremiumMemberships premiumMember : premium.getPremiumMemberList()) {
                            System.out.println("\t " + memberIndex + ". " + premiumMember.getPreName());
                            memberIndex++;
                        }
                        
                        //Last Option
                        int totalMembers = memberIndex - 1;
                        int registerOptionIndex = totalMembers + 1;
                        
                        System.out.println("\t " + registerOptionIndex + ". Register as a new member");
                        
                        int selectedMemberIndex = scan.nextInt();
                        scan.nextLine();

                        if (selectedMemberIndex >= 1 && selectedMemberIndex <= regular.getRegularMemberList().size()) {
                            // User selected a regular member, perform purchase for regular member
                            RegularMemberships selectedRegularMember = regular.getRegularMemberList().get(selectedMemberIndex - 1);
                        }
                        else if (selectedMemberIndex > regular.getRegularMemberList().size() && selectedMemberIndex <= (regular.getRegularMemberList().size() + premium.getPremiumMemberList().size())) {
                            // User selected a premium member, perform purchase for premium member
                            PremiumMemberships selectedPremiumMember = premium.getPremiumMemberList().get(selectedMemberIndex - regular.getRegularMemberList().size() - 1);
                            System.out.println("How much the selected premium member has paid towards membership fees since joining: $" + selectedPremiumMember.getCurrentTotal());
                            System.out.println("How much the selected premium member should have paid for membership fees since joining: $" + selectedPremiumMember.getCorrectTotal());

                            //If they choose a name that is a part of the premium members list, check if their fees are paid
                            //Premium Member would go through the process of seeing if their fees are paid. If their fees are paid, then they will continue with their purchase.
                            //If not, they will pay their fee in order to continue with purchase or cancel membership and not proceed with purchase.
                            
                            if(selectedPremiumMember.checkFeesAndProceed() == true) {
                                System.out.println("Fees are paid. Proceed with the purchase.");
                            }
                            else {
                                System.out.println("Fees are not paid. You need to pay your fees in order to continue getting the benefits that a premium member recieves.");
                            }
                        }
                            
                        else if (selectedMemberIndex == (regular.getRegularMemberList().size() + premium.getPremiumMemberList().size() + 1)) {
                            // User chose to register as a new member
                            System.out.println("You have selected the last option. Please select option 2 when you return to the menu options, so that you could become a member at our bookstore:)");
                            break;
                        } 
                        else {
                            // Invalid selection
                            System.out.println("Invalid selection.");
                        }

                        //Finalizing Transaction 
                        //Ask for method of payment
                        System.out.println("What type of payment are you using today");
                        System.out.println("\t 1. Credit");
                        System.out.println("\t 2. Debit");
                        String response2 = scan.nextLine();
                        if ("1".equals(response2)) {
                            while(true) {
                            // Credit Card Process for Checkout Payment
                            System.out.println("Input your credit card number (format: 0000 0000 0000 0000): ");
                            String creditCardNumber = scan.nextLine();
                            
                            if(creditCardNumber.matches("\\d{4} \\d{4} \\d{4} \\d{4}")) {
                                // If payment is successful, finalize the order
                                System.out.println("Payment Completed! Thank you for shopping with us! Come back again soon :)");
                                break;
                            }
                            else {
                                // Input is not in the correct format
                                System.out.println("Invalid input. Please enter an 8-digit credit card number.");
                            }
                        } 
                    }
                        else if ("2".equals(response2)) {
                            while(true) { 
                            //  Debit Card Process or Checkout Payment
                            System.out.println("Input your debit card number (format: 0000 0000 0000 0000): ");
                            String debitCardNumber = scan.nextLine();
                            
                            if(debitCardNumber.matches("\\d{4} \\d{4} \\d{4} \\d{4}")) {
                                // If payment is successful, finalize the order
                                System.out.println("Payment Completed! Thank you for shopping with us! Come back again soon :)");
                                break;
                            }
                            else {
                                System.out.println("Invalid payment option selected.");
                            }
                        }
                    }
                        
                        System.out.println("Do you want to continue shopping?");
                        System.out.println("\t 1. Continue shopping");
                        System.out.println("\t 2. Exit");
                        
                        int continueChoice = scan.nextInt();
                        scan.nextLine();  

                        if (continueChoice == 2) {
                        // User chose to exit
                        exitMenu = true;
                        break;
                        }
                  }
                }
              }
                break;
                case 2: 
                    System.out.println("Let's get you registered as a regular member!");
                    System.out.println("Would you like to register as a regular member or a premium member");
                    System.out.println("\t 1. Regular Member");
                    System.out.println("\t 2. Premium Member");
                    int num6 = scan.nextInt();
                    scan.nextLine();
                    
                    //If the user selects the option to become a regular member, then this will ask the user questions about their contact information as they become a regular member
                    if(num6 == 1) {
                        String regName = "";
                        String regEmail = ""; 
                        int regNumber = 0;
                        String regAddress = "";
                        
                        //Validation for name
                        while(true) {
                        System.out.println("Enter your name: ");
                        regName = scan.nextLine();
                            if(regular.validateRegName(regName)) {
                                break;
                            }
                            else {
                                System.out.println("Incorrect format. Make sure that the name includes only letters. Try Again.");
                            }
                        }
                        
                        //Validation for email
                        while(true) {
                        System.out.println("Enter your email (ex: ian123@gmail.com, jane789@yahoo.com): ");
                        regEmail = scan.nextLine();
                            if(regular.validateRegEmail(regEmail)) {
                                break;
                            }
                            else {
                                System.out.println("Incorrect format. The email needs to have '\\.com$' and an '@' in the input. Try Again.");
                            }
                        }
                        
                        //Validation for phone number
                        while(true) {
                        System.out.println("Enter your phone number (1234567890): ");
                        regNumber = scan.nextInt();
                        scan.nextLine();
                            if(regular.validateRegPhoneNumber(regNumber)) {
                                break;
                            }
                            else {
                                System.out.println("Incorrect format. Phone number should have 11 digits. Try Again.");
                            }
                        }
                        
                        //Validation for address
                        while(true) {
                        System.out.println("Enter your address or current location (Example: 7130 Glen Creek Ave., Brick, NJ, 08723): ");
                        regAddress = scan.nextLine();
                            if(regular.validateRegAddress(regAddress)) {
                                break;
                            }
                            else {
                                System.out.println("Incorrect form. Make sure it has a street, city, state in acronym form, and zipcode. Try Again.");
                            }
                        }
                        
                        //Store them in the regular members list
                        regular.addRegularMember(regName, regEmail, regNumber, regAddress);
                        System.out.println("Congrats on becoming a regular member " + regName + "!");
                    }
                    else if(num6 == 2) {
                      String preName = "";
                      String preEmail = "";
                      int preNumber = 0;
                      String preAddress = "";
                        //Validation for Name
                        while(true) {
                        System.out.println("Enter your name: ");
                        preName = scan.nextLine();
                            if(premium.validatePreName(preName)) {
                                break;
                            }
                            else {
                                System.out.println("Incorrect format. Make sure that the name includes only letters. Try Again.");
                            }
                        }
                        
                        //Validation for Email
                        while(true) {
                        System.out.println("Enter your email(ex: ian123@gmail.com, jane789@yahoo.com): ");
                        preEmail = scan.nextLine();
                            if(premium.validatePreEmail(preEmail)) {
                                break;
                            }
                            else {
                                System.out.println("Incorrect format. The email needs to have '\\.com$' and an '@' in the input. Try Again.");
                            }
                        }
                        
                        //Validation for Phone Number
                        while(true) {
                        System.out.println("Enter your phone number: ");
                        preNumber = scan.nextInt();
                        scan.nextLine();
                            if(premium.validatePrePhoneNumber(preNumber)) {
                                break;
                            }
                            else {
                                System.out.println("Incorrect format. Phone number should have 10 digits. Try Again.");
                            }
                        }
                        
                        //Validation for Address
                        while(true) {
                        System.out.println("Enter your address or current location (Example: 7130 Glen Creek Ave., Brick, NJ, 08723): ");
                        preAddress = scan.nextLine();
                            if(premium.validatePreAddress(preAddress)) {
                                break;
                            }
                            else {
                                System.out.println("Incorrect form. Make sure it has a street, city, state in acronym form, and zipcode. Try Again.");
                            }
                        }
                        
                        //Membership fee
                        System.out.println("The premium member fee is $10.00.");
                        
                        //Ask what type of payment
                        System.out.println("To be a premium member, you need to pay a fee to finalize this process. What payment method are you using today: ");
                        System.out.println("\t 1. Credit Card [Type in 'Credit']");
                        System.out.println("\t 2. Debit Card [Type in 'Debit')");
                        String response10 = scan.nextLine();

                        
                        if("Credit".equals(response10) || "credit".equals(response10)) {
                            //Credit Card Process for Premium Membership
                            while(true) {
                            premium.membershipPaymentPending(response10);
                            System.out.print("Type in your credit card number (format: 0000 0000 0000 0000): ");
                            String response11 = scan.nextLine();
                            System.out.println(response11);
                            
                                if(response11.matches("\\d{4} \\d{4} \\d{4} \\d{4}")) {
                                //Execute payment
                                premium.incrementCurrentTotalFee();
                                premium.incrementCorrectTotalFee();


                                //Store them in the premium members list
                                premium.addPremiumMember();

                                System.out.println("Congrats on becoming a premium member " + preName + "!");
                                break;
                                }
                                else {
                                // Input is not in the correct format
                                System.out.println("Invalid input. Please enter an 8-digit credit card number.");
                            }
                          }
                        }
                        else if ("debit".equals(response10) || "Debit".equals(response10)){
                            //Debit Card Process for Premium Membership
                            premium.membershipPaymentPending(response10);
                            System.out.print("Type in your debit card number (format: 0000 0000 0000 0000): ");
                            String response11 = scan.nextLine();
                            System.out.println(response11);
                            
                            if(response11.matches("\\d{4} \\d{4} \\d{4} \\d{4}")) {
                                //Execute payment
                                premium.incrementCurrentTotalFee();
                                premium.incrementCorrectTotalFee();


                                //Store them in the premium members list
                                premium.addPremiumMember();

                                System.out.println("Congrats on becoming a premium member " + preName + "!");
                                break;
                                }
                                else {
                                // Input is not in the correct format
                                System.out.println("Invalid input. Please enter an 8-digit credit card number.");
                            }
                          }
                        }
                    break;

                case 3:
                boolean exitReturn = false;
                    
                while(!exitMenu){
                System.out.println("Which member is making a return today?");
                System.out.println("Please select which member is making this return.");

                //Members are already sorted as premium members or regular members in methods
                        int memberIndex = 1;
                        System.out.println("Which member is making a purchase today?");
                        System.out.println("Please select which member is making this purchase");

                        // Display regular members' names
                        for (RegularMemberships regularMember : regular.getRegularMemberList()) {
                            System.out.println("\t " + memberIndex + ". " + regularMember.getRegName());
                            memberIndex++;
                        }

                        // Display premium members' names
                        for (PremiumMemberships premiumMember : premium.getPremiumMemberList()) {
                            System.out.println("\t " + memberIndex + ". " + premiumMember.getPreName());
                            memberIndex++;
                        }
                        
                        //Last Option
                        int totalMembers = memberIndex - 1;
                        int registerOptionIndex = totalMembers + 1;
                        
                        System.out.println("\t " + registerOptionIndex + ". Register as a new member");
                        
                        // Read user input for member selection
                        int selectedMemberIndex = scan.nextInt();
                        scan.nextLine();

                        if (selectedMemberIndex >= 1 && selectedMemberIndex <= regular.getRegularMemberList().size()) {
                            // User selected a regular member
                            RegularMemberships selectedRegularMember = regular.getRegularMemberList().get(selectedMemberIndex - 1);
                        }
                        else if (selectedMemberIndex > regular.getRegularMemberList().size() && selectedMemberIndex <= (regular.getRegularMemberList().size() + premium.getPremiumMemberList().size())) {
                            // User selected a premium member
                            PremiumMemberships selectedPremiumMember = premium.getPremiumMemberList().get(selectedMemberIndex - regular.getRegularMemberList().size() - 1);

                            //If they choose a name that is a part of the premium members list, check if their fees are paid
                            //Premium Member would go through the process of seeing if their fees are paid. If their fees are paid, then they will continue with their purchase.
                            //If not, they will pay their fee in order to continue with purchase or cancel membership and not proceed with purchase.
                            premium.checkFeesAndProceed();
                        }
                        else if (selectedMemberIndex == (regular.getRegularMemberList().size() + premium.getPremiumMemberList().size() + 1)) {
                            // User chose to register as a new member
                            System.out.println("You have selected the last option. Please select option 2 when you return to the menu options, so that you could become a member at our bookstore:)");
                            break;
                        } 
                        else {
                            // Invalid selection
                            System.out.println("Invalid selection.");
                        }
                
                // Check if num8 is within the range of returnedItems
                //If the selected member number is valid, list return history for the selected member
                ArrayList <Returns> returnedItems = process.getReturningSection();
                if (selectedMemberIndex >= 1 && selectedMemberIndex <= returnedItems.size()) {
                    System.out.println("What item would you like to return today? Enter the item ID you want to return.");
                    Returns selectedReturnItem = returnedItems.get(selectedMemberIndex - 1);

                        // Display all purchased items for the selected return
                        money.displayAllPurchasedItems();
                        
                        //User Input for which item to return (use item ID)
                        int num9 = scan.nextInt();
                        scan.nextLine();
                        
                        // Search for the item to return in the selected member's return list
                        Returns itemToReturn = null;
                        for (Returns returnItem : process.getReturningSection()) {
                            if (returnItem.getItemID() == num9) {
                                itemToReturn = returnItem;
                                break;
                            }
                        }

                        // Check if the selected item number is valid
                        if (itemToReturn != null) {
                            // Ask what type of payment
                            System.out.println("How did you pay for this item?");
                            System.out.println("\t 1. Credit Card [Type in 'Credit']");
                            System.out.println("\t 2. Debit Card [Type in 'Debit']");

                            String method = scan.nextLine();

                            if ("Credit".equalsIgnoreCase(method)) {
                                // Handle credit card payment
                                premium.membershipPaymentPending(method);
                                System.out.print("Type in your credit card number (format: 0000 0000 0000 0000): ");
                                String response12 = scan.nextLine();
                                System.out.println(response12);
                                
                                if(response12.matches("\\d{4} \\d{4} \\d{4} \\d{4}")) {
                                    // Process the return for the selected item
                                    double refundAmount = process.refundTotal(num9);

                                    // Add item to the return list
                                    selectedReturnItem.addReturnItem(itemToReturn);


                                    // Display refund amount
                                    System.out.println("Your return was successful! The amount you will be refunded is: $" + refundAmount);

                                    // Ask if they are done returning their items
                                    System.out.println("Are you done returning your items?");
                                    System.out.println("\t 1. Yes");
                                    System.out.println("\t 2. No");

                                    int reply = scan.nextInt();

                                    if (reply == 1) {
                                        System.out.println("Thank you for shopping with us! We hope to see you again!");
                                    }
                                }
                            } else if ("Debit".equalsIgnoreCase(method)) {
                                // Handle debit card payment
                                premium.membershipPaymentPending(method);
                                System.out.print("Type in your debit card number (format: 0000 0000 0000 0000): ");
                                String response12 = scan.nextLine();
                                System.out.println(response12);
                                
                                if(response12.matches("\\d{4} \\d{4} \\d{4} \\d{4}")) {
                                    // Process the return for the selected item
                                    double refundAmount = process.refundTotal(num9);

                                    // Add item to the return list
                                    selectedReturnItem.addReturnItem(itemToReturn);


                                    // Display refund amount
                                    System.out.println("Your return was successful! The amount you will be refunded is: $" + refundAmount);

                                    // Ask if they are done returning their items
                                    System.out.println("Are you done returning your items?");
                                    System.out.println("\t 1. Yes");
                                    System.out.println("\t 2. No");

                                    int continueReturning = scan.nextInt();
                                    scan.nextLine();  

                                    if(continueReturning == 1){
                                        System.out.println("Thank you for shopping with us! We hope to see you again!");

                                        // User chose to exit
                                        exitReturn = true;
                                        break;
                                    }
                                }
                            } 
                            else {
                                System.out.println("Invalid payment method selected.");
                            }
                        } 
                        else {
                            System.out.println("Invalid item number selected.");
                        }
                    } 
                    else {
                        System.out.println("Invalid return item number selected.");
                    }
                
                    System.out.println("Do you want to continue returning items?");
                    System.out.println("\t 1. Continue returning");
                    System.out.println("\t 2. Exit");
                }  
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, but you need to enter a 1, 2, 3, 4, or 5");

                }
            }
        }
    }
