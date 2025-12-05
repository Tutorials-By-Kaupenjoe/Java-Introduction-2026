package net.kaupenjoe;

public class Dog {
    // Members
    // Fields
    public String picture;              // accessible from anywhere and changeable
    protected final String name;        // accessible in sub-classes and same package; final => it can't be changed!
    private int age;                    // accessible ONLY within this class

    // Constructors --> "Method" to create a new Instance of a Dog Object
    // Default Constructor
    // public Dog() {

    // }

    public static int numberOfDogs = 0;


    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;

        numberOfDogs++;
    }

    // Methods
    public void birthday() {
        age++;
    }

    public void bark() {
        System.out.println(name + " barked.");
    }

    // Getter
    public int getAge() {
        return age;
    }
}
