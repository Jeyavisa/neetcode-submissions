class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dup=new HashSet<>();
        for(int con:nums){
            if(dup.contains(con)){
                return true;
            }
            dup.add(con);
        }
        return false;
        
        
    }
}