package com.orzentertainment;

public class ProblemOne {

    public int solution[];

    public ProblemOne(){
        int[] nums = {3,2,4};
        int target = 6;
        this.solution = twoSum(nums, target);
    }

    public int[] twoSum(int[] nums, int target){

        for(int i=0; i<nums.length; i++){
            int currSolution = nums[i];
            for(int x=0; x<nums.length; x++){
                if(x != i){
                    currSolution += nums[x];
                    if(currSolution == target){
                        return new int[]{i,x};
                    }
                    currSolution = nums[i];
                }

            }
        }
        return new int[]{};
    }
}
