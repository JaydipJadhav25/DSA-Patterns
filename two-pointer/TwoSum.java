import java.util.*;

public class TwoSum{
       public static void main(String[] x){
         System.out.println("Enter size of array : ");
         Scanner sc = new Scanner(System.in);
         int size  =  sc.nextInt();
         System.out.println("Enter target sum  for array : ");
         int targetsum = sc.nextInt() ;
         int[] array = new int[size];
          
         System.out.println("enter array elements  :");

         for(int i = 0 ; i < size ; i++){
            //take value from user
            array[i] = sc.nextInt();
         }
         
         System.out.print("Array : ");
        //print array 
        for(int i = 0 ; i < size ; i++){
            System.out.print(array[i] +" ");
         }
         System.out.println();



    //1 . brute force O(n^2)
       for(int i = 0 ; i < size -1 ; i++){
           for(int j = i+1 ; j < size ; j++){
             if (array[i] + array[j] == targetsum) {
                System.out.println("Target element :" + array[i]+ " ," + array[j]);
                break;
             }
           }
       }
    


   

        






       }
}