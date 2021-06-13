package study.lc.arrays_strings;

public class ContainerMostWater {

    //https://leetcode.com/explore/featured/card/google/59/array-and-strings/3048/
    public int maxArea(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j-i);
                maxArea = Math.max(area, maxArea);
            }
        }

        return maxArea;
    }

    public int maxArea2(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length-1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(area, maxArea);

            if (left < right) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
