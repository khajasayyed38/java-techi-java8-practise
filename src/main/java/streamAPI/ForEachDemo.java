package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("murrit");
        list.add("john");
        list.add("piter");
        list.add("marek");
        list.add("mac");
//        list.stream().filter(t->t.startsWith("p")).forEach(System.out::println);
//        for (String s:list){
//            System.out.println(s);
//        }
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        list.forEach(System.out::println);
        Map<Integer,String> map= new LinkedHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
//        map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(System.out::println);
//        for(Map.Entry<Integer,String> m:map.entrySet()){
//            System.out.println(m.getKey()+":"+m.getValue());
//        }
//    map.forEach((k,v)-> System.out.println(k+":"+v));
//        map.entrySet().forEach(System.out::println);
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter the number");
//        int s=scanner.nextInt();
//        int i=1;int fact=1;
//        while (i<=s){
//            fact*=i;
//            i++;
//        }
//        System.out.println(fact);
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number");
//        int g=sc.nextInt();
//        int fact=1;
//        for(int i=1;i<=g;i++){
//            fact*=i;
//        }
//        System.out.println(fact);
        int n=11;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }else {
            System.out.println("Not prime");
        }
    }
}
