import java.util.Scanner;
public class athleteScores {
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    int judge, id;
    double grade, pScore;
    System.out.println("Please enter ID#:      type -1 to end");
    id = input.nextInt();
    while( id != -1){
      System.out.println("Please enter the amount of judges");
      judge = input.nextInt();
      System.out.print(id+" "+judge+" ");
      for(int i = 1;i <= judge;i++){
        grade = input.nextDouble();
        System.out.print(grade);}}}}
        
      
    