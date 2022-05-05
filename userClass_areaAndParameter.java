import java.util.Scanner;

public class userClass_areaAndParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        area_and_parameter in = new area_and_parameter();
        System.out.print("enter the value of x:");
        int x = sc.nextInt();
        System.out.print("enter the value of y:");
        int y = sc.nextInt();
        System.out.println("area is : "+in.area(x,y));
        System.out.println("parameter is : "+in.parameter(x,y));    
        
    }
}
class area_and_parameter{
    int area(int a, int b){
        return a*b;
    }
    int parameter(int v, int c){
        return 2*(v+c);
    }

}