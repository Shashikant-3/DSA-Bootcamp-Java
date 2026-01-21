public class keyIninfinite{
  public statis void main(String[] args){
    int[] arr = [2,4,6,8,12,14,16,17,19,20,21]; //Infinite length array.
    int target = findIdx(arr,target);
  }
  private int findIdx(int [] arr, int target){
    long start =0;
    long end = 1;

    while(target>arr[end]){
      //will search elements in chunk array (from 0-1,2-4, 5-8....and so on ...doublt the chunk size )
      int newStart = end+1;
      int end = end + (end-start+1)*2;
      start = newStart;
    }
    //after finding the chunk where element might be
    return binarySearch(arr, start, end, target);
  } 
  private int binarySearch(int arr, int start, int end, int target){
    while(start<=end){
      int mid = (start+end)>>>1;
      if(arr[mid]==target) return mid;
      else if(arr[mid]>target){
        end = mid-1;
      }
      else{
        start = mid+1;
      }
    }
    return -1;
}
