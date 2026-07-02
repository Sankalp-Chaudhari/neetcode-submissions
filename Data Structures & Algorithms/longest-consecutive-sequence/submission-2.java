class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
          s.add(num);
        }
        for(int num:s){
          if(!s.contains(num-1)){
            int count=1;
            int curr=num;
            while(s.contains(curr+1)){
              count++;
              curr++;
            }
            longest=Math.max(count,longest);
          }
        }
        return longest;
    }
}
