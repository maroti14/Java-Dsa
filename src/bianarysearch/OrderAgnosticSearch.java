package bianarysearch;

public class OrderAgnosticSearch {

    public static void main(String[] args) {

        int arr[]={32,30,20,18,15,12,10,8,4,3,1};
        int target = 3;


        System.out.println(findOrderAgnoSticBS(arr,target));

    }

    static int findOrderAgnoSticBS(int arr[],int target){
        int start =0;
        int end = arr.length -1;

        boolean isAsc = arr[start]<arr[end];

        while (start<=end){
            int mid = start + (end - start) /2;

            if (target == arr[mid]){
                return  mid;
            }

            if (isAsc){
                if(target > arr[mid]){
                    start = mid +1;
                }else if(target< arr[mid]){
                    return mid - 1 ;
                }
            }else {
                if (target > arr[mid]){
                        end = mid -1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }

        }
        return  -1;
    }



}
