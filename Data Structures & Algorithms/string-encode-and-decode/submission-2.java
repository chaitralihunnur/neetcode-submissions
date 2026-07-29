class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()){
            return null;
        }

        ArrayList<Integer> sizes = new ArrayList<>();



        for(String str : strs){
            sizes.add(str.length());
        }

        StringBuilder sb = new StringBuilder();

        for(int n : sizes){

            sb.append(n).append(',');
        }
        sb.append('#');

        for(String str : strs){
            sb.append(str);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {

       
        if (str == null || str.isEmpty()) {
        return new ArrayList<>();
    }
        ArrayList<String> ls = new ArrayList<>();

       ArrayList<Integer> sizes = new ArrayList<>();

       int i =0;

       while(str.charAt(i) != '#'){

        StringBuilder cur = new StringBuilder();

        while(str.charAt(i) != ','){
            cur.append(str.charAt(i));
            i++;
        }

        sizes.add(Integer.parseInt(cur.toString()));
        i++;

       }

       i++;

       for(int size : sizes){
        ls.add(str.substring(i, i+size));
        i+=size;
       }

return ls;
       








    }
}
