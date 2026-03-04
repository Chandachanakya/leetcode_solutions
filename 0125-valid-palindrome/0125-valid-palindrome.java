class Solution {
    public boolean isPalindrome(String s) {
        String org=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(org);
        StringBuilder rev=sb.reverse();
        String res=sb.toString();
        if(res.equals(org)){
            return true;
        }
        return false;
    }
}