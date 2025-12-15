package cyclesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateNumbers {

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};

        List<Integer> list = findDuplicateNumber(arr);
        System.out.println(list);
    }
    static List<Integer> findDuplicateNumber(int nums[]){
        int i =0;
        List<Integer> list = new ArrayList<>();
        while (i<nums.length){
            int currentIndex = nums[i] - 1;
            if (nums[i] != nums[currentIndex]){
                int temp = nums[i];
                nums[i]=nums[currentIndex];
                nums[currentIndex]=temp;
            }else {
                i++;
            }
        }
        for (int index = 0; index<nums.length;index++){

            if (nums[index] != index + 1){
               list.add(nums[index]);
            }
//            return  list;

        }
        return list;

    }
}
