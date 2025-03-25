package problem_5;

public class Employee implements Comparable<Employee> {
    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public int calculateWeeklySalary() {
        return (int) (salaryPerHour * 8 * (5 - noOfLeavingDay + noOfTravelDay / 2.0));// ép kiểu int
    }

    @Override
    public int compareTo(Employee B) {
        // a.compareTo(b) > 0 ⇒ a > b ⇒ a đứng SAU b
        // a.compareTo(b) < 0 ⇒ a < b ⇒ a đứng TRƯỚC b
        if (this.noOfTravelDay != B.noOfTravelDay) {
            return B.noOfTravelDay - this.noOfTravelDay; // nhiều ngày công tác hơn thì đứng trước
            // A = 2, B = 4 => B - A = 2 >0 B đứng sau -> A đứng trước
        } else {
            return this.noOfLeavingDay - B.noOfLeavingDay; // ít ngày nghỉ hơn thì đứng trước
            // A = 1, B = 3 => B - A = 2 > 0 A đứng trước -> B đứng sau
        }
    }

    @Override
    public String toString() {
        return "[Name:" + employeeName + " - Salary Per Hour:" + salaryPerHour +
                " - Weekly Salary:" + calculateWeeklySalary() + "]";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }
}
