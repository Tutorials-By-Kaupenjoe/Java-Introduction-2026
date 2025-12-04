package net.kaupenjoe;

public class Dog {
    // Members
    // Fields
    public String picture;
    public String name;
    public int age;

    // Constructors --> "Method" to create a new Instance of a Dog Object
    // Default Constructor
    // public Dog() {

    // }

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    // Methods
    public void birthday() {
        age++;
    }

    public void bark() {
        System.out.println(name + " barked.");
    }
}
