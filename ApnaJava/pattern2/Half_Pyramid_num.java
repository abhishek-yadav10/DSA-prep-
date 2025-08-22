package pattern2;

public class Half_Pyramid_num {
    public static void halfpyramid_num(int n){
        for(int i=1;i<=n;i++){
            //for printing num
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            
            }
        System.out.println();}
    }
   

    public static void main(String[] args) {
        halfpyramid_num(5);
    }
}
