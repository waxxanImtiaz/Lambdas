package functional.optional;

import java.util.*;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {



        List<String> people =  new ArrayList<>();

        people.add("abc");
        people.add("xyz");
        people.add(null);
        Optional<List<String>> optionalStrings = Optional.of(people);

        Stream<String> stream = optionalStrings.orElse(Collections.emptyList()).stream();

        stream.filter( value -> value.equalsIgnoreCase("abc") || value.equalsIgnoreCase("cde")).forEach(System.out::println);

//        people.st
    }
}
