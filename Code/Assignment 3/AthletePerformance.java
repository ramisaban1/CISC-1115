/*Rahamim Rami Saban, Program 3
 * This program analyzes the athletes scores and
 * computes their averages minus their highest
 * and lowest scores. Scores can range from 0.0-10.0.
 * Each athlete may have a different number of judges
 * scoring them. This program also computes the overall
 * best score and average as well as their corresponding
 * athletes.
 */

import java.io.*;
import java.util.Scanner;
public class AthletePerformance {
  public static void main (String [] args) throws IOException {
    int id, judges, grade, highestAvgid = 0, highestScoreid = 0;
    double score = 0,sumOfscores, highest, lowest, average, highestAvg = 0, highestScore = 0;
    File file = new File ("inputfile.txt");
    Scanner fileinput = new Scanner (file);
    id = fileinput.nextInt();
    while(id != -1){
      highest = -20;
      lowest = 20;
      average = 0;
      sumOfscores = 0;
      judges = fileinput.nextInt();
      for(int i = judges;i >= 1;i--){
        score = fileinput.nextDouble();
        if(score < lowest)
          lowest = score;
        if(score > highest)
          highest = score;
        if(highest > highestScore){
          highestScore = highest;
          highestScoreid = id;
        }
        sumOfscores += score;
      }
      average = (sumOfscores-highest-lowest)/(judges-2);
      if(average > highestAvg){
        highestAvg = average;
        highestAvgid = id;
      }
      System.out.printf("Athlete id # %d had an average of %.3f \n"
                          ,id, average);
      id = fileinput.nextInt();
    }
    System.out.printf("The athlete id # with the best average is: %d with an average of %.3f \n"
                        ,highestAvgid, highestAvg);
    System.out.printf("The best score was %.2f from athlete id # %d",highestScore, highestScoreid);
  fileinput.close();
  }}