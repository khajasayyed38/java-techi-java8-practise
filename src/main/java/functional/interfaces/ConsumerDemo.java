package functional.interfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
//        Consumer<Integer> consumer = t -> System.out.println("printing:" + t);
//        consumer.accept(10);
//
//        List<Integer> list = Arrays.asList(3, 1, 5, 6, 8, 6, 3);
//        list.forEach(t-> System.out.println("printing:"+t));
//        list.forEach(System.out::println);
        List<Integer> list1= Arrays.asList(1,4,8,6,5,3,8);
        list1.forEach(t-> System.out.println("printing the values:"+t));
    }
}
