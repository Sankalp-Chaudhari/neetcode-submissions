class Solution {
    public boolean isValid(String s) {
      Map<Character, Character> map=new HashMap<>();
      Stack<Character> stack=new Stack<>();
      map.put(')','(');
      map.put(']','[');
      map.put('}','{');
      for(char ch:s.toCharArray()){
        if(!map.containsKey(ch)){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()||stack.pop()!=map.get(ch)){
                return false;
            }
        }
      }
      return stack.isEmpty();
    }
}
