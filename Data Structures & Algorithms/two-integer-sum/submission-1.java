class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     int left = 0;
    //     int right = nums.length-1;
        // int[] array=new int[2];
    //     while(left<right){
    //         int sum=nums[left]+nums[right];
    //         if(sum == target){
    //             array[0]=left;
    //             array[1]=right;
    //             return array;   
    //         }else if(sum<target){
    //             left++;
    //         }else{
    //             right--;
    //         }
    //     }
    // return array;

    
    
    HashMap<Integer, Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int difference = target - nums[i];
        
        if(map.containsKey(difference)){
            return new int[]{map.get(difference), i};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
    }
}
