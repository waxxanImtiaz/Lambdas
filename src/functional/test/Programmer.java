package functional.test;

abstract class Writer {
    public static void write() {
        System.out.println("Writing...");
    }
}
class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}
public class Programmer extends Writer {
    public static void write() {
        System.out.println("Writing code");
    }
    public static void main(String[] args) {
//        Writer w = new Programmer();
//        w.write();

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
        System.out.println(s2);
    }
}
