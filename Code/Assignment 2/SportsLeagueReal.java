import java.util.Scanner;
public class SportsLeagueReal {
  public static void main (String[] args){
    Scanner input=new Scanner (System.in);
    //prompt
    System.out.println("Please Enter ID#:       to end enter -1");
    int id,wins,losses,teamCounter=0,totgames,remain;
    id=input.nextInt();
    while(id!=-1){
      System.out.println("Please enter the number of Wins, then the number of Losses");
      wins=input.nextInt();
      losses=input.nextInt();
      totgames=wins+losses;
      remain=25-totgames;
      double average=(double)wins/totgames;
      System.out.println("Team "+id+"\n"+wins+" Wins  "+losses+" Losses");
      System.out.print("Total number of games played is "+totgames);
      if(totgames<25)
        System.out.print("      "+remain+" games remaining \n");
      if(totgames==25)
        System.out.print("      The season is finished \n");
      System.out.printf("The winning average is %.4f \n",average);
      if(remain>=wins)
        System.out.println("The number of games remaining is greater than or equal to the number of games won");
      else
        System.out.println("The number of games remaining is not greater than or equal to the number of games won");
      if(remain>=losses)
        System.out.println("The number of games remaining is greater than or equal to the number of games lost");
      else
        System.out.println("The number of games remaining is not greater than or equal to the number of games lost");
      teamCounter++;
      System.out.println("\n \n \n");
      System.out.println("Please enter ID#:");
      id=input.nextInt();
    }
    System.out.println(teamCounter+" teams are in the league");
  }}
      