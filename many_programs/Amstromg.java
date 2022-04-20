package many_programs;
public class Amstromg{
    int sum = 0;
    public void amstromgChecker(int number,int ln){
        while(number>0){
            int digit = number % 10;
            int temp=1;
            for(int l=1;l<=ln;l++)
               temp = temp * digit;
            sum = sum+temp;
            number /=10;
   
        }

    }
    public void display(int number){
        if(sum == number)
        System.out.println("Entered value is a Amstromg Number");
     else
        System.out.println("Entered value is not a Amstromg Number");
    }

}
