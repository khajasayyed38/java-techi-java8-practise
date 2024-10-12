package map_reduce;

import java.util.List;
import java.util.OptionalDouble;

public class EmployeeImpl {
    public static void main(String[] args) {
        List<Employee> employees=EmployeeDao.getAllEmployee();
        double a = employees.stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        System.out.println(a);
    }
}
