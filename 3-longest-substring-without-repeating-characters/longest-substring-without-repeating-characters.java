class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> container = new HashSet<Character>();

        int left = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if(!container.contains(s.charAt(i)))
            {
                container.add(s.charAt(i));
                max = Math.max(max, i-left+1);

            }
            else {
                while (s.charAt(left)!=s.charAt(i)){
                    container.remove(s.charAt(left));
                    left++;
                }

                container.remove(left);
                left++;
                container.add(s.charAt(i));
            }
        }

        return max;
        
    }
}