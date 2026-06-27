import java.util.*;

public class Sorting {

    public static void main(String[] s){
     
        int[] arr = { 16,1,0,9,100};


        //loop
        for(int i = arr.length - 1; i >= 0 ; i--){
            int max = i ;
            //innner loop
            for(int  j = 0 ; j<= i ; j++){
              //finde max
              if (arr[max] < arr[j]) {
                max = j;

              }
            }
            //update now 
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
          
        }


        //now check lopop
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
        }


    }
    
}
