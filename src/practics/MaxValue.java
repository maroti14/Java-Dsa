package practics;

public class MaxValue {

    public static void main(String[] args) {
    int arr[] = {-4,-3,-45 -9};
        System.out.println(findMAx(arr));
    }

    static int findMAx(int arr[]){
        int maxVal = arr[0];

        for (int i =0;i<arr.length;i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
