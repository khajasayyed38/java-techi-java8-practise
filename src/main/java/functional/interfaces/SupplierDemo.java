package functional.interfaces;

import java.util.function.Supplier;

public class SupplierDemo  {

    public static void main(String[] args) {
        Supplier<String> supplier=   ()-> "Hi java techie";

        System.out.println(supplier.get());
    }
}
