import java.io.*;
import java.util.*;
 class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str){
        super(str); 
        }
}
public class TestCustomException1{
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
        {
            throw new InvalidAgeException("age is not valid to vote");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String args[]){
        try{
            validate(13);
        }
        catch(InvalidAgeException iae){
            System.out.println("caught the Exception");
            System.out.println("exception occured"+iae);
        }
        finally{
            System.out.println("In finally block");
        }
        System.out.println("rest of the code");
    }
}
