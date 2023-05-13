import java.util.*;

class leaders{

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
        printLeaders(arr);
    }

    public static void printLeaders(ArrayList<Integer> arr){
        int res = arr.get(arr.size()-1);
        System.out.print(res + " ");
        for(int i=arr.size()-2;i>=0;i--){
            if(arr.get(i) > res){
                res = arr.get(i);
                System.out.print(res + " ");
            }
        }
    }
};