package problem_1B;

public class TestAnimal {
    public static void main(String[] args) {
        // Create instances
        Cat cat = new Cat("Kitty");
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Max");
        BigDog bigDog1 = new BigDog("Bruno");

        System.out.println("Cat greets:");
        cat.greets();

        System.out.println("\nDog greets:");
        dog1.greets();

        System.out.println("Dog greets another dog:");
        dog1.greets(dog2);

        System.out.println("\nBigDog greets:");
        bigDog1.greets();

        System.out.println("BigDog greets another Dog:");
        bigDog1.greets(dog1);

    }
}
