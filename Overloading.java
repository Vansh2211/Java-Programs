public class Overloading {
    private String name;
    private int age;
    private String major;

    // Default constructor
    public Overloading() {
        this.name = "Unknown";
        this.age = 0;
        this.major = "Undeclared";
    }

    // Constructor with one parameter
    public Overloading(String name) {
        this.name = name;
        this.age = 0;
        this.major = "Undeclared";
    }

    // Constructor with two parameters
    public Overloading(String name, int age) {
        this.name = name;
        this.age = age;
        this.major = "Undeclared";
    }

    // Constructor with three parameters
    public Overloading(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }

    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        student1.displayInfo();
        System.out.println();

        // Using constructor with one parameter
        Overloading student2 = new Overloading("Alice");
        student2.displayInfo();
        System.out.println();

        // Using constructor with two parameters
        Overloading student3 = new Overloading("Bob", 20);
        student3.displayInfo();
        System.out.println();

        // Using constructor with three parameters
        Overloading student4 = new Overloading("Charlie", 22, "Computer Science");
        student4.displayInfo();
    }
}
