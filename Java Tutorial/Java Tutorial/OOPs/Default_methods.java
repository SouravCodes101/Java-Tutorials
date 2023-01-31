package OOPs;

import javax.annotation.processing.SupportedOptions;

interface camera {
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

interface wifi {
  String[] getNetworks();
  void connectToNetwork(String network);
}

class cellphone {
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

class MySmartphone extends cellphone implements wifi,camera {
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
}
public class Default_methods {
  public static void main(String[] args) {
    MySmartphone ms = new MySmartphone();
    ms.record4kVideo();
    // ms.greet();//! --> Throws an Error
    String[] str = ms.getNetworks();
    for(String item: str) {
      System.out.println(item);
    }
  }
}
