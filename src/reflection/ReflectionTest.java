package reflection;

import java.lang.reflect.Constructor;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class classPerson = Class.forName("reflection.Person");
//        classPerson.
        System.out.println(classPerson.getName());
        Constructor[] constructor = classPerson.getConstructors();
        System.out.println(constructor[0]);
    }
}

class Person{

    private String name = "Imtiaz Ali";

    private Person(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

