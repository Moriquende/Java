public static int countVariants(int stairsCount) {
  if(stairsCount == 1 || stairsCount == 2){
    return stairsCount;
  }
  int arr[] = new int[stairsCount+1];
  arr[1] = 1;
  arr[2] = 2;
  for(int i = 3; i <= stairsCount; i++){
    arr[i] = arr[i-2] + arr[i-1];
  }
  return arr[stairsCount];
}
