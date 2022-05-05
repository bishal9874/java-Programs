import java.util.Scanner;


class factorial{
    int num;
    int ans = 1;

    void takedata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        num = sc.nextInt();
    }
    void factwork(){
        for(int i =1; i<=num;i++)
            ans=ans*i;    
    }
    void printData(){
        System.out.println("factorial " + num + " is " + ans);
    }
}
public class myfactorial {
    public static void main(String[] arg){
        factorial obj = new factorial();
        obj.takedata();
        obj.factwork();
        obj.printData();
        
    }
} 