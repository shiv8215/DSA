class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int l = 0 , max_length = 0;

        for(int r = 0; r < s.length(); r++){
            while(chars.contains(s.charAt(r))){
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            max_length = Math.max(max_length, r-l+1);
        }
    return max_length;
    }
}