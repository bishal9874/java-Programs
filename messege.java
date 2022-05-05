//Write a Java program to print message using class. 
public class messege {
   public static void main(String[] args) {
    userclass ug = new userclass();
    System.out.println("my massege is: "+ug.txt());
   } 
}
class userclass{
    String txt(){
        return "hello world, my name is Bishal ";
    }
}