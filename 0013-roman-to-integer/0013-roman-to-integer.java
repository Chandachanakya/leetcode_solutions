class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> d = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        int ans = 0;
        for(int i = 0; i + 1 < s.length(); ++i) {
            if (d.get(s.charAt(i)) < d.get(s.charAt(i+1)))
                ans -= d.get(s.charAt(i));
            else
                ans += d.get(s.charAt(i));
        }
        return ans + d.get(s.charAt(s.length()-1));
    }
}
