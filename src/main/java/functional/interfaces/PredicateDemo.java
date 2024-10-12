package functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,1,6,9,8,4,5,12,11,3,1,6,9,8,4,5,12,11);
        List<Integer> collect = list.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

    }
}
