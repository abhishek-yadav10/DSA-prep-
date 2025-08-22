
import java.util.Scanner;


public class AreaCircle {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
       float r=obj.nextFloat();
        float area=3.14f * r * r;
        System.out.println(area);
        
    obj.close();}
}
