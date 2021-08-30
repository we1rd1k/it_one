import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StringTest {
    StringMethods methods;

    @BeforeEach
    void beforeTest(){
        methods = new StringMethods();
    }

    @Test
    void test() {
        String str = "Hello Java-World!!!";
        System.out.println(str);
        methods.showDuplicates(str);
    }

}
