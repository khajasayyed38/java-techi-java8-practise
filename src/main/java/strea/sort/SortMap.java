package strea.sort;

import stream.api.example.Employee;

import java.util.*;

public class SortMap {
    public static void main(String[] args) {
//        Map<String,Integer> map= new HashMap<>();
//        map.put("eight",8);
//        map.put("four",4);
//        map.put("ten",10);
//        map.put("two",2);

//        List<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//       for(Map.Entry<String,Integer>l:list){
//           System.out.println(l.getKey()+":"+l.getKey());
//       }
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//    map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        Map<Employee,Integer> map= new TreeMap<>((o1, o2)->(int) (o2.getSalary()-o1.getSalary())) ;
        map.put(new Employee(176,"Rodhan","IT",600000),60);
        map.put(new Employee(388,"Bikash","CIVIL",900000),90);
        map.put(new Employee(470,"Bimal","DEFENCE",500000),50);
        map.put(new Employee(624,"Sourav","CORE",400000),40);
        map.put(new Employee(176,"Prakash","SOCIAL",1200000),120);
//        System.out.println(map);
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
//                .forEach(System.out::println);
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);
    }
}
