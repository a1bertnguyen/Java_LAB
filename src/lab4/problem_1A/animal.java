package problem_1A;

public class animal {

    private String name;

    public animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name: " + name + "]";
    }

}
