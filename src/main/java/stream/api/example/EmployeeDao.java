package stream.api.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
   public static List<Employee> getAllEmployee(){
        List<Employee> l= new ArrayList<>();
        l.add(new Employee(176,"Rodhan","IT",600000));
        l.add(new Employee(388,"Bikash","CIVIL",900000));
        l.add(new Employee(470,"Bimal","DEFENCE",500000));
        l.add(new Employee(624,"Sourav","CORE",400000));
        l.add(new Employee(176,"Prakash","SOCIAL",1200000));
        return l;
    }
}
