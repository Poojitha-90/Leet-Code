import java.util.*;

class LetterCombinationsinaPhonenumber {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        Map<Character, String> dict = new HashMap<>();
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");

        List<String> res = new ArrayList<>();
        res.add("");  // Start with an empty string

        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            String letters = dict.get(digit);
            for (String s1 : res) {
                for (char s2 : letters.toCharArray()) {
                    temp.add(s1 + s2);  // Combine previous results with current letters
                }
            }
            res = temp;  // Move to next digit
        }

        return res;
    }
}
