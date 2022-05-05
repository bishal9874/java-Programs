package many_programs;
import java.util.Scanner;

public class factorial {
    public static void main(String[] arg){
        myfactorial obj = new myfactorial();
        obj.getData();
        obj.factorialmethod();
    }
    
}
class myfactorial{
    private int Ans, num;
    myfactorial(){Ans = 1;}
    void getData(){
        Scanner nw =new Scanner(System.in);
        System.out.println("\n Enter an integer number");
        num = nw.nextInt();
    }
    void factorialmethod(){
        for(int i =1; i<=num;i++)
            Ans=Ans*i;
        System.out.println("factorial of "+ num+ "is"+ Ans);    
    }


}
