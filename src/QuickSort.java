public class QuickSort implements ISortingStrategy{

    //    private static boolean allElementsEqual(int[] arr, int low, int high) {
//        if (arr.length == 0) {
//            return true; // empty array is considered to have all elements equal
//        }
//        int firstElement = arr[low];
//        for (int i = low+1; i <= high; i++) {
//            if (arr[i] != firstElement) {
//                return false;
//            }
//        }
//        return true;
//    }
    private static void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static int partition(int[]nums, int low, int high){
        int i = low;
        int j = high;
        int pivot = low;  //pivot index
        while(i<j){
            while(nums[i]<=nums[pivot] && i<high){
                i++;
            }
            while(nums[j]>nums[pivot] && j>=low){
                j--;
            }
            // if j is at left of i we don't do this swap, we have found correct pivot position
            // we do outer swap only
            if(i<j)
                swap(nums, i, j);
        }
        swap(nums, j, pivot);
        return j; // pivot is now located at correct place at j, we return this pivot position
    }

    private static void quickSort(int[]nums, int low, int high){
        // making sure low is always less than high, and array contains at least two elements
        if(low<high) {

            //we can use this to reduce time complexity for worst cases
//            if(allElementsEqual(nums, low, high))
//                return;
            // we get the pivot index from partition function, so we can divide the array into two sub arrays
            // at this position and recursive call the quickSort function
            int pivot = partition(nums, low, high);
            quickSort(nums, low, pivot - 1);
            quickSort(nums, pivot + 1, high);
        }
    }
    @Override
    public int[] sort(int[]nums) {
        System.out.println("This is quick sort");
        int low = 0;
        int high = nums.length - 1;
        quickSort(nums, low, high);
        return nums;
    }
}
