public static int minSplit(int amount) {
		int coinsArr[] = {1, 5, 10, 20, 50};
		int res[] = new int[amount+1];
		return helper(coinsArr, amount, res);
	}
	
	private static int helper(int arr[], int amount, int res[]) {
		if(amount == 0) {
			return 0;
		}
		if(amount < 0) {
			return -1;
		}
		if(res[amount] != 0) {
			return res[amount];
		}
		int minCount = Integer.MAX_VALUE;
		for(int i : arr) {
			if(helper(arr, amount-i, res) >= 0) {
				minCount = Integer.min(minCount, helper(arr, amount-i, res) + 1);
			}
		}
		if(minCount != Integer.MAX_VALUE) {
			res[amount] = minCount;
		} else {
			res[amount] = -1;
		}
		return res[amount];
	}
