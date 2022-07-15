public static int notContains(int[] arr) {
		Arrays.sort(arr);
		int i = 0, j = i+1;
		while(j < arr.length) {
			if(arr[i] >= 0 && arr[j] - arr[i] > 1) {
				return arr[i] + 1;
			}
			i++;
      j++;
    }
  return -1;
}
