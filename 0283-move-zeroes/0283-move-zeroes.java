class Solution {
    public void moveZeroes(int[] nums) {
        int size= nums.length;
        int count=0;
        for(int i=0;i<size;i++){
            if (nums[i]==0)
                count++;
        }
        for (int i=0;i<size;i++)
        {
            if(nums[i]==0){
                for(int j=i;j<size-1;j++)
                {
                    nums[j]=nums[j+1];
                }
                nums[size-1]=0;
                if(nums[i] ==0 && (size-i)>count){
                    i--;
                }
            }
        }
        for(int i=size-count;i<size;i++){
            nums[i]=0;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(nums[i]+",");
        }
    }
}