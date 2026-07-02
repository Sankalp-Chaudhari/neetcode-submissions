class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] windowCount=new int[26];
        int [] s2Count=new int[26];
        int windowSize=s1.length();
        for( char ch:s1.toCharArray()){
            windowCount[ch-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            s2Count[s2.charAt(i)-'a']++;
            if(i>=windowSize){
                s2Count[s2.charAt(i-windowSize)-'a']--;
            }
            if(match(s2Count,windowCount)){
                return true;
            }
        }
        return false;
    }
    private boolean match(int[] s2Count,int[] windowSize){
        for(int i=0;i<26;i++){
            if(s2Count[i]!=windowSize[i]){
                return false;
            }
        }
        return true;
    }
}
