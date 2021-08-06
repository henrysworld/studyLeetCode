import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2){
            return Collections.emptyList();
        }

        Arrays.sort(nums);

        Set<List<Integer>> result = new LinkedHashSet<>();
        for (int i =0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> value = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(value);
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
}
