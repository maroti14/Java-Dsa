package bianarysearch;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {


        int arr[]={1,2,4,4,5,6,7,8,9,12,12,45,78};
        int target =12;
        int[] ans = searchRange(arr,target);

        System.out.println(Arrays.toString(ans));
//        System.out.println(Arrays.toString(searchFirstAndLast(arr,target)));
    }

    static int[] searchFirstAndLast(int arr[],int target){

        int[] ans = {-1,-1};
//        boolean isExist = true;
        for (int i =0;i<arr.length;i++){
            if (target == arr[i]){
                ans[0]= i;
                break;
            }
        }
        for (int i = arr.length -1;i>=0;i--){
            if (target==arr[i]){
                if(ans[0]!=i)
                    ans[1]=i;
                break;
            }
        }
        return ans;

    }

    public static int[]  searchRange (int[] nums, int target){
        int[] ans = {-1,-1};

        ans[0] = search(nums,target,true);
        if (ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }

    static int search(int[] nums,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while (start<=end){
            int mid = start + (end - start) /2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else {
                ans = mid;
                if (findStartIndex){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return  ans;
    }

}
