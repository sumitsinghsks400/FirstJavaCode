package JavaInterviewQ;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullValue33 {
    public static void main(String[] args) {

        //Remove null values from a list using filter.
        Arrays.asList("java","ram","name",null).stream().filter(Objects::nonNull).toList().stream().forEach(System.out::println);
    }
}
