package map_reduce;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public static List<Employee> getAllEmployee(){
        List<Employee> list= new ArrayList<>();
        list.add(new Employee(101,"john","A",60000));
        list.add(new Employee(109,"peter","B",30000));
        list.add(new Employee(102,"mak","A",80000));
        list.add(new Employee(103,"kim","A",90000));
        list.add(new Employee(104,"json","C",15000));
        return list;
    }
}
