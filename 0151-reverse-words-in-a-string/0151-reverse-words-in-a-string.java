class Solution {
    public String reverseWords(String s) {
    
    String []words = s.trim().split("\\s+");

    StringBuilder res = new StringBuilder();

    for(int k = words.length-1; k>0; k--){
        res.append(words[k]).append(" ");
    }
    return res.append(words[0]).toString();

        
    }
}