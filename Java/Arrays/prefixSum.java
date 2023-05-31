import java.util.*;

class prefixSum{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, l = 0, r = 0;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.print("Enter the lower bound to find the sum : ");
        l = sc.nextInt();
        System.out.print("Enter the higher bound to find the sum : ");
        r = sc.nextInt();
        System.out.println(findSum(arr, l, r));
    }

    public static int findSum(ArrayList<Integer> arr, int l, int r){
        ArrayList<Integer> pSum = new ArrayList<>();
        int n = arr.size();
        pSum.add(arr.get(0));
        for(int i=1;i<n;i++){
            pSum.add(pSum.get(i-1) + arr.get(i));
        }
        if(l == 0){
            return pSum.get(r);
        }
        else{
            return pSum.get(r) - pSum.get(l-1);
        }
    }
};