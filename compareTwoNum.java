//3. Write a Java program to compare two numbers 

import java.util.Scanner;

public class compareTwoNum {
   static void compare(int number1 ,int number2){
         
        if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 );  
    }
    public static void main( String args[] )    
    {
            
        Scanner input = new Scanner(System.in);
     
      
        System.out.print( "Input first integer: " );       
        int number1 = input.nextInt();  
 
        System.out.print( "Input second integer: " ); 
        int number2 = input.nextInt(); 
        
        compare(number1, number2);
       
    }
    
}
