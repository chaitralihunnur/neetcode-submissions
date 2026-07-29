class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer,Set<Character>> rows = new HashMap<>();

        Map<Integer,Set<Character>> cols = new HashMap<>();

        Map<String,Set<Character>> squares = new HashMap<>();

        for(int r = 0; r < 9; r++){
            for(int c = 0; c<9 ; c++){

                if (board[r][c] == '.') {
                    continue;
                }

                String squareKey = (r/3) + "," + (c/3);

                

                if(!rows.containsKey(r)){
                    HashSet<Character> k = new HashSet<>();
                    rows.put(r,k);

                }

                if(rows.get(r).contains(board[r][c]))
                return false;


                if(!cols.containsKey(c)){
                    HashSet<Character> k = new HashSet<>();
                    cols.put(c,k);

                }

                if(cols.get(c).contains(board[r][c]))
                return false;

                if(!squares.containsKey(squareKey)){
                    HashSet<Character> k = new HashSet<>();
                    squares.put(squareKey, k);

                }

                if(squares.get(squareKey).contains(board[r][c]))
                return false;


                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(squareKey).add(board[r][c]);

            }
        }





      return true;




        
    }
}
