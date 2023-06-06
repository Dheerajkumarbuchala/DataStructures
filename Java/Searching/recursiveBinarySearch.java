import java.util.*;

class recursiveBinarySearch{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :" );
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array in sorted order : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.print("Enter the element to get the position : ");
        int k = sc.nextInt();
        System.out.println("Element " + k + " is found at position " + binarySearch(arr, 0, n-1, k));
    }

    public static int binarySearch(ArrayList<Integer> arr ,int l, int h, int k){
        if(l > h)
            return -1;
        int mid = (l+h)/2;
        if(arr.get(mid) == k)
            return mid;
        else if(arr.get(mid) > k)
            return binarySearch(arr, l, mid-1, k);
        else if(arr.get(mid) < k)
            return binarySearch(arr, mid+1, h, k);
        return -1;
    }
};