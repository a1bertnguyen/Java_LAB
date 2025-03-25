package problem_1A;

public class Cat extends Manimal {
    public Cat(String name) {
        super(name);
    }

    public void greats() {
        System.out.println("Meow Meow");
    }

    @Override
    public String toString() {
        return "Mainmal[" + super.toString() + "]";
    }

}
