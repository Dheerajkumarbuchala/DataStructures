import java.util.*;

class trappingRainWater{

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
        for(int i=1;i<n-1;i++){
            int lmax = arr.get(i), rmax = arr.get(i);
            for(int j=0;j<i;j++){
                lmax = Math.max(lmax, arr.get(j));
            }
            for(int j=i+1;j<n;j++){
                rmax = Math.max(rmax, arr.get(j));
            }
            res = res + Math.min(lmax, rmax) - arr.get(i);
        }
        return res;
    }
};