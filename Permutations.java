class Solution {
    // Time: O(n² × n!)
    // Space: O(n × n!) including the output, and O(n) auxiliary space. 
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        backtrack(nums, current, ans);
        return ans;
    }

    public static void backtrack(int nums[],List<Integer> current,  List<List<Integer>> ans){
        //base case

        if(current.size()==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        // kaam

        for(int i=0;i<nums.length;i++){
             // If already used, skip
            if (current.contains(nums[i])) {
                continue;
            }
            // add current num
            current.add(nums[i]);
            // Recursion
            backtrack(nums,current,ans);
            // backtrack
            current.remove(current.size()-1);

        }
    };
}
