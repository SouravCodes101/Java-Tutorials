package Methods;

public class Methods {
     static int logic(int a, int b){
        int c;
        if(a>b) {
            c = a+b;
        } else {
            c = (a+b)*5; 
        }
        return c;
    }

   
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
       //!Method invocation using object creation
        // Methods obj = new Methods();
        // c = obj.logic(a, b);
        c = logic(a,b);
        System.out.println(c);
    }
}
