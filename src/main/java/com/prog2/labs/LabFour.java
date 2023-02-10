package com.prog2.labs;
/**
 * @author adinashby
 *
 */

public class LabFour {
	
	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
    public int containerWithMostWater(int[] height) {
        
        int n = height.length;
        int maxArea = 0;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                maxArea = (j - i) * Math.min(height[i], height[j]) - maxArea > 0 ? (j - i) * Math.min(height[i], height[j]) : maxArea;
            }
        }
        return maxArea;
    }
    
    public int threeSumClosest(int[] nums, int target) {
        
        int n = nums.length;
        int minGap = 3200;
        int sum = 0;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                for(int k = j + 1; k < n ; k++){
                    int gap = Math.abs(nums[i] + nums[j] + nums[k] - target);
                    if(gap - minGap < 0){
                        minGap = gap;
                        sum = nums[i] + nums[j] + nums[k];
                    }
               
                }
            }
        }
        return sum;
    }
}
