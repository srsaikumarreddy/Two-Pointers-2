
// Time Complexity : O (N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Keep j as a pointer to insert . Traverse with i and check if the current value == previous value.
// Maintain count and if the count is less than 3, keep inserting at right place.
// If there are 4 2's , only 2 will be inserted then only i will advance.

// Your code here along with comments explaining your approach

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        
     if(nums==null ||nums.length==0) return 0;
        
    // if(nums.length<3) return nums.length;
        
     int i=1,j=1;
     int count=1;
        
    while(i<nums.length)
    {
        if(nums[i]==nums[i-1])
            count++;
        else count=1;
        
        if(count<3)
        { 
          nums[j]=nums[i];
          j++;
        }
        
        i++;
    }
     return j;   
    }
}