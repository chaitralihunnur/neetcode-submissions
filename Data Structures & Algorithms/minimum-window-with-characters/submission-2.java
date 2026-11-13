class Solution {
    public String minWindow(String s, String t) {


  int m = t.length();
  int n = s.length();

  int l =0, r =0 , c =0, start = -1;
  int minL = Integer.MAX_VALUE;

  HashMap<Character, Integer> count = new HashMap<>();


  for(char ch : t.toCharArray()){
        count.put(ch, count.getOrDefault(ch,0) + 1);
  }


  while(r<n){

    if(count.containsKey(s.charAt(r))){
        if(count.get(s.charAt(r))>0){
            c++;
        }
    }

    count.put(s.charAt(r),count.getOrDefault(s.charAt(r), 0) - 1);

    while(c == m){

        if(r-l + 1 < minL){
            minL= r-l+1;
            start = l;
        }


        count.put(s.charAt(l), count.getOrDefault(s.charAt(l), 0)+1);


        if(count.containsKey(s.charAt(l))){
            if(count.get(s.charAt(l))>0){
                c--;
            }
        }

        l++;


    }


    r++;
  }


return start == -1? "" : s.substring(start, start+minL);
    }
}
