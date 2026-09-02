class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        //frequency array
        //multiple nums can have same frequency occurance, so ArrayList
        List<Integer>[] frequency = new List[nums.length+1];
        for(int i=0;i<frequency.length;i++){
            frequency[i]=new ArrayList<Integer>();
        }
        
        //num and frequency mapping
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        //value is placed for its frequency occurances iindex
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            frequency[entry.getValue()].add(entry.getKey());
        }
        
        
        int[] res=new int[k];
        int index=0;
        //validate from the higher frequency occurance index to lower frequency occurance
        //iterate only till k indices
        for(int i=frequency.length-1;i > 0 && index < k;i--){
            
            for(int val:frequency[i]){
                res[index++]=val;
                
                //return as soon as index reaches k size
                if(index==k){
                    return res;
                }
            }
            
        }
        return res;
    }
}
