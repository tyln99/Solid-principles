package org.example.lsp;

public class FlyingBird extends Bird {
    @Override
    public void move() {
        fly();
    }

    private void fly() {
        System.out.println("Flying");
    }
}
