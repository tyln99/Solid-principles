package org.example.isp;

/**
 * Interface Segregation Principle (ISP)
 * Definition: Clients should not be forced to depend on interfaces they do not use.
 */
public interface Eatable {
    void eat();
}


//// Before ISP
//public interface Worker {
//    void work();
//    void eat();
//}
//
//public class HumanWorker implements Worker {
//    @Override
//    public void work() {
//        // human working
//    }
//
//    @Override
//    public void eat() {
//        // human eating
//    }
//}
//
//public class RobotWorker implements Worker {
//    @Override
//    public void work() {
//        // robot working
//    }
//
//    @Override
//    public void eat() {
//        // robots do not eat
//        throw new UnsupportedOperationException("Robots don't eat");
//    }
//}