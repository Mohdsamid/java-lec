public class lec9 {
// Parent class
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

// Child class inheriting Employee
class Manager extends Employee {
    void attendMeeting() {
        System.out.println("Manager is attending a meeting.");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {

        // Creating object of Manager
        Manager m = new Manager();

        // Calling methods
        m.work();           // inherited from Employee
        m.attendMeeting();  // Manager's own method
    }
}
}