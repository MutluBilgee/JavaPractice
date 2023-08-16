import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintNumberOfChars {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        //Stream<String> wordStream = words.stream();
        words.forEach(System.out::println);

        words.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

}
