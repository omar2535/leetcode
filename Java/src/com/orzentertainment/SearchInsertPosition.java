package com.orzentertainment;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            System.out.println("nums[i]: " + nums[i] + " i: " + i);
            if(nums[i] == target)
                return i;
            if(nums[i] < target && i+1 < nums.length && nums[i+1] > target)
                return i+1;
        }
        if(target > nums[nums.length-1])
            return nums.length;
        else if(target < nums[0])
            return 0;
        return 0;

    }
}
