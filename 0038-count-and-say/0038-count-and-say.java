class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        
        String prev = countAndSay(n-1);
        
        int count = 0;
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < prev.length(); i++){
            count++;
            if(i==prev.length()-1 || prev.charAt(i)!=prev.charAt(i+1))
            {
                res.append(count).append(prev.charAt(i));
                count=0;
            }
        }
        
        
        return res.toString();
    }
}