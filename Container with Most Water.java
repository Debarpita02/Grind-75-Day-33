public class Solution {
    public int maxArea(int[] height) {
        int left = 0; // Pointer at the beginning of the array
        int right = height.length - 1; // Pointer at the end of the array
        int maxArea = 0; // Initialize the maximum area
        
        while (left < right) {
            // Calculate the width of the container (difference between indices)
            int width = right - left;
            
            // Calculate the height of the container (minimum of the two lines)
            int minHeight = Math.min(height[left], height[right]);
            
            // Calculate the area
            int area = width * minHeight;
            
            // Update the maximum area if the current area is greater
            maxArea = Math.max(maxArea, area);
            
            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height1)); // Output: 49
        
        int[] height2 = {1, 1};
        System.out.println(solution.maxArea(height2)); // Output: 1
    }
}
