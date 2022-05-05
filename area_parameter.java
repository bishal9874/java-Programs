//1. Write a Java program to print the area and perimeter of a rectangle. 

import java.util.Scanner;

public class area_parameter {
     static int area(int a, int b){
        return a*b;
    }
     static int parameter(int v, int c){
        return 2*(v+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x:");
        int x = sc.nextInt();
        System.out.print("enter the value of y:");
        int y = sc.nextInt();
        System.out.println("area is : "+area(x,y));
        System.out.println("parameter is : "+parameter(x,y));        
    }
    
}
