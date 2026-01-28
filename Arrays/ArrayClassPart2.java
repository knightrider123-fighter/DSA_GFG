package arraySection;

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

		int[] arr9 = { 1, 5, 3, 1, 2, 8 };
		maxProfitInChart(arr9);

		int[] arr10 = { 2, 0, 2 };
		rainWaterHold(arr10);
		rainWaterHold2(arr10);

		int arr11[] = { 5, 0, 6, 2, 3 };
		rainWaterHold2(arr11);

		int arr12[] = { 0, 0, 0 };
		maxConsecutiveOnes(arr12);
		
		int[] arr13= {2,3,-8,7,-1,2,3};
		maxSubarrySum(arr13);
		
		int[] arr14= {-6,-1,-8};
		maxSubarrySum(arr14);
		maxSubarrySum2(arr13);

	}
	
//	80. Maximum subarray sum
	public static void maxSubarrySum2(int[] arr) {
		int res=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++) {
			int sum=arr[i]+res;
			if(res<=sum) {
				res=sum;
				count++;
			}else {
				res=res-arr[i-count-1];
				count=0;
			}
		}
		System.out.println("Max Result is "+res);
	}

//	80. Maximum subarray sum
	public static void maxSubarrySum(int[] arr) {
		int res=-1321312;
		
		for(int i=0;i<arr.length;i++) {
			int tempRes=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				tempRes=tempRes+arr[j];
				res=max(res,tempRes);
			}
			
			tempRes=0;
		}
		System.out.println("Max Result is "+res);
	}

//	79. Maximum consecutive 1s
	public static void maxConsecutiveOnes(int arr[]) {
		int res = 0;
		int tempRes = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				tempRes++;
			} else {
				res = max(res, tempRes);
				tempRes = 0;
			}
		}
		System.out.println("Max ConsecutiveOnes is " + res);
	}

//	78. Trapping Rain Water
	public static void rainWaterHold2(int[] arr) {
		int n = arr.length;
		int[] arrRightMax = new int[n];
		int[] arrLeftMax = new int[n];
		arrLeftMax[0] = arr[0];

		for (int i = 1; i < n; i++) {
			arrLeftMax[i] = max(arr[i], arrLeftMax[i - 1]);
		}

		arrRightMax[n - 1] = arr[n - 1];
		for (int i = n - 2; i > 0; i--) {
			arrRightMax[i] = max(arr[i], arrRightMax[i + 1]);
		}
		int maxWater = 0;
		for (int i = 1; i < n - 1; i++) {
			maxWater = maxWater + (min(arrRightMax[i], arrLeftMax[i]) - arr[i]);
		}
		System.out.println(maxWater);

	}

//	78. Trapping Rain Water
	public static void rainWaterHold(int[] arr) {
		int n = arr.length;
		int maxWater = 0;
		for (int i = 1; i < n - 1; i++) {
			int leftMax = arr[i];
			for (int j = 0; j < i; j++) {
				if (arr[j] > leftMax) {
					leftMax = arr[j];
				}

			}

			int rightMax = arr[i];
			for (int k = i + 1; k < n; k++) {
				if (arr[k] > rightMax) {
					rightMax = arr[k];
				}
			}
			maxWater = maxWater + (min(leftMax, rightMax) - arr[i]);
		}

		System.out.println("The max water it can hold " + (maxWater > 0 ? maxWater : 0));
		System.out.println(maxWater);

	}

	private static int min(int leftMax, int rightMax) {
		if (leftMax > rightMax) {
			return rightMax;
		} else {
			return leftMax;
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

//	

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
