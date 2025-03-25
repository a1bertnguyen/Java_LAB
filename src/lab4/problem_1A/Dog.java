package problem_1A;

public class Dog extends Manimal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog d) {
        System.out.println("Woof");

    }

    @Override
    public String toString() {
        return "Mainmal[" + super.toString() + "]";
    }
}
