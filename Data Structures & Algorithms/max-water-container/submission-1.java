class Solution {
    public int maxArea(int[] heights) {
       int maxA=0;
       int left=0;
       int right= heights.length-1;
       while(left<right){
        int h= Math.min(heights[left],heights[right]) ;
        int w=right-left;
        int area= h*w;
        maxA=Math.max(area,maxA);
        if(heights[left]<heights[right]){
            left++;
        }
        else{
            right--;
        }
       }
       return maxA;
    }
}
