public class MergeSort implements ISortingStrategy{
    private static void merge(int[] nums, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = 0;
        int mergedSize = high-low+1;
        int[]merged = new int[mergedSize];
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                merged[k++] = nums[i++];
            }
            else{
                merged[k++] = nums[j++];
            }
        }
        while(i<=mid)
            merged[k++] = nums[i++];
        while(j<=high)
            merged[k++] = nums[j++];
        for (i = 0; i < mergedSize; i++)
            nums[low+i] = merged[i];
    }

    private static void mergeSort(int[]nums, int low, int high){
        if(low<high){
            int mid = (int) Math.floor((low+high)/2);
            mergeSort(nums, low, mid);
            mergeSort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
    }
    @Override
    public int[] sort(int[]nums) {
        System.out.println("This is merge sort");
        int low = 0;
        int high = nums.length - 1;
        mergeSort(nums, low, high);
        return nums;
    }
}
