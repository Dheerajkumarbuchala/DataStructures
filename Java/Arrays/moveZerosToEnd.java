import java.util.*;

class moveZerosToEnd{

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
        moveZeros(arr);
        System.out.println("Array after moving zeros : " + arr);
    }

    public static void moveZeros(ArrayList<Integer> arr){
        int res = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) != 0){
                arr.set(res, arr.get(i));
                arr.set(i, 0);
                res = res + 1;
            }
        }
    }
};