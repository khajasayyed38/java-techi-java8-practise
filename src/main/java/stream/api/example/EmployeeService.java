package stream.api.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    public static List<Employee> employeeTax(String n){
        List<Employee> getEmployee= EmployeeDao.getAllEmployee();
        return (n.equalsIgnoreCase("tax"))?
           getEmployee.stream().filter(t->t.getSalary()>500000).toList()
                :getEmployee.stream().filter(t->t.getSalary()<=500000).toList();

    }
    public static void main(String[] args) {
        System.out.println(employeeTax("non tax"));



    }
}
