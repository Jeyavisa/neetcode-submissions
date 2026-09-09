class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0 , res=0 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res=Math.max(count,res);
                
                count=0;

           } else{
            count++;
            }
            
        }
        return Math.max(res,count);
        
        
        
    }
}