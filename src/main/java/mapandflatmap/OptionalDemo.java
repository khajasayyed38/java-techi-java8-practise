package mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static Customer customer(String email) throws Exception {
        List<Customer> c = EkartDataBase.getCustomer();
     return   c.stream().filter(customer -> customer.getEmail().equals(email))
                .findAny()
                .orElseThrow(()->new Exception("no customer found with this email"));

    }
    public static void main(String[] args) throws Exception {
//        Customer customer = new Customer(101, "khaja", "null", Arrays.asList("3697456972", "9762310258"));
//        //empty method->return optional object
//        //of method-> the particular field should not be null
//        //ofNullable method-> the particular field may be or may not be null
//        Optional<Object> empty = Optional.empty();
////        System.out.println(empty);
//
//        Optional<String> email = Optional.of(customer.getEmail());
//        if (customer.getEmail() == null) {
//            throw new IllegalArgumentException("the email is null");
//        } else {
//            System.out.println(email.get());
//        }
//    }
        System.out.println(customer("abc"));
    }
}
