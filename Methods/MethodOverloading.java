package Methods;

public class MethodOverloading {
  static void foo() {
    System.out.println("Good Morning Bro!");
  }

  static void foo(int a) {
    System.out.println("Good Morning " + a + " Bro!");
  }
  static void foo(int a, int b) {
    System.out.println("Good Morning " + a + " Bro!");
    System.out.println("Good Morning " + b + " Bro!");
  }
  static void change(int a) {
    a = 98;
  }
  static void change2(int arr[]) {
    arr[0] = 98;
  }
  static void tellJoke(){
    System.out.println("JOKE");
}

public static void main(String[] args) {
  //tellJoke();
  //*Case 1 : Changing the integer */
  // int x = 45;
  // change(x);
  // System.out.println("The value of x after running change is " + x);
  
  //*Case 2: Changing the array */
  //int [] marks = {72, 65, 87, 76, 98};
  //change2(marks);
  //System.out.println("The value of marks[0] after change is: " + marks[0]);


  //!Method Overloading
  foo();
  foo(3000);
  foo(3000,4000);
  //*Arguments are actual!! */
}
}
