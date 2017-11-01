/*
 * My name is Rahamim Rami Saban, this is Program 1
 * This program will output my name. It will also
 * compute a formula (Y) with given X's going up by 
 * increments of 0.5 from -3.0 to +3.0. After computing
 * the values it will format an organized output
 * displaying the values of X and Y for each given computation.
 * It will also state whether Y is positive, zero, or negetive.
 * If positive it will count how many positive results there
 * are. The same applies to negetive, as well as zero.
 * At the end of the last computation the program will state
 * that it is finished.
 */
public class ProfessorFormula {
  public static void main (String[] args) {
    System.out.println("My name is Rami Saban, and this is Program 1's first output.");
    double x,y;
    int countingZ,countingP,countingN;
    countingZ=0;
    countingP=0;
    countingN=0;
    for(x=-3.0;x<=3.0;x=x+0.5){
      y=((4*x*x*x)+(8*x*x)-(31*x)-35)/(Math.sqrt((3*x*x)+1)+(2*Math.abs(x-1.5)));
      System.out.printf("X is %8.4f  Y is %8.4f",x,y);
      if(y==0){
        countingZ++;
        System.out.print("    Y IS ZERO      "+countingZ);}
      if(y>0){
        countingP++;
        System.out.print("    Y IS POSITIVE  "+countingP);}
      if(y<0){
        countingN++;
        System.out.print("    Y IS NEGATIVE  "+countingN);}
      System.out.println();}
    System.out.println(countingZ);
  System.out.print("This program is now complete");}
}
      