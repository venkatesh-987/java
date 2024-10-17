import java.io.*;
 class Animal{
    String color="white";
    }
class dog extends Animal{
    String color="black";
    void printcolor(){
        System.out.println("dog color is"+color);
        System.out.println("Animal color is"+super.color);
    }
}
public class Superdemo_1{
    public static void main(String args[]){
        dog d = new dog();
        d.printcolor();
    }
}
