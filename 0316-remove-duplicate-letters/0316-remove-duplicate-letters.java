class Solution {
    public String removeDuplicateLetters(String s) {
       HashMap<Character, Integer> lastOccurrence = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26]; // Assuming only lowercase letters are in the input

        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!visited[c - 'a']) {
                while (!stack.isEmpty() && stack.peek() > c && lastOccurrence.get(stack.peek()) > i) {
                    visited[stack.pop() - 'a'] = false;
                }

                stack.push(c);
                visited[c - 'a'] = true;
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character character : stack) {
            result.append(character);
        }

        return result.toString();
        
    }
}