import java.util.Scanner;
  public class Review {
  public static void main (String args[]) {
    Scanner input = new Scanner (System.in);
    String multiPurpose = input.nextLine();
    System.out.println(multiPurpose);
    fileCreation();
  input.close();
  }}
  public static String fileCreation (String f){
    PrintWriter write;
    write = new PrintWriter("input.txt");
    write.out("HEllo WORLD!!!!");
  }
    