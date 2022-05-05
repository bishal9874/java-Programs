
import java.util.Scanner;

public class addition{
   static int addi(int a , int b){
        return a+b;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            System.out.println(addi(x,y));
        }
        sc.close();
        
    }
}