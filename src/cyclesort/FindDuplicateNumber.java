package cyclesort;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int arr[]={1,3,3,4,2};

        System.out.println(findDuplicateNumber(arr)+"dd");
        System.out.println(Arrays.toString(arr));
    }


    static int findDuplicateNumber(int arr[]){
        int i =0;

        while (i<arr.length){
            int currentIndex = arr[i] - 1;
            if (arr[i] != arr[currentIndex]){
                int temp = arr[i];
                arr[i]=arr[currentIndex];
                arr[currentIndex]=temp;
            }else {
                i++;
            }
        }
        for (int index = 0; index<arr.length;index++){

            if (arr[index] != index + 1){
                return arr[index];
//                return index + 1;
            }

        }
        return -1;
    }


}
