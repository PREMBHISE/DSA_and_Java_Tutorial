public class ArrayIsSorted {
    public static boolean checkIfIncreasing (int arr[], int idx) {
        if(idx == arr.length-1) {
            return true;
        }

        if(!checkIfIncreasing(arr, idx+1)) {
            return false;
        }
        return arr[idx] < arr[idx + 1];
    }
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 6, 3, 4, 5};

        if(checkIfIncreasing(arr1, 0)){
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("Not Strictly Increasing");
        }
        

    }
}