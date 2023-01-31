package OOPs;

interface sample {
  void meth1();
  void meth2();
}

interface childSample extends sample{
  void meth3();
  void meth4();
}

class MySampleClass implements childSample {
  public void meth1(){
    System.out.println("Method1");
  };
  public void meth2(){
    System.out.println("Method2");
  };
  public void meth3(){
    System.out.println("Method3");
  };
  public void meth4(){
    System.out.println("Method4");
  };
}

public class Inheritance_in_interfaces {
  public static void main(String[] args) {
    MySampleClass mc = new MySampleClass();
    mc.meth1();
    mc.meth2();
    mc.meth3();
    mc.meth4();
  }
}
