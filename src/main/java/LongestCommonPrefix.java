public class LongestCommonPrefix {
    public static String solve(String[] strs) {
        int maxPrefix = strs[0].length();

        for (int i = 1; i < strs.length; i++){
            int prefixCount = 0;
            int max = (strs[0].length() <=  strs[i].length()) ? strs[0].length() : strs[i].length();

            for(int j = 0; j <= max; j++){
                if(strs[0].substring(0, j).equals(strs[i].substring(0, j))){
                    prefixCount = j;
                }
            }

            if (prefixCount <= maxPrefix) {
                maxPrefix = prefixCount;
            }
        }

        return strs[0].substring(0, maxPrefix);
    }
}
