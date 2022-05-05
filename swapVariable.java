//2.  Write a Java program to swap two variables. 
import java.util.Scanner;

public class swapVariable {
    static void swap(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swaping value of a : "+a);
        System.out.println("after swaping value of b : "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a:");
        int x = sc.nextInt();
        System.out.print("enter the value of b:");
        int y = sc.nextInt();
        
        swap(x, y);
    }
}
