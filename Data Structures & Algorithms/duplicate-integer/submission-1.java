class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int left=0;
        // int right=nums[nums.length-1];
        // // for(int i=0;i<nums.length;i++){
        // //     if(nums[i]==nums[i+1]){
        // //         return true;
        // //     }
        // // }
        // while(left < right){
            
        //     if(nums[left]==nums[right]){
        //         return true;
        //     }else if(!)
        // }
        // return false;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}