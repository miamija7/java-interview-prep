import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOf3 {
    public static List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> triplets = new ArrayList();
        if (nums.length < 3) { return triplets; }
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if((nums[i] + nums[j] + nums[k]) == 0) {
                        List<Integer> newList = new ArrayList<Integer>();
                        newList.add(nums[i]);
                        newList.add(nums[j]);
                        newList.add(nums[k]);
                        Collections.sort(newList);
                        if(triplets.indexOf(newList) == -1) { triplets.add(newList); }
                    }
                }
            }
        }
        return triplets;
    }
}
