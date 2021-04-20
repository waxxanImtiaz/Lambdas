package functional.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMap {
    public static void main(String[] args) {
        Map<String,Integer> fruits = new HashMap<>();
        fruits.put("banana",12);
        fruits.put("mango",13);
        fruits.put("apple",14);

        Optional<Map<String,Integer>> test = Optional.of(fruits );

        fruits.entrySet().stream().filter(e -> e.getKey().equals("banana") || e.getKey().equals("apple"))
                .mapToInt(e -> e.getValue()).forEach(System.out::println);


        String[] s = new String[5];

        Optional<String> d = Optional.ofNullable(s[2]);

        d.ifPresent(System.out::println);
        if (d.isPresent()){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }



    }
}
