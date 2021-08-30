import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StringMethods {

    void showDuplicates(String str) {
        String [] strings = str.split("");
        List<String> lst = Arrays.asList(strings);
        HashSet<String> set = new HashSet<>(lst);
        set.stream().filter(s-> Collections.frequency(lst, s)>1).forEach(System.out::println);
    }
}
