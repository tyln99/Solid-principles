package org.example.lsp;

public class Ostrich extends Bird {
    @Override
    public void move() {
        walk();
    }

    private void walk() {
        System.out.println("Waking");
    }
}
