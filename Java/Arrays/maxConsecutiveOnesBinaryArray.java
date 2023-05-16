import java.util.*;

class maxConsecutiveOnesBinaryArray{

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
        System.out.println("Max consecutive 1's in the given binary array are : " + maxConsecutiveOnes(arr));
    }

    public static int maxConsecutiveOnes(ArrayList<Integer> arr){
        int n = arr.size(), res = 0,  count = 0;
        for(int i=0;i<n;i++){
            if(arr.get(i) == 0){
                count = 0;
            }
            else{
                count = count + 1;
                res = Math.max(res, count);
            }
        }
        return res;
    }
};