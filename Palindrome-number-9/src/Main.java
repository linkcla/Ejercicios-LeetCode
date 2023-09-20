class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder inverted = new StringBuilder(number);
        inverted.reverse();
        return (number.contentEquals(inverted));
    }
}