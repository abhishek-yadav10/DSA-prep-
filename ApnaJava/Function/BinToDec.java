package Function;

public class BinToDec {
    public static void binaryToDecimal(int binNum) {
      int powr=0;
      int decnum=0;
     
      while(binNum>0){
        int lastdigit=binNum%10;
        decnum=decnum + (lastdigit * (int) Math.pow(2,powr));
        powr++;
        binNum=binNum/10;
      }
    }

    public static void main(String[] args) {
        int binNum = 101;
        binaryToDecimal(binNum);
    }
        
}
