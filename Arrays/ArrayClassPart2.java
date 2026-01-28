package great;

public class ArrayClassPart2 {

	public static void main(String[] args) {
//		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
//		maxDifference(arr);
//		int[] arr2 = { 7, 9, 5, 6, 3, 2 };
//		maxDifference(arr2);
//		int[] arr3 = { 10, 20, 30 };
//		maxDifference(arr3);
//		int[] arr4 = { 30, 10, 8, 2 };
//		maxDifference(arr4);
//		
//		int[] arr5= {10,25,25,25,30};
//		frequencyInSortedArray(arr5);

		int[] arr6 = { 1, 5, 3, 8, 12 };
		maxProfitInChart(arr6);
		int[] arr7 = { 30, 20, 10 };
		maxProfitInChart(arr7);
		int[] arr8 = { 10, 20, 30 };
		maxProfitInChart(arr8);
		
		int[] arr9= {1,5,3,1,2,8};
		maxProfitInChart(arr9);

	}
//	78. Trapping Rain Water
	public static void rainWaterHold(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n-1;i++) {
			int leftMax=arr[i];
			for(int j=0;j<i;j++) {
				int 
			}
		}
	}

//	76. Stock Buy and Sell Problem (Part 1)
	public static void maxProfitInChart(int[] arr) {
		int profit = 0;
		int initialBuy = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > initialBuy) {
				profit = profit + (arr[i] - initialBuy);
				initialBuy = arr[i];
			} else {
				initialBuy = arr[i];

			}
		}
		System.out.println("The max Profit is " + profit);
	}

//	74. Maximum Difference Problem with Order i and j are two index and i<j

	public static void maxDifference(int[] arr) {
		int iMin = arr[0];
		int maxDiff = 0;
		for (int i = 1; i < arr.length; i++) {

			maxDiff = max(arr[i] - iMin, maxDiff);
			if (iMin > arr[i]) {
				iMin = arr[i];
			}
		}
		System.out.println("The Max diff is " + maxDiff);

	}

	private static int max(int i, int maxDiff) {
		if (i > maxDiff) {
			return i;
		} else {
			return maxDiff;
		}
	}

//	75. Frequencies in a Sorted Array
	private static void frequencyInSortedArray(int[] arr) {
		int freq = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == arr[i - 1]) {
				freq++;
			} else {
				System.out.println("Frequency for the following element " + arr[i - 1] + " is " + freq);
				freq = 1;
			}
		}
		System.out.println("Frequency for the following element " + arr[arr.length - 1] + " is " + freq);

	}

//
//	77. Stock Buy and Sell problem (Part 2)

//


//	
//	79. Maximum consecutive 1s

//	
//	80. Maximum subarray sum

//	
//	81. Longest Even Odd Subarray

//
//	82. Maximum Circular Sum Subarray

//	
//	83. Majority Element

//
//	84. Minimum Consecutive Flips

//	
//	85. Sliding Window Technique

//
//	86. Subarray with Given Sum

//
//	87. Prefix Sum

//
//	88. Equilibrium Point

//	
//	89. Maximum Appearing Element

}
