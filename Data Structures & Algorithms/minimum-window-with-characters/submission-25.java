class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int req=t.length();
        int start=0;
        int left=0;
        int minLen=Integer.MAX_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                req--;
                }
                map.put(ch,map.get(ch)-1);
            }
            while(req==0){
                if(minLen>right-left+1){
                    minLen=right-left+1;
                    start=left;
                }
                char leftChar=s.charAt(left);
                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);
                    if(map.get(leftChar)>0){
                        req++;
                    }
                }
                left++;
            }

        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}
