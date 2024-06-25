package LeetCodeSolutions;

//https://leetcode.com/problems/set-mismatch/

public class setMismatch {
    public int[] findErrorNums(int[] arr) {
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
        int []nums=new int[2];
        for(i=0; i<arr.length;i++)
        {
            if(i+1!=arr[i]){
                nums[0]=arr[i];
                nums[1]=i+1;
            }

        }
        return nums;


    }
}
