package Function;
import java.util.Scanner;
public class factFun {
  public static int Factorial(int a) 
  { int fact=1;
    for(int i=1; i<=a; i++ )
    {
       fact= fact *i;
      
    } return fact;
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int ans=Factorial(a);
  System.out.println(ans);

    sc.close(); }
}
