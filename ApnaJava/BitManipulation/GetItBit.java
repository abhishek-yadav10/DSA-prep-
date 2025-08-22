package BitManipulation;

public class GetItBit {
     public static int ithBit(int n ,int i){
        int BitMask=1<<i;
        if((n & BitMask)==0){
           return 0;
        }else{
            return 1;
        }
     }


     public static int SetBit(int n ,int i){
        int BitMask=1<<i;
       
           return n|BitMask;
        }


          public static int clearBit(int n ,int i){
        int BitMask=~(1<<i);
       
           return n & BitMask;
        }

     
    public static void main(String[] args) {
       System.out.println(ithBit(10, 2));
       System.out.println(ithBit(20, 2));
       System.out.println(SetBit(10,2));
       System.out.println(clearBit(10,1));
       

    }
}
