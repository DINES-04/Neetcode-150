import java.util.*;
class Solution {
    // use java 8 base64 to encode and decode.(another way)
    public String encode(List<String> strs) {
        /*StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs[0]).append(',');
        }
        sb.setLength(sb.length()-1);*/
        if (strs.isEmpty()) {
            return "#EMPTY#";
        }
        String res = String.join(">",strs);
        // System.out.println(res);
        return res;

    }

    public List<String> decode(String str) {
        if (str.equals("#EMPTY#")) {
            return new ArrayList<>();
        }
        String[] strs = str.split(">");
        List<String> strlist = Arrays.asList(strs);
        return strlist;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> input = Arrays.asList("hello", "world", "java", "encode");
        String encoded = solution.encode(input);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = solution.decode(encoded);
        System.out.println("Decoded: " + decoded);
   }
}
