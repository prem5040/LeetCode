package LeetCodeSolutions;// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else 
                i++;
        }
        List<Integer> list=new ArrayList<Integer>();
        for(i=0;i<nums.length;i++)
        {
            if((nums[i]-1)!=i)
                list.add(i+1);
        }
        return list;
        
    }
}