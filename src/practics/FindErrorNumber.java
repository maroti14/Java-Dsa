package practics;

import java.util.Arrays;

public class FindErrorNumber {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};

        int[] ans = findErrorNumber(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] findErrorNumber(int arr[]){
        int i =0;

        while (i<arr.length){
            int currentIndex = arr[i] - 1;
            if (arr[i] !=arr[currentIndex]){
                int temp = arr[i];
                arr[i]=arr[currentIndex];
                arr[currentIndex]=temp;
            }else {
                i++;
            }
        }for (int index=0;index<arr.length;index++){
            if (arr[index] !=index + 1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
}
