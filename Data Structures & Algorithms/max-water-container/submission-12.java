class Solution {
    public int maxArea(int[] heights) {
     int maxArea=0;
     int left=0;
     int right=heights.length-1;
     while(left<right){
        int h=Math.min(heights[left],heights[right]);
        int b=right-left;
        int area=h*b;
        if(heights[left]<heights[right]){
            left++;
        }
        else{
            right--;
        }
        maxArea=Math.max(maxArea,area);
     }
     return maxArea;
    }
}
