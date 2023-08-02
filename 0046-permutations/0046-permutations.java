class Solution {
    public List<List<Integer>> permute(int[] nums) {
          set = new LinkedHashSet<>();
        result = new ArrayList<List<Integer>>();
        rec(nums);
        return result;
    }
    List<List<Integer>> result ;
    Set<Integer>set ;
    public void rec(int[] nums){
        if(set.size() == nums.length){
            List<Integer> newarr = new ArrayList<>();
            newarr.addAll(set);
            result.add(newarr);
            return ;
        }
        for(int i = 0;i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                rec(nums);
                set.remove(nums[i]);
            }
        }
    }
}