package functional;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
      Calculate calculate = ()-> {
          int a = 20;
          int b = 20;
          return a+b;
      };

//      Addition addition = (a,b)->{
//          int c = a+b;
//      };

//        System.out.println(calculate.calculate());

        Run run = ()->{
            System.out.println("Imtiaz Ali");
        };
        run.run();
    }



    interface Calculate{
        int calculate();
        default int run() {
            return 10+20;
        }
    }

    interface Run{
        void run();
    }
    interface Addition extends Calculate{
        int add(int a,int b);
    }
}
