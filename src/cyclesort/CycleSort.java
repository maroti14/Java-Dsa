package cyclesort;

import java.util.Arrays;

public class CycleSort {


    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
      sort(arr);
        System.out.println(Arrays.toString(arr)+"dchsdgv");
    }

    static void sort(int arr[]){
        int i =0;
        while (i< arr.length){
            int currect = arr[i] -1;
            if (arr[i] != arr[currect]){
                int temp = arr[i];
                arr[i]=arr[currect];
                arr[currect]=temp;
//                swap(arr,i ,currect);
            }else {
                i++;
            }

        }
    }

    static void swap(int arr [],int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
}
