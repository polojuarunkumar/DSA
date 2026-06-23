class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int rd=0;
        for(int i=1;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                rd++;
            }
            else if(nums[rd]==nums[i]){
                return true;
            }
        }
        return false;
    }
}
