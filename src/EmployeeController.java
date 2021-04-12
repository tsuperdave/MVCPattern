public class EmployeeController {

    // coordinates info between model and view

    public String getEmployeeName(Employee employee) {
        return employee.getName();
    }

    public void setEmployeeName(Employee employee, String name) {
        employee.setName(name);
    }

    public int getEmployeeID(Employee employee) {
        return employee.getId();
    }

    public void setEmployeeID(Employee employee, int id) {
        employee.setId(id);
    }

    public String getEmployeeTitle(Employee employee) {
        return employee.getTitle();
    }

    public void setEmployeeTitle(Employee employee, String title) {
        employee.setTitle(title);
    }

    public long getEmployeeSalary(Employee employee) {
        return employee.getSalary();
    }

    public void setEmployeeSalary(Employee employee, long salary) {
        employee.setSalary(salary);
    }
}
