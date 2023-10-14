public class BinarySearch {

	public static int binarySearch(int[] arr, int item) {
		int low = 0, high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			int guess = arr[mid];
			if (guess == item) {
				return mid;
			} else if (guess > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 7, 10, 19 };
		System.out.println(binarySearch(arr, 1));
	}
}
