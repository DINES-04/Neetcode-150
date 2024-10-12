class Solution{
  
    	public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                i++;
            }
            
        }
        return null;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = s.twoSum(numbers, target);
        
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
