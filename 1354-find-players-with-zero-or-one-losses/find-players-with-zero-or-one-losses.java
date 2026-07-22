class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        int[] losses = new int[100001];
        boolean[] played = new boolean[100001];

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            played[winner] = true;
            played[loser] = true;

            losses[loser]++;
        }

        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for (int i = 1; i < losses.length; i++) {

            if (played[i] && losses[i] == 0) {
                result.get(0).add(i);
            } 
            else if (losses[i] == 1) {
                result.get(1).add(i);
            }
        }

        return result;
    }
}