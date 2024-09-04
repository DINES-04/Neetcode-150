import java.util.HashMap;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                return true;
            } else {
                hm.put(num, 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr1 = {1, 2, 3, 4}; 
        int[] arr2 = {1, 2, 3, 2};         
        System.out.println(solution.hasDuplicate(arr1)); 
        System.out.println(solution.hasDuplicate(arr2));
    }
}
