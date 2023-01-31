package OOPs;


class MyMainEmployee {
  private int id;
  private String name;
  private int salary;

  public MyMainEmployee() {
    id=55;
    name="Your-name-here";
  }

  public MyMainEmployee(int myId,String myName) {
    id=myId;
    name=myName;
  }
  
  public MyMainEmployee(String myName) {
    id=1;
    name=myName;
  }
  public MyMainEmployee(int mySalary) {
    id=13;
    name = "Sourav Choudhury";
    salary = mySalary;
  }

  public int getSalary() {
    return salary;
  }

  public void setId(int n) {
    this.id = n;
  }

  public int getId() {
    return id;
  }

  public void setName (String n) {
    this.name = n;
  }

  public String getName() {
    return name;
  }
}

public class Constructors {

  
  public static void main(String[] args) {
    // MyMainEmployee sourav = new MyMainEmployee(45,"Sourav");
    // MyMainEmployee sourav = new MyMainEmployee();
    // MyMainEmployee sourav = new MyMainEmployee("Sourav");
    MyMainEmployee sourav = new MyMainEmployee(10000);
    // sourav.setName("SouravCodes101");
    // sourav.setId(15);
    System.out.println(sourav.getName());
    System.out.println(sourav.getId());
    System.out.println(sourav.getSalary());

  }
}
