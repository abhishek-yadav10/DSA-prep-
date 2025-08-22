package Strings;
//import java.util.Scanner;
public class basicString {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // String name =sc.nextLine();
        // System.out.println(name.length());

        //concatenation
         String Firstname="Abhishek";
         String Lastname=" Yadav";
         String Fullname=Firstname+" "+Lastname;
         System.out.println(Fullname);
         System.out.println(Fullname.charAt(0));
         System.out.println();
         printLetters(Fullname);
//   sc.close(); 
   }

   public static void printLetters(String str)  {
    for(int i=0;i<str.length();i++ ){
        System.out.print(str.charAt(i)+" ");
    }
    
   }
}
