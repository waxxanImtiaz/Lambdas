package functional.lamda;

import java.io.FileNotFoundException;

public interface Greeting {
    void greet() throws FileNotFoundException;

    static void hello(){
        System.out.println("THis is hello test");
    }
    default void play(){

    }
}
