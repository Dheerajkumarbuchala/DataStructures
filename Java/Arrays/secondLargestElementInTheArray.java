import java.util.*;

class secondLargestElementInTheArray{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.println("Second largest element : " + secondLargestElementInTheArray(arr));
    }

    public static int secondLargestElementInTheArray(ArrayList<Integer> arr){
        int temp = -1, res = -2;
        for(int i=0;i<arr.size();i++){
            if(temp < arr.get(i)){
                res = temp;
                temp = arr.get(i);
            }
            else if(res < arr.get(i)){
                res = arr.get(i);
            }
        }
        return res;
    }
};