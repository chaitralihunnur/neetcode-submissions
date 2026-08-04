class Solution {
    public String minWindow(String s, String t) {


    HashMap<Character,Integer> mapT = new HashMap<>();

    int l=0, r=0, count=0;
    int minL = Integer.MAX_VALUE;
    int n = s.length();
    int m = t.length();
    int start = -1;


    for(char c : t.toCharArray()){
        mapT.put(c,mapT.getOrDefault(c,0) + 1);
    }


    while(r < n){

            if(mapT.containsKey(s.charAt(r))){
                if(mapT.get(s.charAt(r)) > 0){
                    count ++;
                    
                }
            }


            mapT.put(s.charAt(r),mapT.getOrDefault(s.charAt(r),0) - 1);


            while(count == m){
                if (r - l + 1 < minL) {
                    minL = r - l + 1; 
                    start = l; 
                }
            

            mapT.put(s.charAt(l),mapT.getOrDefault(s.charAt(l),0) + 1);

            if(mapT.containsKey(s.charAt(l))){
                if(mapT.get(s.charAt(l))>0){
                    count --;
                }
            }

            l++;

            }

r++;

    }


return start == -1? "" : s.substring(start, start+minL);
        
    }
}
