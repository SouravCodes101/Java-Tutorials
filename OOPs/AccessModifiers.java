package OOPs;

class Circle {
  private int radius;

  public void setRadius(int r){
  this.radius = r;
  }

  public int getRadius() {
    return radius;
  }
}

class MyEmployee {
  private int id;
  private String name;

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

public class AccessModifiers {
  public static void main(String[] args) {
      MyEmployee sourav = new MyEmployee();
      // sourav.id=13;
      // sourav.name="SouravCodes101"; 
      sourav.setId(13);
      System.out.println(sourav.getId());
      sourav.setName("SouravCodes101");
      System.out.println(sourav.getName());
  }  
}
