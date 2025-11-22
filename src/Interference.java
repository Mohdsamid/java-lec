// first ques

/*interface Vehicle {
    // Default method
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle {
    // Car class doesn't override start(), so it uses the default method
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Calling default method of interface
    }
}*/

// second ques

// First Interface
/*interface Walkable {
    void walk();
}

// Second Interface
interface Runnable {
    void run();
}

// Class implementing both interfaces
class Human implements Walkable, Runnable {

    @Override
    public void walk() {
        System.out.println("Human is walking...");
    }

    @Override
    public void run() {
        System.out.println("Human is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        Human person = new Human();
        
        person.walk();  // Calling walk()
        person.run();   // Calling run()
    }
}*/

//third ques

// Interface A
interface A {
    void display();
}

// Interface B
interface B {
    void display();
}

// Class implementing both interfaces
class Demo implements A, B {

    @Override
    public void display() {
        System.out.println("Display method from Demo class");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();  // Calling the implemented method
    }
}
