package lamda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookImpl {
    public static void main(String[] args) {
        List<Book> book=BookDao.getBook();
        book.stream().sorted(Comparator.comparing(book1 -> book1.getPages())).forEach(System.out::println);

    }
}
