import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        if (lens != lent) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < lens; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < lent; i++) {
            if (hm.containsKey(t.charAt(i))) {
                hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);
                if (hm.get(t.charAt(i)) == 0) {
                    hm.remove(t.charAt(i));
                }
            } else {
                return false;
            }
        }

        return hm.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Are \"" + s1 + "\" and \"" + t1 + "\" anagrams? " + solution.isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Are \"" + s2 + "\" and \"" + t2 + "\" anagrams? " + solution.isAnagram(s2, t2));
    }
}
