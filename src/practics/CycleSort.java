package practics;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        sortCycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortCycleSort(int arr[]){
        int i =0;
        while (i<arr.length){
            int currentIndex = arr[i] - 1;

            if(arr[i] != arr[currentIndex]){
                int temp = arr[i];
                arr[i]=arr[currentIndex];
                arr[currentIndex]=temp;
            }else {
                i++;
            }

        }
    }

}
