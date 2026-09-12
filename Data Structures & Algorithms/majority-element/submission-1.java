class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            Integer count = map.get(num); 

            if (count == null) {
                map.put(num, 1); 
                count = 1;
            } else {
                count = count + 1;
                map.put(num, count); 
            }

            if (count > n / 2) {
                return num;
            }
        }

        return -1;
    

        
    }
}