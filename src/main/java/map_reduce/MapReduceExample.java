package map_reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,7,5,8,3,1,9);
//        int sum=0;
//        for(int s:list){
//            sum+=s;
//        }
//        System.out.println(sum);
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        Optional<Integer> reduceWithMethodReference = list.stream().reduce(Integer::sum);
        System.out.println(reduceWithMethodReference.get());
        Integer reduce1 = list.stream().reduce(1, (a, b) -> (a * b));
        System.out.println(reduce1);
        Integer max=list.stream().reduce(Integer::max).get();
        System.out.println(max);
        Integer integer = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(integer);

//        List<String> words=Arrays.asList("corejava","spring","hibernate");
//        for(int i=0;i<words.size();i++){
//            if(){
//
//            }
        String[] a={"corejava","spring","hibernatef"};
        String longestString = Arrays.stream(a).reduce((a1, a2) -> a1.length() > a2.length() ? a1 : a2).get();
        System.out.println(longestString);
    }

}
