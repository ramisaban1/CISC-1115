public class Test495 {
  public static void main (String[] args) {
    int a = 4, b = 3;
    double c;
    c = dividethetwo(a,b);
    System.out.println(c);
  }
  public static double dividethetwo (int x, int y){
    double divide=0.0;
    if(x == y)
      divide = (double)(x-1)/(y*y+1);
    if(x < y)
      divide = (double)(x/y);
    if(x > y)
      divide = (double)y/x;
    return divide+1;
  }}