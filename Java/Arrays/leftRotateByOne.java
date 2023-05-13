import java.util.*;

class leftRotateByOne{

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
        leftRotate(arr);
        System.out.println("Array after rotation : " + arr);
    }

    public static void leftRotate(ArrayList<Integer> arr){
        int temp = arr.get(0);
        for(int i=0;i<arr.size()-1;i++){
            arr.set(i, arr.get(i+1));
        }
        arr.set(arr.size()-1, temp);
    }
};