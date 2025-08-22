package Strings;

public class Palandrome {
    public static boolean ispalandrome(String str) {
        for(int i=0;i<str.length();i++){
            int n=str.length();
          if(str.charAt(i)!= str.charAt(n-i-1)){
            return false;
          }
        } return true;
    }
    public static void main(String[] args) {
        String str="racecar";
      System.out.println(ispalandrome(str));
    }
}
