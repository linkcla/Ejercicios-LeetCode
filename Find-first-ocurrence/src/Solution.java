class Solution {
    public static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {
            if((haystack.charAt(i) == needle.charAt(0)) &
                (i+ needle.length()-1 < haystack.length())){
                String aux = haystack.substring(i, i + needle.length());
                if(aux.equals(needle)){
                    return i;
                }
            }

        }
        return -1;
    }
}