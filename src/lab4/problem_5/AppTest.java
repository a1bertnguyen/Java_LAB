package problem_5;

import java.text.SimpleDateFormat;
import java.util.*;

public class AppTest {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("E01", "Alice", 20, 1, 2);
        Employee e2 = new Employee("E02", "Bob", 22, 0, 3);
        Employee e3 = new Employee("E03", "Charlie", 18, 2, 2);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse("2024-03-01");
        Date end = sdf.parse("2024-03-10");

        Project p = new Project("PRJ001", start, end, employeeList);

        System.out.println(p); // in thông tin dự án và danh sách nhân viên đã sắp xếp
        System.out.println("Estimated Budget: " + p.estimateBudget());
    }
}
