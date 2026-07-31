class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        int j =0, res =0, maxF =0;

        for(int i = 0; i<s.length(); i++){

                charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1  );

                maxF = Math.max(maxF, charMap.get(s.charAt(i)));

                while((i-j +1) - maxF > k){
                    charMap.put(s.charAt(j), charMap.get(s.charAt(j)) -1);
                    j++;
                }
            res = Math.max(res, i-j +1);

        }

        return res;





        




    }
}
