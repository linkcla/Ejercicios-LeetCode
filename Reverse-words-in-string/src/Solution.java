class Solution {
    public String reverseWords(String s) {
        StringBuilder sol = new StringBuilder();
        int indexiniword = 0;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == ' '){
               sol.append(new StringBuilder(s.substring(indexiniword, i)).reverse());
               sol.append(' ');
               indexiniword = i +1;
           } else if(i == s.length()-1){
               sol.append(new StringBuilder(s.substring(indexiniword, i+1)).reverse());
           }
        }
        return sol.toString();
    }
}