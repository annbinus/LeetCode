class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int i = 0;
        int length = 0;

        while(i < words.length){
            if((words[i].length() + line.size() + length) > maxWidth)
            {
                int spaces = maxWidth - length;
                int extraspaces = spaces/Math.max(1, line.size()-1);
                int rem = spaces % Math.max(1, line.size()-1);

                for(int j =0; j < Math.max(1, line.size()-1); j++){
                    line.set(j, line.get(j) + " ".repeat(extraspaces));
                    if(rem>0){
                        line.set(j, line.get(j) + " ");
                        rem--;
                    }
                }
                res.add(String.join("", line));
                
                line.clear();
                length = 0;
                
            }
            line.add(words[i]);
            length += words[i].length();
            i++;
        }
        res.add(String.join(" ", line) + " ".repeat(maxWidth - length - line.size() + 1));
        return res;
    }
}