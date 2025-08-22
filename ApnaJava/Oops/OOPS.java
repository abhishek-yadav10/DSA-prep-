package Oops;

public class OOPS{
 public static void main(String[] args) {
    Pen p1 = new Pen();  //created pen object called p1 
      p1.setcolour("blue");
      System.out.println(p1.colour);
      p1.setTip(5);
      System.out.println(p1.tip);

      BankAccount myAcc= new BankAccount();
      myAcc.username ="Abhishek";
      myAcc.setPass("abhi");  
 };
}

class Pen{
    String colour;
    int tip;
   String  getcolour(){
        return this.colour; 
    }
    void setcolour(String newColour){
         colour= newColour;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student {
    String name ;
    int age;
    float cgpa;
    void calCgpa(int phy, int chem,int math){
    cgpa=(phy + chem + math)/3;
    }
}

class BankAccount{
   public String username;
   public String Password;
   public void setPass(String pwd){
    Password=pwd;
   }
}