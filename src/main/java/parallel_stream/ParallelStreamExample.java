package parallel_stream;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        long start=0;
        long end=0;
//        start=System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("plain stream :"+(end-start));
//
//        System.out.println("============================");
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("plain stream :"+(end-start));
        List<Employee> employee = EmployeeDao.getEmployee();
        start=System.currentTimeMillis();
        double average = employee.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("plain stream :"+(end-start)+" dgd :"+average);

        System.out.println("=======================");
        start=System.currentTimeMillis();
        double withParallelStream= employee.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("parallel stream :"+(end-start)+" sfs :"+withParallelStream);
        Map<String, List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGrade));
        System.out.println(collect);


    }
}
