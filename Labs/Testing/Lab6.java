import java.util.Scanner;
public class Lab6 {
  public static void main(String [] args) {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("please type in a value ");
    int number=keyboard.nextInt();
    System.out.println("you typed in "+number);
    if(number>5)
      System.out.println("the value is greater than 5");
    if(number<5)
      System.out.println("the value is smaller than 5");
    if(number==5)
      System.out.println("the vale is the plain number 5");
  }
}