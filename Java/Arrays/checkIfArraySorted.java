import java.util.*;

class chechIfArraySorted{

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
        boolean res =  checkStatus(arr);
        if(res){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }

    public static boolean checkStatus(ArrayList<Integer> arr){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i) > arr.get(i+1)){
                return false;
            }
        }
        return true;
    }

};