import java.io.*;
import java.util.*;
public class Trycactch_5{
public static void main(String args[]){
int a=5,b=0,c;
int arr[]=new int[5];
String str=null;
try{
    c=a/b;
arr[10]=200;
System.out.println("the length of the string is" +str.length());
throw new IOException();
}
catch(NullPointerException NP){
System.out.println("NullPointerException caught");
}
catch(ArithmeticException AE){
System.out.println("ArithmeticException caught");
}
catch(ArrayIndexOutOfBoundsException AIOOBE){
System.out.println("ArrayIndexOutOfBoundsException caught");
}
catch(Exception e){
System.out.println("Exception caught");
}
finally{
System.out.println("In finally block");
}
}
}
