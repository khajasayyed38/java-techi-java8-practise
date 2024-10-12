package mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class EkartService {
    public static void main(String[] args) {
        List<Customer> customers=EkartDataBase.getCustomer();
//         customers.stream().map(Customer::getEmail).forEach(System.out::println);
//        List<String> lists=customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).toList();
//        System.out.println(lists);
//        List<String> list = customers.stream().map(Customer::getEmail).toList();
//        System.out.println(list);
//        List<String> list = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).toList();
//        System.out.println(list);
     List<String>  l=   customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).toList();
        System.out.println(l);
    }
}
