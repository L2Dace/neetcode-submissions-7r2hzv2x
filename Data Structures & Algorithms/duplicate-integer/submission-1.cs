public class Solution {
    public bool hasDuplicate(int[] nums) {
        HashSet<int> duplicateNums = new HashSet<int>();
        foreach (int num in nums){
            if (duplicateNums.Contains(num)){
                return true;
            }
            duplicateNums.Add(num);  
        }
        return false;
    }
}