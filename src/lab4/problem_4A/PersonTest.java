package problem_4A;

public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student("Minh", "Vienam", "IT", 1, 41);
        System.out.println(s);
        s.setAddress("Autralia");
        s.setFee(41);
        System.out.println(s);
        System.out.println("");

        Staff st = new Staff(null, null, null, 0);
        System.out.println(st);

        st.setSchool("HCMIU");

        st.setPay(3000);

        st.setAddress("India");

        System.out.println(st);
    }

}
