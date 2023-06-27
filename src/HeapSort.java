public class HeapSort implements ISortingStrategy{
    private static void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //    it is a bubble down approach
    public static void heapify(int[]nums, int n, int start) {
        int largerIdx = start;
        while(start<n) {
            int leftIdx = 2 * start + 1;
            int rightIdx = 2 * start + 2;
            if (leftIdx < n && nums[leftIdx] > nums[largerIdx]) {
                largerIdx = leftIdx;
            }
            if (rightIdx < n && nums[rightIdx] > nums[largerIdx]) {
                largerIdx = rightIdx;
            }
            if (largerIdx == start) {
                return;
            }
            swap(nums, start, largerIdx);
            start = largerIdx;
        }
    }
    public static void buildHeap(int nums[], int n){
        int nonLeaf = (int) Math.floor((n/2)-1);
        for(int i = nonLeaf; i>=0; i--){
            heapify(nums, n , i);
        }
    }
    public static void heapDelete(int nums[], int n){
        swap(nums, 0, n-1);
        heapify(nums, n-1, 0);
    }
    @Override
    public int[] sort(int[]nums) {
        System.out.println("This is heap sort");
        int n = nums.length;
        buildHeap(nums, n); // --> O(n)
        for(int i = n; i > 0; i--){
            heapDelete(nums,i); // --> O(logn)
        }
        return nums;
    }
}
