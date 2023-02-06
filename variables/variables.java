package variables;
import java.util.*;

public class variables {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);
        short myShortMinValue = Short.MIN_VALUE; int myIntMinValue = Integer.MIN_VALUE;
        System.out.println("myShortMinValue ==> " + myShortMinValue);
        System.out.println("myIntMinValue ==> " + myIntMinValue);
        byte myByteMinValue = Byte.MIN_VALUE, myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("myByteMinValue ==> " + myByteMinValue);
        System.out.println("myByteMaxValue ==> " + myByteMaxValue);
        short firstShort = 1;int firstInteger = 2;
        System.out.println("firstShort ==> " + firstShort);
        System.out.println("firstInteger ==> " + firstInteger );   
        byte firstByte = 1; byte secondByte = 2;
        System.out.println("firstByte ==> " + firstByte);
        System.out.println("secondByte ==> " + secondByte);

        //ToDo: Type Casting
        int myTotal = (myIntMinValue / 2);
        System.out.println(myTotal);
        byte myNewByteValue = (byte)(myByteMinValue/2);
        System.out.println("myNewByteValue ==> " + myNewByteValue);
        short myNewShortValue = (short)(myShortMinValue /2);
        System.out.println("myNewShortValue ==> " + myNewShortValue);

    }
}