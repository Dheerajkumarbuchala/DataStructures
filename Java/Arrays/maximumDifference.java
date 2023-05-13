import java.util.*;

class maximumDifference{

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
        System.out.println("Maximum difference : " + maxDiff(arr));
    }

    public static int maxDiff(ArrayList<Integer> arr){
        int res = arr.get(1) - arr.get(0), minValue = arr.get(0);
        for(int i=1;i<arr.size();i++){
            res = Math.max(res, arr.get(i)-minValue);
            minValue = Math.min(minValue, arr.get(i));
        }
        return res;
    }
};