class Findpivotindex {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }

…        return -1;    
    }
}
            
        

    
