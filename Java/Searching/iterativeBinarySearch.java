import java.util.*;

class iterativeBinarySearch{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, element = 0;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array in sorted order : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.print("Enter the element to be searched : ");
        element = sc.nextInt();
        System.out.println("Index of the element in the array : " + binarySearch(arr, element));
    }

    public static int binarySearch(ArrayList<Integer> arr, int element){
        int l = 0, h = arr.size() - 1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr.get(mid) == element){
                return mid;
            }
            else if(arr.get(mid) > element){
                h = mid - 1;
            }
            else if(arr.get(mid) < element){
                l = mid + 1;
            }
        }
        return -1; 
    }
};