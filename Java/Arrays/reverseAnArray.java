import java.util.*;

class reverseAnArray{

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
        reverse(arr);
        System.out.println("Reversed Array : " + (arr));
    }

    public static void reverse(ArrayList<Integer> arr){
        int l = 0, h = arr.size()-1;
        while(l < h){
            int temp = arr.get(l);
            arr.set(l, arr.get(h));
            arr.set(h, temp);
            l++;
            h--;
        }
    }
};