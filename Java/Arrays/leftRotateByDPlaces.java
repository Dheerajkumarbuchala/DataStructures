import java.util.*;

class leftRotateByDPlaces{

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
        System.out.print("Enter the no of places to rotate : ");
        int d = sc.nextInt();
        d = d % n;
        leftRotateByD(arr, d);
        System.out.println("Array after rotating by D places : " + arr);
    }

    public static void leftRotateByD(ArrayList<Integer> arr, int d){
        rotate(arr, 0, d-1);
        rotate(arr, d, arr.size()-1);
        rotate(arr, 0, arr.size()-1);
    }

    public static void rotate(ArrayList<Integer> arr, int l ,int h){
        int temp = 0;
        while(l < h){
            temp = arr.get(l);
            arr.set(l, arr.get(h));
            arr.set(h, temp);
            l++;
            h--;
        }
    }
};