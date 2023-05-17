import java.util.*;

class maxCircularSubArray{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            int k  = sc.nextInt();
            arr.add(k);
        }
        System.out.println("Max circular subarray sum : " + circularSubArraySum(arr));
    }

    public static int circularSubArraySum(ArrayList<Integer> arr){
        int maxSubarraysum = maxSubarraySum(arr);
        if(maxSubarraysum < 0){
            return maxSubarraysum;
        }
        else{
            int arr_sum = 0, circularSum = 0, n = arr.size();
            for(int i=0;i<n;i++){
                arr_sum = arr_sum + arr.get(i);
                arr.set(i, -arr.get(i));
            }
            circularSum = arr_sum + maxSubarraySum(arr);
            return Math.max(maxSubarraysum, circularSum);
        }
    }

    public static int maxSubarraySum(ArrayList<Integer> arr){
        int n = arr.size(), res = arr.get(0), curr = arr.get(0);
        for(int i=1;i<n;i++){
            curr = Math.max(arr.get(i), curr + arr.get(i));
            res = Math.max(curr, res);
        }
        return res;
    }
};