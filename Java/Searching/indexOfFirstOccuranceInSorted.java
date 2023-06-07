import java.util.*;

class indexOfFirstOccuranceInSorted{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array in sorted order : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.print("Enter the element to get the index of the first occurance : ");
        int k = sc.nextInt();
        System.out.println("Index of first occurance of element " + k + " is (using recursion) : " + indexOfFirstOccuranceRecursive(arr, 0, n-1, k));
        System.out.println("Index of first occurance of element " + k + " is (using iterative method) : " + indexOfFirstOccuranceIterative(arr, 0, n-1, k));
    }

    public static int indexOfFirstOccuranceRecursive(ArrayList<Integer> arr, int l, int h, int k){
        if(l > h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr.get(mid) > k){
            return indexOfFirstOccuranceRecursive(arr, l, mid-1, k);
        }
        else if(arr.get(mid) < k){
            return indexOfFirstOccuranceRecursive(arr, mid+1, h, k);
        }
        else{
            if(mid==0 || arr.get(mid) != arr.get(mid-1)){
                return mid;
            }
            else{
                return indexOfFirstOccuranceRecursive(arr, l, mid-1, k);
            }
        }
    }

    public static int indexOfFirstOccuranceIterative(ArrayList<Integer> arr, int l, int h, int k){
        while(l <= h){
            int mid = (l+h)/2;
            if(arr.get(mid) > k){
                h = mid - 1;
            }
            else if(arr.get(mid) < k){
                l = mid + 1;
            }
            else{
                if(mid == 0 || arr.get(mid) != arr.get(mid-1)){
                    return mid;
                }
                else{
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
};