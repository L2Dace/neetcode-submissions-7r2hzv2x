class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0, r= numbers.length - 1, current = 0;
        while(l<r){
            current = numbers[l] + numbers[r];
            if(current < target){
                l++;
            } else if (current > target) {
                r--;
            }
            if(current == target){
                return new int[] {l+1,r+1};
            }
        }
        return new int[0];
        
    }
}
