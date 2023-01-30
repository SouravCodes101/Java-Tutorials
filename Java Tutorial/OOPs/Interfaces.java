package OOPs;

interface Bicycle {
  final int a = 55;
  public void applyBreak(int decrement);
  public void speedUp(int increment);
}

interface HornBicycle {
  public int x = 45;
  void blowHornK3G(); 
  void blowHornMHN(); 
}

class AvonCycle implements Bicycle,HornBicycle {
  public int x = 65;
  void blowHorn () {
    System.out.println("Horn");
  }

  public void applyBreak(int decrement) {
    System.out.println("Applying break ..." + decrement);
  }

  public void speedUp (int increment) {
    System.out.println("Speeding up ..." + increment);
  }

  public void blowHornK3G(){
    System.out.println("K3G");
  }; 
  public void blowHornMHN(){
    System.out.println("MHN");
  }; 
}

public class Interfaces {
  public static void main(String[] args) {
    AvonCycle sourav = new AvonCycle();
    sourav.applyBreak(5);
    // * YOU CAN CREATE PROPERTIES IN INTERFACES
    System.out.println(sourav.a);
    System.out.println(sourav.x);
    //* YOU CANNOT MODIFY THE PROPERTIES IN INTERFACES AS THEY ARE FINAL */
    // sourav.a=65;
    // System.out.println(sourav.a); 
  //   sourav.blowHornK3G();
  //   sourav.blowHornMHN();
   }
}
