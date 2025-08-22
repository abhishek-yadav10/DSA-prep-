package ShortingAlgo;

public class BubbleShort {


    public static void Bubbleshort(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                int term=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=term;


                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={8,9,1,5,2,3,4,7,6};
     Bubbleshort(arr);
     printArr(arr);

    }
}
