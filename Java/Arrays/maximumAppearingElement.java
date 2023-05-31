import java.util.*;

class maximumAppearingElement{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the size of the arrays : ");
        n = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter the upper and lower bounds of the arrays : ");
        for(int i=0;i<n;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            arr1.add(l);
            arr2.add(r);
        }
        System.out.println("Maximum appearing element : " + maxElement(arr1, arr2));
    }

    public static int maxElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        int res = 0, n =  arr1.size();
        int [] arrSum = new int [100];
        for(int i=0;i<n;i++){
            arrSum[arr1.get(i)]++;
            arrSum[arr2.get(i) + 1]--;
        }
        ArrayList<Integer> pSum = new ArrayList<>();
        pSum.add(arrSum[0]);
        int curr = arrSum[0];
        for(int i=1;i<100;i++){
            int k = pSum.get(i-1) + arrSum[i];
            pSum.add(k);
            if(k > curr){
                curr = k;
                res = i;
            }
        }
        return res;
    }
};