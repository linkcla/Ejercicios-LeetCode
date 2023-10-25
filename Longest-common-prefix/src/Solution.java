class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sol = new StringBuilder();
        char c;
        for (int i = 0; i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            for (String w: strs) {
                if(w.length() <= i || w.charAt(i) != c) {
                    return sol.toString();
                }
            }
            sol.append(c);
        }
        return sol.toString();
    }
}