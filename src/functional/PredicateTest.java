package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(30);
        integers.add(12);
        integers.add(10);
        integers.add(13);
//        MyPredicate my = (list,predicate)->{
//            list.stream().
//        };
//        Predicate<Integer> lessThen20 = (num)->(num<20);
        Predicate<Integer> greaterThen10 = (num)->(num>10);
//        my.printValues(integers,predicate);

//        PredicateTest predicateTest = new PredicateTest();
//        predicateTest.toString();
//        print(integers,greaterThen10, System.out::println);

        integers.parallelStream().filter(num -> num>10 ).forEach(System.out::println);
//        integers.stream().parallel().map()
//        integers.parallelStream().f
//        Predicate<Integer>
//        System.out.println(lessThen20.or(greaterThen10).negate().test(13));
    }
    interface MyPredicate{
        void printValues(List<Integer> i, Predicate predicate);
    }


    public static void print(List<Integer> list, Predicate<Integer> predicate, Consumer<Integer> consumer){
        for (Integer i : list){
            if (predicate.test(i))
                consumer.accept(i);
        }
    }
}
