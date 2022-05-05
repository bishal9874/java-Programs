import java.util.Scanner;


class calculator{
    private int i;
    private int j;
    private int ans;
    int menu(){
        int choice;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n4.division \n enter you choice:  ");
        choice = sc1.nextInt();
        return choice;
    }
    void getdata(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the 1st number");
        i = sc2.nextInt();
        System.out.println("First Entered the number: "+i);
       
        System.out.println("enter the 2nd number");
        j = sc2.nextInt();
        System.out.println("Second Entered the number: "+j);
    }
    void showData(){
        System.out.println("\n First number = "+i);
        System.out.println("\n Second number = "+j);
        System.out.println("\n Ans is : "+ans);

    }
    void myadd(){
        getdata();
        ans = i + j;
    }
    void mysubstraction(){
        getdata();
        ans = i - j;
    }
    void mymultipication(){
        getdata();
        ans = i * j;
    }
    void mydivision(){
        getdata();
        ans = i / j;
    }
    
}
public class maincalculator {
    public static void main(String[] arg){
    calculator obj = new calculator();
    switch(obj.menu()){
        case 1: obj.myadd();obj.showData();break;
        case 2: obj.mysubstraction();obj.showData();break;
        case 3: obj.mymultipication();obj.showData();break;
        case 4: obj.mydivision();obj.showData();break;
        default : System.out.println("\n invalid input");

    }
    }
    
}

