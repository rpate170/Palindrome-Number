class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if (s.equals(sb.reverse().toString())) {
            return true;
        }
        else {
            return false;
        }
    }
}