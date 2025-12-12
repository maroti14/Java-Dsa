package bianarysearch;

public class FindTargetElement {

    public static void main(String[] args) {
        int arr[] ={1,4,7,11,18,20,21,50};
        int target= 4;

        System.out.println(findTargetElementBinarySearch(arr,target));
    }


    static int findTargetElementBinarySearch(int arr[],int target){

        int start =0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start + (end - start) /2;

            if (target > arr[mid]){
                start = mid +1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else if (target == arr[mid]){
                return  mid;
            }
        }
        return  -1;

    }

}
