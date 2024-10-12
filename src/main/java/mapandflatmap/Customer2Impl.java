package mapandflatmap;

public class Customer2Impl {
    public static void main(String[] args) {
        Customer2 customer2= new Customer2(101,null);
        Customer2 customer21= new Customer2(102,"Venkatesh");
        String name = customer21.getName();
        if(name==null){
            throw new NullPointerException("name field is null");
        }else {
            System.out.println(name.toUpperCase());
        }


    }
}
