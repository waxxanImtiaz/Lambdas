package functional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        double[] i = {100,2,3,1,20};
        DoubleStream.of(i).forEach(System.out::println);

        List<Integer> integerList = new ArrayList<>();

        integerList.add(50);
        integerList.add(20);
        integerList.add(100);
        integerList.add(11);
        integerList.add(14);

//        List<Integer> integer = integerList.stream().filter((num) -> num>30).collect(Collectors.toList());
//        System.out.println(integer);

//        integerList.stream().forEachOrdered(System.out::println);
//        int sum = integerList.stream().filter( i -> i  > 50).mapToInt(Integer::intValue).sum();

//        System.out.println(sum);
    }


}
