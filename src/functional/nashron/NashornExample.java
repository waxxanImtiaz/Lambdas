package functional.nashron;

import javax.script.*;
import java.io.*;  
public class NashornExample {  
    public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("First.js"));
    }  
}
