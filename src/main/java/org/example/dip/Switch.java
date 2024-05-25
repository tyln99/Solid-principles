package org.example.dip;

/**
 * Dependency Inversion Principle (DIP)
 * Definition: High-level modules should not depend on low-level modules.
 * Both should depend on abstractions. Abstractions should not depend on details.
 * Details should depend on abstractions.
 */
public class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
