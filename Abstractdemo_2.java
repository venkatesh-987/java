import java.io.*;
import java.util.*;
abstract class base{
    base(){
        System.out.println("base class constructed invoked");
    }
    abstract void fun();
}
class derived extends base{
    derived(){
        super();
        System.out.println("derived constructor is invoked");
    }
    void fun(){
        System.out.println("dervied fun is invoked");
    }
}
 public class Abstractdemo_2{
    public static void main(String args[]){
        derived d= new derived();
        d.fun();
    }
}
