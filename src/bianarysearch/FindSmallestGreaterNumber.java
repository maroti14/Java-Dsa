package bianarysearch;

public class FindSmallestGreaterNumber {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9};
        int target = 6;

        System.out.println(findSmallestGreaterNumber(arr,target));
    }

    static int findSmallestGreaterNumber(int arr[],int target){
        int start =0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start +(end -start) / 2;
            if(target > arr[mid]){
                start = mid +1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else if (target == arr[mid]) {
                return  mid;
            }
        }
        return start;
    }

}
