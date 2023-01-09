public class LongestCommonPrefix {
    public static String solve(String[] strs) {
        String startStr = strs[0];
        int maxPrefix = 0;

        for (int i = 1; i < strs.length; i++){
            int currentPrefix = 0;
            int max = (startStr.length() <=  strs[i].length()) ? startStr.length() : strs[i].length();

            for(int j = 0; j < max; j++){
                if(startStr.substring(0, j).equals(strs[i].substring(0, j))){
                    currentPrefix = j;
                }
            }

            if (i == 1 || currentPrefix < maxPrefix) {
                maxPrefix = currentPrefix;
            }
        }
        return startStr.substring(0, maxPrefix);
    }
}
