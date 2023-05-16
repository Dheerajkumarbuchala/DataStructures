import java.util.*;

class trappingRainWaterEfficient{

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
        System.out.println("Rain water trapped : " + rainWater(arr));
    }

    public static int rainWater(ArrayList<Integer> arr){
        int n = arr.size(), res = 0;
        int [] lmax = new int [n];
        int [] rmax = new int [n];
        lmax[0] = arr.get(0);
        rmax[n-1] = arr.get(n-1);
        for(int i=1;i<n;i++){
            lmax[i] = Math.max(lmax[i-1], arr.get(i));
        }
        for(int i=n-2;i>=0;i--){
            rmax[i] = Math.max(rmax[i+1], arr.get(i));
        }
        for(int i=0;i<n;i++){
            res = res + Math.min(lmax[i], rmax[i]) - arr.get(i);
        }
        return res;
    }
};