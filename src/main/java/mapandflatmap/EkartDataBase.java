package mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<Customer> getCustomer(){
        return Stream.of(
                new Customer(101,"john","john@gmail.com", Arrays.asList("9874624832","6574682314")),
                new Customer(102,"smith","smith@gmail.com", Arrays.asList("9746321820","7965231012")),
                new Customer(103,"peter","peter@gmail.com", Arrays.asList("32146879251","2697465210")),
                new Customer(104,"keley","keley@gmail.com", Arrays.asList("1023697456","5697412014"))
        ).collect(Collectors.toList());
    }
}
