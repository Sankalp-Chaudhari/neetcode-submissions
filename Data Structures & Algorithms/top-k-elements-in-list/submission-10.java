class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        Map <Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> li=new ArrayList<>(map.entrySet());
        Collections.sort(li,(a,b)->b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            res[i]=li.get(i).getKey();
        }
        return res;
    }
}
