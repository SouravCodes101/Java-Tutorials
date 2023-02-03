package OOPs;

abstract class Parent2 {
  public Parent2() {
    System.out.println("Iam a constructor of Base 2");
  }
  public void sayHello() {
    System.out.println("Hello");
  }

  abstract public void greet();
  abstract public void greet2();
}

class Child2 extends Parent2 {
  @Override
  public void greet(){
    System.out.println("Hello");
  }
  public void greet2() {
    System.out.println("Hello, Good Morning");
  }
}

abstract class child3 extends Parent2 {
  public void a() {
    System.out.println("a");
  }
}

public class Abstract {
  public static void main(String[] args) {
    // Parent2 p = new Parent2(); //!-- Error
    Child2 c = new Child2();
    // child3 c3 = new child3();//!-- Error
  }
}
