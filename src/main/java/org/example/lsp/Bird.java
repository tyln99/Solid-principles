package org.example.lsp;

/**
 * Liskov Substitution Principle (LSP)
 * Definition: Subtypes must be substitutable for their base types
 * without altering the correctness of the program.
 */
public abstract class Bird {
    public abstract void move();
}


//// Violating LSP
//public class Bird {
//    public void fly() {
//        System.out.println("Flying");
//    }
//}
//
//public class Ostrich extends Bird {
//    @Override
//    public void fly() {
//        throw new UnsupportedOperationException("Ostriches can't fly");
//    }
//}