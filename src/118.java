class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(numRows<=0) return ans;
        ans.add(new ArrayList<Integer>(Arrays.asList(1)));
        if(numRows==1)  return ans;
        ans.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
        if(numRows==2)  return ans;
        for(int i=3; i<=numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            row.add(0, 1);
            for(int j=1;j<i-1;j++){
                row.add(j, ans.get(ans.size()-1).get(j-1)+ans.get(ans.size()-1).get(j));
            }
            row.add(1);
            ans.add(row);
        }
        return ans;
    }
}
