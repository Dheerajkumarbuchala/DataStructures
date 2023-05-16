import java.util.*;

class frequencyInSortedArray{

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
        printFrequencies(arr);
    }

    public static void printFrequencies(ArrayList<Integer> arr){
        int n = arr.size(), i = 1, freq = 1;
        while(i < n){
            while((i < n) && (arr.get(i) == arr.get(i-1))){
                freq++;
                i++;
            }
            System.out.println(arr.get(i-1) + " " + freq);
            i++;
            freq = 1;
        }
        if((n==1) || (arr.get(n-1) != arr.get(n-2))){
            System.out.println(arr.get(n-1) + " " + 1);
        }
    }
};