class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i:nums)
        if(hs.add(i)){  
         }else{
               return true;
        }
        return false;
    }
}