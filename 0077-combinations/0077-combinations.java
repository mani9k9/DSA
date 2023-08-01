class Solution {
    public List<List<Integer>> combine(int n, int k) {
             List<List<Integer>> ans = new ArrayList<>();
        add(n, k, ans, new ArrayList<Integer>(), 1);
        return ans;
    }
    private void add(int n, int k, List<List<Integer>> ans, List<Integer> current, int num){
        if(k==0){
            ans.add(current);
            return;
        }
        if(k<=n-num){
            List<Integer> newCurrent = new ArrayList<Integer>(current);
            add(n, k, ans, newCurrent, num+1);
        }
        current.add(num);
        add(n, k-1, ans, current,num+1);
    }
}