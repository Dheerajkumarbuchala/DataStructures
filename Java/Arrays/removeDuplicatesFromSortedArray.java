import java.util.*;

class removeDuplicatesFromSortedArray{

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
        n = removeDuplicates(arr);
        System.out.print("Elements after removing the duplicates : ");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");
        }
    }

    public static int removeDuplicates(ArrayList<Integer> arr){
        int res = 1;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1) != arr.get(i)){
                arr.set(res, arr.get(i));
                res = res + 1;
            }
        }
        return res;
    }
};