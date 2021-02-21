package study.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> parenStack = new Stack<>();

        for (char paren: s.toCharArray()) {
            if (paren == '(' || paren == '[' || paren == '{') {
                parenStack.push(paren);
            } else {
                if (parenStack.isEmpty()) return false;
                char parenPop = parenStack.pop();
                if (paren == ')' && parenPop != '(') return false;
                if (paren == ']' && parenPop != '[') return false;
                if (paren == '}' && parenPop != '{') return false;
            }
        }

        return parenStack.isEmpty();
    }

    public boolean isValidMap(String s) {
        Map<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        Stack<Character> parenStack = new Stack<>();

        for (char paren: s.toCharArray()) {
            if (!mappings.containsKey(paren)) {
                parenStack.push(paren);
            } else {
                char parenPop = parenStack.isEmpty()? '*' : parenStack.pop();
                if (mappings.get(paren) != parenPop) return false;
            }
        }

        return parenStack.isEmpty();
    }
}
