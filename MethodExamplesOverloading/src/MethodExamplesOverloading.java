//new method that gets age
//new method that prints age and name
import java.util.Scanner;
public class MethodExamplesOverloading 
{    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {        
        String userName = getName();         
        //NEW
        int usrAge = getAge();
        printAgeAndName(userName, usrAge); 
        printGreeting(userName);
        printAgeName(userName, usrAge);
        //printName(userName); 
        System.out.println("End of program!");
    }    
    public static String  getName()
    { //**** add STRING return
        System.out.println("What is your name");       
        String name = input.nextLine();                      
        return name; // return name                
    }
    
    public static void printName(String userName)
    {
       System.out.println(userName + " from printName()");                    
    }      
    //Add a new function
    public static int getAge(){
        System.out.println("What is your age");
        int age = input.nextInt();
        return age;
    }    
    public static void printAgeAndName(String userName, int userAge)
    {
        System.out.println(userName + ": age " + userAge);
    }    
    public static void printGreeting(String name)
    {
        System.out.printf("Hello %s\n", name);
    }
    public static void printAge(int age)
    {
        age = getAge();
        System.out.printf("Your age is: %d", age);
    }
    public static void printAgeName(String name, int age)
    {
        System.out.printf("Hello %s from the class! You are %d\n", name, age);
    }
    
}


