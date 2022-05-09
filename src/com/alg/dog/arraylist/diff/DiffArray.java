package com.alg.dog.arraylist.diff;

public class DiffArray {

    private int[] diff;

    public DiffArray(int[] nums) {
        this.diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    public void add(int i, int j, int k) {
        diff[i] += k;
        if (j + 1 < diff.length) {
            diff[j + 1] -= k;
        }
    }

    public int[] generateArray() {
        int[] nums = new int[diff.length];
        nums[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            nums[i] += diff[i]+nums[i-1];
        }
        return nums;
    }
}
