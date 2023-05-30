import java.util.*;

class majorityElement{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        System.out.println("Position of majority element in the array : " + findMajorityElement(arr));
    }

    public static int findMajorityElement(ArrayList<Integer> arr){
        int n = arr.size(), res = 0, count = 1;

        for(int i=1;i<n;i++){
            if(arr.get(res) == arr.get(i)){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res = i;
                count = 1;
            }
        }

        count = 0;
        for(int i=0;i<n;i++){
            if(arr.get(res) == arr.get(i)){
                count++;
            }
        }
        if(count <= n/2){
            res = -1;
        }
        return res;
    }
};