package leetcode.sloution239;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Sloution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        int index = 0;

        //建立大顶堆
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });

        for(int pos =0;pos<k;pos++){
            queue.add(new int[] {nums[pos],pos});
        }
        result[index++] = queue.element()[0];

        for(int pos = k;pos<nums.length;pos++){
            queue.add(new int[]{nums[pos],pos});
            while (queue.element()[1]<=pos-k){
                queue.remove();
            }
            result[index++] = queue.element()[0];
        }

        return result;
    }
}
