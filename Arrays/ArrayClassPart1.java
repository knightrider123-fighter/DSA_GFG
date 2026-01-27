

public class ArrayClassPart1 {

	public static void main(String[] args) {
		int arr[] = new int[6];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 8;
		arr[3] = 12;

		int arr2[] = new int[6];
		arr2[0] = 2;
		arr2[1] = 03;
		arr2[2] = 03;
		arr2[3] = 4;
		arr2[4] = 4;
		arr2[5] = 5;

		int arr3[] = new int[6];
		arr3[0] = 2;
		arr3[1] = 4;
		arr3[2] = 4;
		arr3[3] = 12;
		arr3[4] = 13;
		arr3[5] = 15;

		int arr4[] = new int[6];
		arr4[0] = 2;
		arr4[1] = 0;
		arr4[2] = 0;
		arr4[3] = 12;
		arr4[4] = 13;
		arr4[5] = 15;

		leftRotateByOne(arr4);
		int arr5[] = { 7, 10, 4, 3, 6, 5, 2 };
		leaderInArray(arr5);

	}

//	73. Leaders in an Array problem
	private static void leaderInArray(int[] arr) {
		System.out.print(" " + arr[arr.length - 1]);
		int currentLeader = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > currentLeader) {
				System.out.print(" " + arr[i]);
				currentLeader = arr[i];
			}
		}
	}

//	71. Left Rotate an Array by One
	private static void leftRotateByOne(int[] arr) {
		printArray(arr);
		int firstElement = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = firstElement;
		printArray(arr);
	}

//	70. Move Zeros to End
	private static void moveZeroAtLast(int[] arr) {
		printArray(arr);

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		printArray(arr);

	}

//	69. Remove duplicates from a sorted array
	private static void removeDuplicateFromSortedArray(int[] arr) {
		printArray(arr);
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[count - 1]) {
				arr[count] = arr[i];
				count++;
			}
		}
		printArray(arr);

	}

//	68. Reverse an Array
	private static void reverseAnArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		printArray(arr);

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		printArray(arr);

	}

//	66. Second Largest Element in Array
	private static int secondLargestElement(int[] arr) {
		int largestIndex = largestElementInArray(arr);
		int res = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[largestIndex]) {
				if (res == -1) {
					res = i;
				} else {
					if (arr[res] < arr[i]) {
						res = i;
					}
				}
			}
		}
		return res;
	}

//	67. Check if an Array is Sorted
	private static boolean arrIsSortedOrNot(int[] arr) {
		boolean res = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

//	65. Largest Element in an Array
	private static int largestElementInArray(int[] arr) {
		int n = arr.length;
		int res = 0;
		for (int i = 1; i < n; i++) {
			if (arr[res] < arr[i]) {
				res = i;
			}
		}
		return res;
	}

	public static void deleteAtPosition(int[] arr, int position, int size) {
		printArray(arr);
		for (int i = position; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		printArray(arr);
	}

	public static void insertAtPosition(int arr[], int position, int element, int currentSize) {

		printArray(arr);
		if (position <= 0 || position > arr.length) {
			System.out.println("Return invalid input");
			return;
		}
		for (int i = currentSize; i >= position; i--) {
			arr[i] = arr[i - 1];
		}
		arr[position - 1] = element;
		printArray(arr);
	}

	// Supporting function
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("====");
	}


}
