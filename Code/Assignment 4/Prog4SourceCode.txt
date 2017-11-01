/* Rahamim Rami Saban, this is Program 4. This program
 * will analyze multiple groups of SAT scores, vaild,
 * and invlaid. It will be utilizing a variety of methods,
 * one of which determains said score's validity. At the
 * end of the program it will print the amount of total, 
 * vaild, and invalid groups.
 */

import java.io.*;
import java.util.Scanner;
public class Prog4 {
  public static void main (String[] args)throws IOException{
    int totgroup = 0,math, english, writing, validcounter = 0, invalidcounter = 0;
    boolean c;
    Scanner input = new Scanner (System.in); //declare scanner object
    System.out.println("Enter scores in this order, math, emglish, writing");
    System.out.println("to end type -1 for math");
    PrintWriter out = new PrintWriter ("out.txt");
    math = input.nextInt();
    while(math != -1){
      english = input.nextInt();
      writing = input.nextInt();
      totgroup++;
      out.println( math+" on math, "+english+" on english, and "+writing+" on writing");
      c = isitavalidgroup(math, english, writing); //method to determine validity
      if( c == true){
        out.println("This is a vaild group.");
        validcounter++;
        classify(math, english, writing);} //method that calls other methods
      else{
        invalidcounter++;
        out.println("This is not a vaild group.");
        out.println();
        out.println();   //needed to separate the groups.
        out.println();
        math = input.nextInt(); //math comes in twice at the end of the loop, since we need to input a new value for
        continue;}              //math especially since the loop depends on the value assigned to math.
      out.println();
      out.println();      //needed to separate the groups.
      out.println();
      math = input.nextInt();
    }
    out.println(totgroup+" groups calculated, "+validcounter+" vaild groups, and "+invalidcounter+" invalid groups");
    out.close();
    input.close();
  }
  //This method checks that each score is indeed valid
  //using a variety of if else statements.
  public static boolean isitavalidgroup( int x, int y, int z ){
    boolean a, b, c;
    if((x < 200 || x > 800) || (x%10 != 0)){
      System.out.println(x+" is not a valid score. Try again");
      a = false;}
    else
      a = true;
    if((y < 200 || y > 800) || (y%10 != 0)){
      System.out.println(y+" is not a valid score. Try again");
      b = false;}
    else
      b = true;
    if((z < 200 || z > 800) || (z%10 != 0)){
      System.out.println(z+" is not a valid score. Try again");
      c = false;}
    else
      c = true;
    if(a == true && b == true && c == true)
      return true;
    else
      return false;
  }
  public static void classify (int x, int y, int z) {
    int a;
    ratesonescore(x);
    ratesonescore(y);
    ratesonescore(z);
    a = findtotalscore(x, y, z);
    ratethegroup(x, y, z, a);
    return;
  }
  //this method rates one score depending on its value
  public static void ratesonescore (int j){
    if(j < 500)
      System.out.println("Score is less than 500");
    if(j >= 500 && j < 800)
      System.out.println("Score is 500 or above");
    if(j == 800)
      System.out.println("Perfect Score!");
    return;
  }
  //this method computes the sum of all three scores
  public static int findtotalscore (int i, int j, int k){
    int sum = i + j + k;
    System.out.println("The total score is "+sum);
    return sum;
  }
  //I have a feeling that using switch would have been better
  //but since I have already done it this way I am going to
  //keep it
  public static void ratethegroup (int a, int b, int c, int d){
    if(d >= 2100 && a >= 700 && b >= 700 && c >= 700)
      System.out.println("this group is outstanding");
    else{
      if(d >= 2100 && ((a >= 700 && b >=700) || (a >= 700 && c >= 700) || (b >= 700 && c >= 700)))
        System.out.println("this group is very good");
      else{
        if(d >= 2100 && (a >= 700 || b >= 700 || c >= 700))
          System.out.println("this group is lop-sided");
        else{
          if(d < 2100 && a < 500 && b < 500 && c < 500)
            System.out.println("this group is week");
          else
            System.out.println("this group is erratic");
          //I
        }}}
    return;
  }
}