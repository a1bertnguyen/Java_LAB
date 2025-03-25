package problem_5;

import java.util.*;

public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee;

    public Project(String projectId, Date startDate, Date endDate, ArrayList<Employee> listOfEmployee) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = listOfEmployee;
    }

    public int estimateBudget() {
        long diffInMillies = Math.abs(endDate.getTime() - startDate.getTime());// Lấy số mili-giây chênh lệch giữa ngày
                                                                               // bắt đầu và ngày kết thúc.
        long diffDays = diffInMillies / (1000 * 60 * 60 * 24);

        int totalBudget = 0;
        for (Employee e : listOfEmployee) {
            totalBudget += e.getSalaryPerHour() * 8 * diffDays;
        }
        return totalBudget;
    }

    @Override
    public String toString() {
        Collections.sort(listOfEmployee); // sắp xếp theo compareTo của Employee
        StringBuilder sb = new StringBuilder();
        sb.append("Project ID: ").append(projectId).append("\nEmployees:\n");
        for (Employee e : listOfEmployee) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }

    // Getter & Setter
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }
}
