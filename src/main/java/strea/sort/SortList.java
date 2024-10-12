package strea.sort;

import stream.api.example.Employee;
import stream.api.example.EmployeeDao;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(17);
        list.add(9);
        list.add(26);
        list.add(1);
        list.add(12);
//        Collections.sort(list);
//        System.out.println(list);
//        List<Integer> list1 = list.stream().sorted().toList();
//       Collections.reverse(list);
//        System.out.println(list);
//        list.stream().sorted().forEach(System.out::println);
       List<Employee> l= EmployeeDao.getAllEmployee();
        l.stream().sorted(Comparator.comparing(Employee::getDept).reversed()).forEach(System.out::println);
    }
}
