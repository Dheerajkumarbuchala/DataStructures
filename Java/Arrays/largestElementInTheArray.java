import java.util.*;

class largestElementInTheArray{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.println("Largest element in the array : " + largest(arr));
    }

    public static int largest(ArrayList<Integer> arr){
        int res = -1;
        for(int i=0;i<arr.size();i++){
            if(res < arr.get(i)){
                res = arr.get(i);
            }
        }
        return res;
    } 
};