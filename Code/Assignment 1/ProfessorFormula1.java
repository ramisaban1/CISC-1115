/*
 * My name is Rahamim Rami Saban, this is Program 1
 * This program will output my name. It will also
 * compute a formula (Y) with given X's going up by 
 * increments of 0.5 from -3.0 to +3.0. After computing
 * the values it will format an organized output
 * displaying the values of X and Y for each given computation,
 * as well as state whether Y is positive, zero, or negetive.
 * At the end of the last computation the program will state
 * that it has finished.
 */
public class ProfessorFormula {
  public static void main (String[] args) {
    System.out.println("My name is Rami Saban, and this is Program 1's first output.");
    double x,y;
    for(x=-3.0;x<=3.0;x=x+0.5){
      y=((4*x*x*x)+(8*x*x)-(31*x)-35)/(Math.sqrt((3*x*x)+1)+(2*Math.abs(x-1.5)));
      System.out.printf("X is %8.4f  Y is %8.4f",x,y);
      if(y==0)
       System.out.print("    Y IS ZERO ");
      if(y>0)
       System.out.print("    Y IS POSITIVE ");
      if(y<0)
        System.out.print("    Y IS NEGATIVE ");
      System.out.println();}
  System.out.print("This program is now complete");}
}
      