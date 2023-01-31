package OOPs;

class phone {
  public void showTime() {
    System.out.println("Time is...");
  }

  public void on() {
    System.out.println("Turning on phone...");
  }
}

class smartphone extends phone {

  public void music() {
    System.out.println("Playing music....");
  }

  public void on() {
    System.out.println("Turning on smartphone...");
  }
}

public class DynamicMethodDispatch {
  public static void main(String[] args) {
    // phone obj = new phone();
    // obj.name();  

    phone obj = new smartphone();
    // smartphone sobj = new phone();//!NOT ALLOWED

    obj.showTime();
    obj.on();
    // obj.music();//!NOT ALLOWED
  }
}
