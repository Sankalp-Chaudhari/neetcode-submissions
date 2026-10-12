class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int n= temperatures.length;
      Stack<Integer> stack=new Stack<>();
      int[] res=new int[n];
      for(int i=0;i<n;i++){
        while(!stack.isEmpty() &&
         temperatures[stack.peek()]<temperatures[i]){
          int prev=stack.pop();
          res[prev]=i-prev;
         }
        stack.push(i);
      }
      return res;
    }
}
