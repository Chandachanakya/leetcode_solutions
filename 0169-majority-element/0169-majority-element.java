class Solution {
    public int majorityElement(int[] nums) {
        int c=-1;
        int votes=0;
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(votes==0){
            c=nums[i];
            votes=1;
        }
        
           else if(nums[i]==c){
                votes++;
            }
            else{
                votes--;
            }
        }
      return c;
    }
}