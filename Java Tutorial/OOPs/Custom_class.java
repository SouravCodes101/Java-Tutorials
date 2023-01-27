package OOPs;

 class Employee {
  int id;
  int salary;
  String name;
  public int printSalary() {
    return salary;
  }
  public void printDetails(){
    System.out.println("My id is " + id);
    System.out.println("and my name is " + name);
  }
}

public class Custom_class {
  public static void main(String[] args) {
    System.out.println("This is our custom class");
    Employee sourav = new Employee(); //Instantiating a new Employee object
    Employee john = new Employee();
    // Setting Attributes for Sourav
    sourav.id=13;
    sourav.salary = 30000;
    sourav.name="SouravCodes101";
    
    // Setting Attributes for John
    john.id= 15;
    john.salary=25000;
    john.name="JohnDoe";

    //Printing the Attributes
    sourav.printDetails();
    john.printDetails();

    int salary = john.printSalary();
    System.out.println(salary);
    // System.out.println(sourav.id);
    // System.out.println(sourav.name);
  }
}
