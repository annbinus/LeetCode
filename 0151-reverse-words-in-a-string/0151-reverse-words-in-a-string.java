class Solution {
    public String reverseWords(String s) {
    int i = 0, j = s.length()-1;
    while(i<=j && s.charAt(i) == ' ') i++;
    while(i<=j && s.charAt(j) == ' ') j--;
    s = s.substring(i, j+1);

    String []words = s.split("\\s+");

    StringBuilder res = new StringBuilder();

    for(int k = words.length-1; k>0; k--){
        res.append(words[k]).append(" ");
    }
    return res.append(words[0]).toString();

        
    }
}