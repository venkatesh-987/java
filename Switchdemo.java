import java.io.*;
import java.util.Scanner;
public class Switchdemo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number from 0 to 5");
int num=sc.nextInt();
switch(num){
case 0:
System.out.println("you entered zero");
break;
case 1:
System.out.println("you entered one");
break;
case 2:
System.out.println("you entered two");
case 3:
System.out.println("you entered three");
break;
case 4:
System.out.println("you entered four");
break;
case 5:
System.out.println("you entered five");
break;
default:
System.out.println("you entered Invalid number");
}
}
}