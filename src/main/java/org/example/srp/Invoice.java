package org.example.srp;

/**
 * Single Responsibility Principle (SRP)
 * Definition: A class should have only one reason to change,
 * meaning it should have only one job or responsibility.
*/
public class Invoice {
    public void createInvoice() {
        // code to create invoice
    }
}


//// Before SRP
//public class Invoice {
//    public void createInvoice() {
//        // code to create invoice
//    }
//
//    public void printInvoice() {
//        // code to print invoice
//    }
//
//    public void emailInvoice() {
//        // code to email invoice
//    }
//}
