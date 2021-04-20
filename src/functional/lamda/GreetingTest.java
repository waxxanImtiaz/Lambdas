package functional.lamda;

import java.io.FileNotFoundException;

public class GreetingTest {
    private String name = "sdd";

    class Myclass implements Greeting {
        private String name;
        @Override
        public void greet() throws FileNotFoundException {
            GreetingTest.this.name = "";
        }
    };
    public void test() throws FileNotFoundException {
        Greeting greeting = () ->
        {

                    System.out.println("THis is imtiaz ali");
        };
        System.out.println(greeting);


//        System.out.println(greeting.);

        greeting.greet();
    }
    public static void main(String[] args) {
        GreetingTest test = new GreetingTest();
//        test.test();
    }
}
