package many_programs;

public class Palindrome {
    int reverse = 0;
    public void palindromeChecker(int number){
        while(number > 0){
            reverse = (reverse*10)+number%10;
            number /= 10;
        }

    }
    public void show(int number){
        if(reverse == number)
            System.out.println(" yeah it is a palindrome Number");
        else
            System.out.print("No!!! its not a palindrome Number");    
    }
}
