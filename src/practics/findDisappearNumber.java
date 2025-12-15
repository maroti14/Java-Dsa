package practics;

import java.util.ArrayList;
import java.util.List;

public class findDisappearNumber {
    public static void main(String[] args) {

        int arr[]={4,3,2,7,8,2,3,1};

        List<Integer> list= findDessapearNumber(arr);
        System.out.println(list);

    }

    static List<Integer> findDessapearNumber(int arr[]){
        List<Integer> ans = new ArrayList<>();

        int i =0;
        while (i<arr.length){
            int currentIndex = arr[i] -1;
            if (arr[i] !=arr[currentIndex]){
                int temp = arr[i];
                arr[i]=arr[currentIndex];
                arr[currentIndex]=temp;
            }else {
                i++;
            }

        }
        for (int index =0;index<arr.length;index++){
            if (arr[index] != index+1){

                ans.add(index+1);
//                return  ans;
            }
        }
        return ans;
    }




}
