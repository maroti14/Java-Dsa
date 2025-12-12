package practics;

public class ArrayDuplicate {

    public static void main(String[] args) {
        int arr[] = {2,3,1,2,3};

        System.out.println(findDuplicateNumber(arr));
    }


    static int findDuplicateNumber (int arr[]){
        int target ;
//        int ans = {};

        for (int i = 0 ;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                target = arr[i];

                if (target == arr[j]){
//                    target;
                }
            }
        }
        return  -1;

    }

}
