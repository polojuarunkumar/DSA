class FirstLastIndex{
  public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int res[]={-1,-1};

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                res[0]=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                res[1]=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int ar[]={2,4,5,5,5,5,5,7};
        System.out.println(Arrays.toString(firstLastIndex(ar,5)));
      
    }
}
