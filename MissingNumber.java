class MissingNumber {
    public int missingNumber(int[] nums) {
        /* Using cyclic sort method
        int i =0;
        while(i<nums.length)
        {
            //Becaause array is starting from 0
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else
                i++;

        }
        //search for missing element
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
                return i;
        }
        return nums.length; */

        // Another Approach:
        int sum=0;
        int n=nums.length;
        int totalsum=(n*(n+1))/2;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        return totalsum-sum;
    }

    
}