class Solution {
    public String convert(String s, int numRows) {
        int cyclelen = 2*numRows -2;

        if(s.length() <= numRows || numRows == 1)
            return s;

            StringBuilder result = new StringBuilder();

        for(int row = 0; row < numRows; row++){
            for(int j = row; j < s.length(); j += cyclelen){
                result.append(s.charAt(j));

                int secondCharIndex = j + cyclelen - 2*row;
                if(row !=0 && row != numRows - 1 && secondCharIndex < s.length()){
                    result.append(s.charAt(secondCharIndex));
                }

            }
        }
            return result.toString();
        
    }
}