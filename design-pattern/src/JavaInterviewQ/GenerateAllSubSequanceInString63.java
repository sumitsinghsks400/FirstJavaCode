package JavaInterviewQ;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateAllSubSequanceInString63 {
    public static void main(String[] args) {
     //   String str = "abc";
        String str = "abc";
        List<String> subsequences = IntStream.range(0, 1 << str.length())
                .mapToObj(i -> IntStream.range(0, str.length())
                        .filter(j -> (i & (1 << j)) != 0)
                        .mapToObj(j -> String.valueOf(str.charAt(j)))
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());
        System.out.println(subsequences); // Output: [, a, b, ab, c, ac, bc, abc]

    }
}
