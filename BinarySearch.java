public class BinarySearch {
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
This implementation uses the iterative approach to binary search. The search method takes two arguments - the sorted array arr and the target value target, and returns the index of the target element if it is present in the array, otherwise it returns -1.

In the while loop, we set the left and right indices to the start and end of the array respectively. We then calculate the mid index as the average of left and right. If the element at mid is equal to the target value, we return the mid index. If the element at mid is less than the target value, we update left to mid + 1, since the target



