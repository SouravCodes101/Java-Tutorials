package Strings;
import java.util.*;

import javax.xml.transform.Source;

public class Strings {
    public static void main(String[] args) {
        //**String Declaration
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is : " + name);

        //**Concatenation */
        // String firstName= "Sourav";
        // String lastName = "Choudhury";
        // String name = firstName + " " +  lastName;
        // System.out.println(name.length());

        // //* charAt */
        // for( int i=0; i<name.length() ; i++ ) {
        //     System.out.println(name.charAt(i));
        // } 

        //*Compare comapreTo*/
        String name1 = "Sourav";
        String name2 = "Sourav";
        //!s1 < s2 === +ve
        //!s1 == s2 === 0
        //!s1 < s2 === -ve
        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(name1==name2){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(new String("Tony") == new String("Tony")) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal!");
        // }
            //!Substring
        String sentence = "SouravChoudhury";
        String name = sentence.substring(0,6);
        System.out.println(name);

        //!Strings are immutable
        
    }
}

