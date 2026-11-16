class Solution {
    public int minEatingSpeed(int[] piles, int h) {


  int l =0;
  int r = Arrays.stream(piles).max().getAsInt();


  int res =r;


  while(l<=r){

    int m = (r+l)/2;
    long totalHours = 0;

    for(int p : piles){

     totalHours +=Math.ceil((double)p/m);
    }


    if(totalHours<=h){
        res = m;
        r = m-1;
        
    }else {
        l=m+1;

    }


  }

  return res;
        
    }
}
