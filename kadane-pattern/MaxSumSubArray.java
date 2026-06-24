// package kadane-pattern;

public class MaxSumSubArray {

    public static int maxSubArray(int[] nums) {
        System.out.println("array :" + nums);
     //using kadans algo
     int bestending =  nums[0];
     int ans = nums[0];
    //loop start from one
    for(int i = 1 ; i < nums.length ; i++){
     //get posibilites
     int v1 = nums[i]; //current
     int v2 = bestending + nums[i]; //with back result

     // check
     bestending = Math.max(v1 , v2);
     ans = Math.max(ans , bestending);
     }
     return ans;
    }

    public static void main(String[] s){
          
        int[] nums = {1,-2,3,-4,-2,8};

        int answer = maxSubArray(nums);
        System.out.println(answer);
        System.out.println("end!");


    }

}
