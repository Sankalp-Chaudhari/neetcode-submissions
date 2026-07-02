class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int windowSize=s1.length();
        int []s1Count= new int[26];
        int []windowCount=new int [26];
        for(char c:s1.toCharArray()){
            s1Count[c-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            windowCount[s2.charAt(i)-'a']++;
            if(i>=windowSize){
                windowCount[s2.charAt(i-windowSize)-'a']--;
            }
            if(match(windowCount,s1Count)){
                return true;
            }
        }
        return false;
    }
    public boolean match(int[] windowCount,int[] s1Count){
        for(int i=0;i<26;i++){
            if(windowCount[i]!=s1Count[i]) return false;
        }
        return true;
    }
}
