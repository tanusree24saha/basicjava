package seleniumclasscoding;
class Shape {
   public void display() {
      System.out.println("Inside display");
   }
}
class Rectangle extends Shape {
   public void area() {
      System.out.println("Inside area");
   }
}
class assignment41 extends Rectangle {
   public void volume() {
      System.out.println("Inside volume");
   }

//public class Tester {
   public static void main(String[] arguments) {
	   assignment41 cube = new assignment41();
      cube.display();
      cube.area();
      cube.volume();
   }
}