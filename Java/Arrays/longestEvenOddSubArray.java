import java.util.*;

class longestEvenOddSubArray{

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
        System.out.println("Length of longest even odd subarray : " + evenOddSubArray(arr));
    }

    public static int evenOddSubArray(ArrayList<Integer> arr){
        int n = arr.size(), res = 1, curr = 1;
        for(int i=1;i<n;i++){
            if((arr.get(i-1)%2==0 && arr.get(i)%2!=0) || (arr.get(i-1)%2!=0 && arr.get(i)%2==0)){
                curr = curr + 1;
                res = Math.max(res, curr);
            }
            else{
                curr = 1;
            }
        }
        return res;
    }
};