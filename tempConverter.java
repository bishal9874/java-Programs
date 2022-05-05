import java.util.Scanner;

//4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
public class tempConverter {
    static float converter(float Fahrenheit){
        return ((Fahrenheit-32)*5)/9; 
    }
   public static void main (String args[])  
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fahrenheit degree: ") ; 
          float Fahrenheit = sc.nextFloat();
          System.out.println("Temperature in celsius is: "+ converter(Fahrenheit));  
    }
}
