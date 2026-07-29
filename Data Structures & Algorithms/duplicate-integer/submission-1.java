class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> numsSet = new HashSet<>();

        Boolean flag = false;

        for(int i =0; i<nums.length; i++){
            if(numsSet.contains(nums[i])){
                return true;
            }else{
                numsSet.add(nums[i]);
            }
        }
            return flag;
        
    }
}