import java.util.*;

class Evaluate rverse Polish notation{
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> op = Arrays.asList("+", "-", "*", "/");

        for (String token : tokens) {
            if (!op.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int res = 0;
                switch (token) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;
                        break;
                }
                stack.push(res);
            }
        }

        return stack.pop();
    }
}
