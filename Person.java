// Person.java
public class Person {
    // Fields
    private String name;
    private int age;
    private String email;

    // Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Email: " + email);
    }
}
