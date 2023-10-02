import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                op.push(c);
                continue;
            } else if (op.isEmpty()) {
                return false;
            }
            if (!op.isEmpty()) {
                switch (c) {
                    case ')':
                        if ('(' != op.peek()) return false;
                        break;
                    case '}':
                        if ('{' != op.peek()) return false;
                        break;
                    case ']':
                        if ('[' != op.peek()) return false;
                        break;
                }
                op.pop();
            }
        }
        return op.isEmpty();
    }
}