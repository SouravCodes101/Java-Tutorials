package OOPs;

interface camera2 {
  void takeSnap();
  void recordVideo();
  private void greet() {
    System.out.println("Good Morning .");
  }
  default void record4kVideo() {
    greet();
    System.out.println("Recording in 4k . . .");
  }
}

interface wifi2 {
  String[] getNetworks();
  void connectToNetwork(String network);
}

class cellphone2 {
  void callNumber(int phoneNumber) {
    System.out.println("Calling " + phoneNumber);
  }
  void pickCall() {
    System.out.println("Connecting . . .");
  }
  // public void takeSnap(){
  //   System.out.println("Take a picture");
  // };

  // public void recordVideo(){

  // };
}

class MySmartphone2 extends cellphone2 implements wifi2,camera2 {
  public void takeSnap(){
    System.out.println("Take a picture");
  };

  public void recordVideo(){
    System.out.println("Recording a video");

  };
  // public void record4kVideo(){
  //   System.out.println("Taking Snap & Recording a video");

  // };

  public String[] getNetworks() {
    System.out.println("Getting list of networks");
    String[] networkList = {"Tony", "Harry","Sourav"};
    return networkList;
  }
  public void connectToNetwork (String network){
    System.out.println("Connecting to . . " + network);
  }

  public void sampleMeth() {
    System.out.println("Meth");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    camera2 cam1 = new MySmartphone2(); // This is a smartphone but, use it as a camera
    cam1.record4kVideo();
    // cam1.getNetworks(); //!-->Not Allowed
    // cam1.sampleMeth();//!-->Not Allowed

    MySmartphone2 s = new MySmartphone2();

    s.sampleMeth();
    s.recordVideo();
    s.getNetworks();
    s.callNumber(1231414);
  }
}
