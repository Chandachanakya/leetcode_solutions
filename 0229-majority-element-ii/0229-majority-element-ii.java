class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ele=new ArrayList<>();
        int c1=0;
        int c2=0;
        int votes1=0;
        int votes2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           if(nums[i] == c1) {
                votes1++;
            }
            else if(nums[i] == c2) {
                votes2++;
            }
            else if(votes1 == 0) {
                c1 = nums[i];
                votes1 = 1;
            }
            else if(votes2 == 0) {
                c2 = nums[i];
                votes2 = 1;
            }
            else {
                votes1--;
                votes2--;
            }
        }
        votes1=0;
        votes2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==c1) votes1++;
            else if(nums[i]==c2) votes2++;
        }
        if(votes1>n/3) ele.add(c1);
        if(votes2>n/3) ele.add(c2);

        return ele;
    }
}