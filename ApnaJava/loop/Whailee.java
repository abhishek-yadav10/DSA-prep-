package loop;
import java.util.Scanner;

public class Whailee {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int range = obj.nextInt();
        int count=1;
        while(count<=range)
        {
            System.out.print(count+" ");
            count++;
        }
        System.out.println();


    obj.close();}
}
