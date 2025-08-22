package Array;
import java.util.Scanner;
public class BinarySarch {

    public static int BinaryS(int num[],int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
          int mid=(start+end)/2;
          if(num[mid]==key){
            return mid;
          }
          if(num[mid]<key){
            start=mid+1;
          }else{
            end=mid-1;
          }
        } return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num[]={2,3,4,5,6,11,15,19};
        int key=1;
        System.out.println("the key at index :"+ BinaryS(num, key));
        sc.close();
    }
}
