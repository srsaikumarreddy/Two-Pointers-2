
// Time Complexity : O (N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Create a new Array and insert the elements in them one by one.
// We check both nums1 and nums2 array at each point, to find out the smaller element.
// Find smaller element using i and j pointer until the common length of both the arrays.
// After that just append the existing elements into array. 

// Your code here along with comments explaining your approach


class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0,j=0,k=0;
        int array[]=new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                array[k]=nums1[i];
                i++;
                k++;
            }
            else{
                array[k]=nums2[j];
                j++;
                k++;
            }
        }
        
        while(j<n)
        {
            array[k]=nums2[j];
            k++;
            j++;
        }
        while(i<m)
        {
            array[k]=nums1[i];
            i++;
            k++;
        }
        
        for(i=0;i<m+n;i++)
        {
          nums1[i]=array[i];
        }
        
        
       
    }
}