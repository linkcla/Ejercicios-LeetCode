class Solution {
    public static int lengthOfLastWord(String s) {
        int cont = 0;
        int slastw = 0;
        boolean firstspace = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                cont++;
                firstspace = false;
            }
            if ((s.charAt(i) == ' ') && (!firstspace)){
                firstspace = true;
                slastw = cont;
                cont = 0;
            }

        }
        if (s.charAt(s.length()-1) != ' ') return cont;
        else return slastw;
    }
}
