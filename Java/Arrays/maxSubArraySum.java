import java.util.*;

class maxSubArraySum{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.println("Maximum subarray sum : " + maxSubarraySum(arr));
    }

    public static int maxSubarraySum(ArrayList<Integer> arr){
        int n = arr.size(), curr = arr.get(0), res = arr.get(0);
        for(int i=1;i<n;i++){
            curr = Math.max(arr.get(i),  curr + arr.get(i));
            res = Math.max(res, curr);
        }
        return res;
    }
};