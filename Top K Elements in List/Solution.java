import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int[] arr = new int[k];
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int index = 0;
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    arr[index++] = num;
                    if (index == k) {
                        return arr;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        
        int[] result = solution.topKFrequent(nums, k);
        
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
}
