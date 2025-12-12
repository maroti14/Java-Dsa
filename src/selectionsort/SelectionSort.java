package selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[]={5,3,4,1,2};
//        selectionSort(arr);
        insertationSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertationSort(int arr[]){
        for (int i =0;i<arr.length -1;i++){
            for (int j = i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    static void selectionSort(int arr[]){
        for (int i =0;i<arr.length;i++){
            int lastIndex = arr.length - i - 1;
            int MaxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,MaxIndex,lastIndex);

        }
    }

    static int getMaxIndex(int arr[],int start,int lastIndex){
        int max = start;
        for (int j =start;j<=lastIndex;j++){
            if (arr[max]<arr[j]){
                max = j;
            }
        }
        return  max;
    }

    static void swap(int arr[], int first, int last){

        int temp= arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

}
