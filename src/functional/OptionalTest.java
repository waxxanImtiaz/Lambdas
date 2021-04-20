package functional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
//        Optional<String> stringOptional = Optional.empty();
//        System.out.println(stringOptional);


        String[] str = new String[10];
//        str[5] = "imtiaz";

        Optional<String> optionalS = Optional.ofNullable(str[5]);
        optionalS.ifPresent(System.out::println);
        optionalS.orElse("Kamran");

        System.out.println(str[5]);


        Integer value1 = null;
        Integer value2 = new Integer(10);

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

//        System.out.println(a.isPresent() +" and "+b.);
    }
}
