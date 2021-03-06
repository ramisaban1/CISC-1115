/*Rahamim Rami Saban, this is program 2.
 * This program takes input from keyboard 
 * and outputs to interactions that will 
 * analyze a list of teams and their
 * correspondaing statistics. It will list
 * their wins, losses, amount of games remaining, etc...)
*/

import java.util.Scanner;
public class SportsLeagueEC {
  public static void main (String[] args){
    Scanner input=new Scanner (System.in);
    //prompt
    System.out.println("Please Enter ID#:       to end enter -1");
    int id,wins,losses,teamCounter=0,totgames,remain;
    double average,maxAll=0,max25=0;
    id=input.nextInt();
    while(id!=-1){
      System.out.println("Please enter the number of Wins, then the number of Losses");
      wins=input.nextInt();
      losses=input.nextInt();
      totgames=wins+losses;
      remain=25-totgames;
      if(totgames>25)           //print error if the total games is over 25
        System.out.println("Error, (the total games can not be greater than 25, (Please run the program again and input new data)");
      else{                //if 25 or under follow through with output
        average=(double)wins/totgames;
        if(average>maxAll){
          if(average<1)
            maxAll=average;}
        if(totgames==25){
          if(max25<average){
            if(average<1)
              max25=average;}}
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
      }}
    System.out.println(teamCounter+" teams are in the league");
    System.out.println(maxAll+" is the highest winning average out of all of the teams");
    System.out.println(max25+" is the highest winning average out of all of the teams that have completed their seasons");
  }}
      