package Recursion;

public class Basic {
    public static void printDec(int n){
      if(n==1){
        System.out.print(n);
        return;
      }
       
      System.out.print(" "+ n+" ");
      printDec(n-1);
    }
     
    public static void printnum(int n){
        printnum(n-1);
    }

    public static void main(String[] args) {
        printDec(10);
    }

}


