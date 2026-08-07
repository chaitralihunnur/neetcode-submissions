class Solution {
    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();
        int result =0;

        for(String token : tokens){
            if(isOperator(token)){

                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());

                if(token.equals("+")){
                    result = num1 + num2;
                }else if(token.equals("-")){
                    result = num1- num2;
                }else if(token.equals("*")){
                    result = num1 * num2;
                }else if(token.equals("/")){
                    result = num1/num2;
                }
                stack.push(String.valueOf(result));

            }
        else{
            stack.push(String.valueOf(token));
        }


        

        
    
        }

        return Integer.parseInt(stack.pop());
    }


   public boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*");
    }




}
