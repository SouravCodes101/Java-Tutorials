package OOPs;

import javax.xml.transform.Source;

class Base {
  int x;

  public void setX(int x) {
    System.out.println("Im in base and, setting x now");
    this.x = x;
  }
  
  public int getX() {
    return x;
  }
  public void printMe() {
    System.out.println("This is a Method");
  }
}

class Derived extends Base {
  int y;

  public void setY(int y) {
    this.y=y;
  }

  public int getY() {
    return y;
  }
}

class Animal {
  String name ;

  public void speak() {
    System.out.println("Speaking...");
  }
}

class Dog extends Animal {
  public void bark() {
    System.out.println("Bark...Woof");
  }
}

public class Inheritance {

  public static void main(String[] args) {    
    //Creating an object of base class
    Base b = new Base();  
    b.setX(1);
    System.out.println(b.getX());

    //Creating an object of derived class
    Derived d = new Derived();  
    d.setY(43);
    d.setX(4);
    System.out.println(d.getX());
    System.out.println(d.getY());

    Animal a = new Animal();
    a.speak();
    Dog dg = new Dog();
    dg.name="Ghost";
    System.out.println(dg.name);
  }
}
