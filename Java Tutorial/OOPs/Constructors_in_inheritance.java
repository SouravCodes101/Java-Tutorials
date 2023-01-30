package OOPs;


class Base1 {
  Base1() {
    System.out.println("This is a constructor");
  }

  Base1(int x) {
    System.out.println("Iam a overloaded constructor with the value of x as : " + x);
  }
}

class Derived1 extends Base1 {
  Derived1() {
    // super(10);
    System.out.println("Iam a derived class constructor");
  }

  Derived1(int x, int y) {
    super(x);
    System.out.println("Iam a derived class constructor with the value of y as: " + y);
  }
}

class ChildOfDerived extends Derived1 {
  ChildOfDerived() {
    System.out.println("Iam a child of derived class");
  }

  ChildOfDerived(int x, int y, int z) {
    super(x,y);
    System.out.println("Iam a child of derived class constructor with value of z as: " + z);
  }
}

public class Constructors_in_inheritance {
  public static void main(String[] args) {
    // Base1 b = new Base1();
    // Derived1 d = new Derived1();
    // Derived1 d =  new Derived1(15,12);
    ChildOfDerived c = new ChildOfDerived(13,10,7);
  }
}
