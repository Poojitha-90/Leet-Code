class MinimumRemovetovalidparenthesis  {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();

        // First pass: mark unmatched parentheses
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(i);
            } else if (arr[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // matched with an earlier '('
                } else {
                    arr[i] = '*'; // mark unmatched ')'
                }
            }
        }

        // Any remaining indices in stack are unmatched '('
        while (!stack.isEmpty()) {
            arr[stack.pop()] = '*';
        }

        // Build the final result by skipping marked characters
        StringBuilder result = new StringBuilder();
        for (char c : arr) {
            if (c != '*') {
                result.append(c);
            }
        }

        return result.toString();
    }
}
