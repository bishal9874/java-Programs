import many_programs.*;
import java.util.Scanner;

public class MainClass{   
    public static void main(String args[]){
    //Declaring String variable  
    Scanner sc = new Scanner(System.in);
    
    MainClass ax = new MainClass();
    //ax.forAmstrong(sc);
    ax.forpalindrome(sc);
    

}

void forAmstrong(Scanner ams){
    System.out.println("**************Amstrong Number Checker**************");
    System.out.print("Enter the value: ");
    String n = ams.next();
    int length = String.valueOf(n).length();
    int i=Integer.parseInt(n);
    Amstromg ac = new Amstromg();
    // call amstrong
    ac.amstromgChecker(i, length);
    ac.display(i);
}
void forpalindrome(Scanner pal){
    System.out.println("**************Palindrome Number Checker**************");
    System.out.print("Enter the value: ");
    int num = pal.nextInt();
    Palindrome fv = new Palindrome();
    fv.palindromeChecker(num);
    fv.show(num);
}
} 



