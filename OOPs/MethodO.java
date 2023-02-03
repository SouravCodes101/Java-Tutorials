package OOPs;

class A {
  int a;

  public int sourav() {
      return 10;
  }

  public void meth2() {
    System.out.println("This is method 2 of class A");
  }
}

class B extends A {
  @Override
  public void meth2() {
    System.out.println("This is method 2 of class B");
  }
  public void meth3() {
    System.out.println("This is method 3 of class B");
  }
}

public class MethodO {
  public static void main(String[]  args) {
    A a = new A();
    a.meth2();

    B b = new B();
    b.meth2(); 
  }
}
