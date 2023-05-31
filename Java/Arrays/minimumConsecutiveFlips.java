import java.util.*;

class minimumConsecutiveFlips{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the binary array : ");
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr.add(k);
        }
        minConsecutiveFlips(arr);
    }

    public static void minConsecutiveFlips(ArrayList<Integer> arr){
        for(int i=1;i<arr.size();i++){
            if(arr.get(i) != arr.get(i-1)){
                if(arr.get(i) != arr.get(0)){
                    System.out.print("From " + i + " to ");
                }
                else{
                    System.out.print(i-1 + "\n");
                }
            }
        }
        if(arr.get(arr.size() - 1) != arr.get(0)){
            System.out.print(arr.size() - 1 + "\n");
        }
    }
};