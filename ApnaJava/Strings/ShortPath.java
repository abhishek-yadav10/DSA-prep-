package Strings;
 
public class ShortPath {
    
    public static float GetShortPath(String path){
        int x=0, y=0;

       for(int i =0;i<path.length();i++){
        int direct=path.charAt(i);
        
        //south
        if(direct=='S'){
             y--;
        }
             //North
        else if(direct=='N'){
            y++;
        }
        else if(direct=='W'){
            x--;
        }
        else{
            x++;
        }
       }
       int x2=x*x;
       int y2=y*y;
       return (float)Math.sqrt(x2+y2);
    } 


     public static void main(String[] args) {
        String path="NS";
        System.out.println(GetShortPath(path));

     }    
}
