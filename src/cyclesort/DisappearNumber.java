package cyclesort;

import java.util.ArrayList;
import java.util.List;

public class DisappearNumber {
    public static void main(String[] args) {

        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearNumber(arr);
        System.out.println(list);

    }

    static List<Integer> findDisappearNumber(int arr[]){
        List<Integer> list = new ArrayList<>();
        int i = 0;

        while (i< arr.length){
            int currentIndex = arr[i] -1;
            if (arr[i] != arr[currentIndex]){
                int temp = arr[i];
                arr[i]=arr[currentIndex];
                arr[currentIndex]= temp;
            } else {
                i++;
            }
        }

        for (int index =0;index<arr.length;index++){

            if (arr[index] != index+1){

                list.add(index+1);
            }

        }

        return  list;

    }

}
