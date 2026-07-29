class Solution {
    public int[] productExceptSelf(int[] nums) {



int[] arr = new int[nums.length];
     /*   for(int num : nums){
            
            product *= num;
        }


        for(int i=0; i<nums.length; i++){

            if(nums[i]!=0){
            arr[i] = product/nums[i];
            }else{
                arr[i]=product;
            }

        }

        return arr;*/

        

        for(int i=0; i<nums.length; i++){

            int product = 1;

            for(int j =0; j< nums.length; j++){
                if(i == j){
                    arr[i] = nums[i];
                }else{
                    product *= nums[j];
                }
            }

            arr[i] = product;           

        }

        return arr;
    }
}  
