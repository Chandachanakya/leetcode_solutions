class Solution {
    public int[][] merge(int[][] intervals) {
       ArrayList<int[]>res=new ArrayList<>();
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       res.add(new int[]{intervals[0][0], intervals[0][1]});
       for(int i=1;i<intervals.length;i++){
            int[] last = res.get(res.size() - 1);
            int[] curr = intervals[i];
            if (curr[0] <= last[1])
                last[1] = Math.max(last[1], curr[1]);
            else
                res.add(new int[]{curr[0], curr[1]});
        }
        return res.toArray(new int[res.size()][]);
       
    }
}