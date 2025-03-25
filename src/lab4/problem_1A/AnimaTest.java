package problem_1A;

public class AnimaTest {

    public static void main(String[] args) {
        animal Animal = new animal("hello");
        System.out.println(Animal.toString());

        Cat c = new Cat("Meo Meo");
        System.out.println(c);
        c.greats();

        Dog d1 = new Dog("Ki Ki");
        System.out.println(d1);
        d1.greets();
        Dog d2 = new Dog("muc");
        System.out.println(d2);
        d1.greets(d2);

    }

}
