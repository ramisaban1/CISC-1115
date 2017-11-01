/*This program will calculate the square roots of numbers from 1 to 10, by increments
 * of 0.5
 * 
 */
public class SQRTNumbers2 {
  public static void main (String [] args){
    double number,root;
    for(number=1;number<=10;number=number+0.5){
      root=Math.sqrt(number);
      System.out.println("number is "+number+" its root is "+root);
    }
  }
}
