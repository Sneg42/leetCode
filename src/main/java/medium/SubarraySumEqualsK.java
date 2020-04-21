package medium;

public class SubarraySumEqualsK {

//    public int subarraySum(int[] nums, int k) {
//        int count = 0;
//        for (int start = 0; start < nums.length; start++) {
//            int sum=0;
//            for (int end = start; end < nums.length; end++) {
//                sum+=nums[end];
//                if (sum == k)
//                    count++;
//            }
//        }
//        return count;
//    }
    int count = 0;
    private void recurs(int [] nums, int k, int i){
        if (i == nums.length)
            return ;
        int sum = 0;
        for (int j = i; j < nums.length; j++) {
            sum += nums[j];
//            if (sum > k){
//                break;
//            }
            if (sum == k){
                this.count++;
                }
        }
        recurs(nums, k, i+1);
    }

    public int subarraySum(int [] nums, int k){

        if (nums.length == 0)
            return 0;
        if (nums.length == 1 && k == nums[0])
            return 1;
        recurs(nums, k, 0);
        return count;
    }
}
