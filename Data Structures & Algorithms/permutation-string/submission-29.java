class Solution {
    public boolean checkInclusion(String s1, String s2) {
    if(s1.length()>s2.length()) return false;
    int [] windowCount= new int[26];
    int [] s2Count=new int[26];
    int windowSize=s1.length();
    for(char ch:s1.toCharArray()){
        windowCount[ch-'a']++;
    }
    for(int i=0;i<s2.length();i++){
        char ch=s2.charAt(i);
        s2Count[ch-'a']++;
        if(i>=windowSize){
            s2Count[s2.charAt(i-windowSize)-'a']--;
        }
        if(match(windowCount,s2Count)){
            return true;
        }
    }
     return false;
    }
    private boolean match(int[] windowCount,int[] s2Count){
        for(int i=0;i<26;i++){
            if(windowCount[i]!=s2Count[i]) return false;
        }
        return true;
    }
}
