//https://leetcode.com/problems/flipping-an-image/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int row=0 ; row<n ; row++)
        {
            for(int col=0 ; col<(image[row].length+1)/2 ; col++)
            {
                //last index of each row and decreasing periodically
                int last=image[row].length-col-1; 

                // Swapping the values
                int temp=image[row][col]^1; // XORing value to invert the value
                image[row][col]=image[row][last]^1;
                image[row][last]=temp;
            }
        }
        return image;
        
    }
}
