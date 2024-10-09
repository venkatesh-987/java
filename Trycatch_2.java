

import java.io.*;
public class Trycatch_2{
    public static void main(String args[]){
        int a=5,b=0,c;
        try{
            c=a/b;
            System.out.println("Value ocf c is"+c);
        }
        catch(Exception e){
            System.out.println("Exception caught"+e);
        }
    }
}
