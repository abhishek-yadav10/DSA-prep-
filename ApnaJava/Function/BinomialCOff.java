package Function;

import java.util.Scanner;

public class BinomialCOff {
    public static int Factorial(int n) 
  { int fact=1;
    for(int i=1; i<=n; i++ )
    {
       fact= fact *i;
      
    } return fact;
  }

  public static int binCoff(int n ,int r)
  {
     int fact_n=Factorial(n);
     int fact_r=Factorial(r);
     int fact_nmr=Factorial(n-r);

     int binCo=fact_n/(fact_r*fact_nmr);
     return binCo;

  }

public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    int ans =binCoff(n,r);
  System.out.println(ans);

    sc.close();


 }
}

