package cyclesort;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={4,0,2,1};

        System.out.println(findMissingNumber(arr));

    }


    static int findMissingNumber(int arr[]){
        int i =0;


        while (i<arr.length){

            int currentIndex = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[currentIndex] ){
                int temp = arr[i];
                arr[i]=arr[currentIndex];
                arr[currentIndex]=temp;
            }else {
                i++;
            }

        }
        for (int index =0;index< arr.length;index++){

            if (arr[index] !=index){
                return index;
            }

        }
        return arr.length;

    }

}
