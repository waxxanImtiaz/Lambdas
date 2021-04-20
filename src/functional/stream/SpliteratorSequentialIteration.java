package functional.stream;

import java.util.Spliterator;
import java.util.ArrayList;
import java.util.List;

public class SpliteratorSequentialIteration
{
  public static void main(String[] args) 
  {
  	List<String> numbers = new ArrayList<>();
  	numbers.add("03003");
  	numbers.add("0322");
  	numbers.add("033");



	  List<String> casts = new ArrayList<>();
	  numbers.add("abc");
	  numbers.add("xyz");
	  numbers.add("dddd");

	List<String> names = new ArrayList<>();
	names.add("Rams");
	names.add("Posa");
	names.add("Chinni");

	List<List<String>> people = new ArrayList<>();

	people.add(names);
	people.add(casts);
	people.add(numbers);

	Spliterator<List<String>> spliterator = people.spliterator();

//	spliterator.tryAdvance().forEachRemaining(System.out::println);
   }
}
