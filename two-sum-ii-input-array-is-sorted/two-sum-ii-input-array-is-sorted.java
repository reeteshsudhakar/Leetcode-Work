class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int ans1, ans2;
        int high = numbers.length - 1;
        int[] result = new int[2];
        
        while (low <= high) {
            if (numbers[low] + numbers[high] == target) {
                result[0] = low + 1;
                result[1] = high + 1;
                break;
            } else if (numbers[low] + numbers[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        
        return result;
    }
}