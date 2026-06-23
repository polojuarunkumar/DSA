class SearchIndexPosition{
  static int searchIndexPosition(int []ar,int target){
    int low=0;
    int high=ar.length-1;
    while(low<=high){
      int mid=low+(high-low)/2;
      if(target==ar[mid]){
        return mid;
      }
      else if(target<ar[mid]){
        high=mid-1;
      }
      else{
        low=mid+1;
      }
    }
    return low;
  }
}
