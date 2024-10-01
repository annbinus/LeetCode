class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> character = new HashMap<>();

        character.put('I', 1);
        character.put('V', 5);
        character.put('X', 10);
        character.put('L', 50);
        character.put('C', 100);
        character.put('D', 500);
        character.put('M', 1000);

        int sum = 0;

        for(int i = s.length()-1; i>=0; i--){
            if((4 * character.get(s.charAt(i)) < sum)){
                sum -= character.get(s.charAt(i));
            }
            else{
                sum +=character.get(s.charAt(i));
            }
        }
        return sum;
    }
}