import java.util.*;

class slidingWindow{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, s = 0;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of the array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.print("Enter the size of the window : ");
        s = sc.nextInt();
        System.out.println("Maximum sum for the window size " + s + " is : " + maxSum(arr, s));
    }

    public static int maxSum(ArrayList<Integer> arr, int s){
        int res = 0, curr = 0, n = arr.size();
        for(int i=0;i<s;i++){
            curr = curr + arr.get(i);
        }
        for(int i=s;i<n;i++){
            curr = curr + arr.get(i) - arr.get(i-s);
            res = Math.max(res, curr);
        }
        return res;
    }
};