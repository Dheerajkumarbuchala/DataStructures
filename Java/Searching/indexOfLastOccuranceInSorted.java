import java.util.*;

class indexOfLastOccuranceInSorted{

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
        System.out.print("Enter the element to find the index of last occurance : ");
        int k = sc.nextInt();
        System.out.println("Index of last occurance of the element " + k + " is : " + indexOfLastOccuranceRecursion(arr, 0, n-1, k));
        System.out.println("Index of last occurance of the element " + k + " is : " + indexOfLastOccuranceIterative(arr, 0, n-1, k));
    }

    public static int indexOfLastOccuranceRecursion(ArrayList<Integer> arr, int l, int h, int k){
        if(l > h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr.get(mid) > k){
            return indexOfLastOccuranceRecursion(arr, l, mid-1, k);
        }
        else if(arr.get(mid) < k){
            return indexOfLastOccuranceRecursion(arr, mid+1, h, k);
        }
        else{
            int n = arr.size();
            if(mid == n-1 || arr.get(mid+1) != arr.get(mid)){
                return mid;
            }
            else{
                return indexOfLastOccuranceRecursion(arr, mid+1, h, k);
            }
        }
    }

    public static int indexOfLastOccuranceIterative(ArrayList<Integer> arr, int l, int h, int k){
        int n = arr.size();
        while(l <= h){
            int mid = (l+h)/2;
            if(arr.get(mid) > k){
                h = mid - 1;
            }
            else if(arr.get(mid) < k){
                l = mid + 1;
            }
            else{
                if(mid == n-1 || arr.get(mid+1) != arr.get(mid)){
                    return mid;
                }
                else{
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
};