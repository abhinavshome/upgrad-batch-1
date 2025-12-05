import java.util.Stack;

public class BalancedParanthesis {

    public static boolean isAMatch(char c1, char c2) {
        if(c1 == '[' && c2 == ']')  return true;
        if(c1 == '{' && c2 == '}')  return true;
        if(c1 == '(' && c2 == ')')  return true;
        return false;
    }

    public static boolean areParanthesisBalanced(String expression) {
        Stack<Character> symbols = new Stack<Character>();
        char[] chars = expression.toCharArray();

        for(char c: chars) {
            if(c == '[' || c == '{' || c == '(') {
                symbols.push(c);
            } else if(c == ']' || c == '}' || c == ')') {
                if(isAMatch(symbols.getLast(), c)) {
                    symbols.pop();
                } else {
                    return false;
                }
            }
            // System.out.println(c);
            // System.out.println(symbols);
        }

        if(!symbols.isEmpty()) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(areParanthesisBalanced("[(a+b) - {c*d}"));
        System.out.println(areParanthesisBalanced("[(a+b) - {c*d}]"));
    }
}
