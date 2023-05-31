import java.util.*;

class equilibriumPoint{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.println("Equilibrium point exists : " + checkEquilibriumPoint(arr));
    }

    public static boolean checkEquilibriumPoint(ArrayList<Integer> arr){
        int lsum = 0, rsum = 0;
        for(int i=0;i<arr.size();i++){
            lsum = lsum + arr.get(i);
        }
        for(int i=0;i<arr.size();i++){
            lsum = lsum - arr.get(i);
            if(lsum == rsum){
                return true;
            }
            rsum = rsum + arr.get(i);
        }
        return false;
    }
};