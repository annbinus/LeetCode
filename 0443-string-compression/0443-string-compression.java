class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        for(int i = 0; i < chars.length;)
        {
            char c = chars[i];
            int count = 0;
            
            while(i<chars.length && chars[i]==c)
            {
                i++;
                count++;
            }

            chars[ans++] = c;

            if(count>1)
            {
                for(char num : String.valueOf(count).toCharArray())
                    chars[ans++] = num;
                    
            }
            
        }
        return ans;
    }
}