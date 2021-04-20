package functional.test;

class SuperClass {
 SuperClass(int x) {
 System.out.println("Super");
 }
}
public class SubClass extends SuperClass {
 SubClass() {
  // Line n1
  super(20);
  System.out.println("Sub 2");
 }
}
