package leetcode.sloution239;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sloution239Test {

    Sloution239 obj =  new Sloution239();
    @Test
    public void maxSlidingWindow() {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] excepts = {3,3,5,5,6,7};
        assertArrayEquals(excepts,obj.maxSlidingWindow(nums,k));
    }

    @Test
    public void maxSlidingWindow01() {
        int[] nums = {1};
        int k = 1;
        int[] excepts = {1};
        assertArrayEquals(excepts,obj.maxSlidingWindow(nums,k));
    }
    @Test
    public void maxSlidingWindow02() {
        int[] nums = {1};
        int k = 1;
        int[] excepts = {1};
        assertArrayEquals(excepts,obj.maxSlidingWindow(nums,k));
    }

    @Test
    public void maxSlidingWindow03() {
        int[] nums = {9,11};
        int k = 2;
        int[] excepts = {11};
        assertArrayEquals(excepts,obj.maxSlidingWindow(nums,k));
    }
    @Test
    public void maxSlidingWindow04() {
        int[] nums = {9,11};
        int k = 1;
        int[] excepts = {9,11};
        assertArrayEquals(excepts,obj.maxSlidingWindow(nums,k));
    }

    @Test
    public void maxSlidingWindow05() {
        int[] nums = {-1,1};
        int k = 1;
        int[] excepts = {-1,1};
        assertArrayEquals(excepts,obj.maxSlidingWindow(nums,k));
    }
}