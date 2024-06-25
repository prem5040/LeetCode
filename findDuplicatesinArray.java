package LeetCodeSolutions;
import java.util.*;
import java.util.function.Supplier;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findDuplicatesinArray {
    public List<Integer> findDuplicates(int[] arr) {

        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else
                i++;

        }
        List<Integer> list=new ArrayList<Integer>();
        for(i=0; i<arr.length;i++)
        {
            if(i+1!=arr[i])
                list.add(arr[i]);
        }
        return list;

    }
}
