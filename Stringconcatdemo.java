import java.io.*;
import java.lang.*;
public class Stringconcatdemo{
    public static void main(String args[]){
        String s1="hello";
        String s2="world";
        String s3=s1.concat(s2);
        System.out.println("The result of s1 concat s3is "+s3);
        String s4="sasisitewelcomehello";
        String s5=s4.join("wel",s2);
        System.out.println("after joining s2 with s5 is"+s5);
        System.out.println("result of s1+s2 is"+ (s1+s2));
        
    }
}
