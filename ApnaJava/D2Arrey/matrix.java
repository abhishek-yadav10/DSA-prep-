package D2Arrey;
import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
             matrix[i][j]=sc.nextInt();
           
            }

        }

        //output
           for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
           System.out.print(matrix[i][j]+" ");
         
        
        }System.out.println();

    
      }

      search(matrix, 6);
   sc.close(); }

   public static boolean search(int matrix[][], int key) {
       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
          if(matrix[i][j] == key){
            System.out.println("found at index  ("+ i+","+j+")");
            return true;
          }
         
        
        }

    
      }System.out.println("key not found");
      return false;
      
   }
}