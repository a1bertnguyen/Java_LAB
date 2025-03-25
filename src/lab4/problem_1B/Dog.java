package problem_1B;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);

    }

    public void greets() {
        System.out.println("woof");
    }

    public void greets(Dog d1) {
        System.out.println("Wooof");
    }

}
