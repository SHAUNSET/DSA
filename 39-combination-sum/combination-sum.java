class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        solve(candidates , target , 0 , new ArrayList<>(), result);
        return result;
        
    }

    public void solve(int [] candidates , int target , int index , List<Integer> curr , List<List<Integer>> result ){

        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index ; i < candidates.length ; i++){

            curr.add(candidates[i]);

            solve(candidates , target - candidates[i], i , curr , result);

            curr.remove(curr.size() - 1);

        }
    }
}