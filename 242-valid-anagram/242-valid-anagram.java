class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] map = new int[123];
        
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            if (map[t.charAt(i)] < 1) {
                return false;
            }
            
            map[t.charAt(i)]--;
        }
        return true;
    }
}