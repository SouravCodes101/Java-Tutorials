package OOPs;

class Employee {
  int id;
  String name;
  int salary;
  public void printDetails() {
    System.out.println("My Id is " + id);
    System.out.println("My name is " + name);
  }

  public int getsalary(){
    return salary;
  }
}

public class Custom_class {
  public static void main(String[] args) {
    System.out.println("This is a custom class");
    Employee john = new Employee();//Instantiating a new Employee object
    Employee sourav = new Employee();//Instantiating a new Employee object
    //Setting properties/attributes for john
    john.id=12; 
    john.name="codeWithJohn";
    john.salary = 12000;
    //Setting properties/attributes for sourav
    sourav.id=14; 
    sourav.name="SouravCodes101";
    sourav.salary = 12000;
    //Printing the attributes
    // System.out.println(john.id);
    // System.out.println(john.name);

    john.printDetails();
    sourav.printDetails();
    int salary = john.getsalary();
    System.out.println(salary);
  }
}
