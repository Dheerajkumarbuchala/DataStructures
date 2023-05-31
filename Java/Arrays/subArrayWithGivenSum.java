import java.util.*;

class subArrayWithGivenSum{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, s = 0;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.print("Enter the targeted sum : ");
        s = sc.nextInt();
        System.out.println(subArrayWithSum(arr, s));
    }

    public static boolean subArrayWithSum(ArrayList<Integer> arr, int s){
        int curr = 0, k = 0, n = arr.size();
        for(int i=0;i<n;i++){
            curr = curr + arr.get(i);
            while(s < curr){
                curr = curr - arr.get(k);
                k++; 
            }
            if(curr == s){
                return true;
            }
        }
        return false;
    }
};