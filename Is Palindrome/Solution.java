class Solution {
    public boolean isPalindrome(String s) {
        String alphanum = s.replaceAll("[^a-zA-Z0-9]", "");
        // otherwise to find aplhanumeric
        /*String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                char temp=s.charAt(i);
                str=str+Character.toLowerCase(temp);
            }
        }*/
        String lan = alphanum.toLowerCase();
        int i=0;
        int j=lan.length()-1;
        while(i<j){
            if(lan.charAt(i)!=lan.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
     public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
    }
}
