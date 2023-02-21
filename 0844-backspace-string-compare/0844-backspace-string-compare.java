class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspaced(s).equals(backspaced(t));
    }

    public String backspaced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            }
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack.toString();
    }
}