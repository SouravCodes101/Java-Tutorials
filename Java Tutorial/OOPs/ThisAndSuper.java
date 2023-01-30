package OOPs;

class oneClass {
  int a;
  public int getA(){
    return a;
  }
  oneClass(int a) {
    this.a = a;
  }
  public int returnOne() {
    return 1;
  }
}

class twoClass extends oneClass {
  twoClass(int c) {
    super(c);
    System.out.println("This is a constructor");
  }
}

public class ThisAndSuper {
  public static void main(String[] args) {
    oneClass e = new oneClass(5);
    twoClass t = new twoClass(4);
    System.out.println(e.getA());
  }
}
