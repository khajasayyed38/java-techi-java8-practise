package parallel_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDao {
   public static List<Employee> getEmployee(){
       List<Employee> list = new ArrayList<>();
      for(int i=1;i<=1000;i++){
          list.add(new Employee(i,"employee"+i,"A",Double.valueOf(new Random().nextInt(1000*100))));
      }
      return list;
   }
}
