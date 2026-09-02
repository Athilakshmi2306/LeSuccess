class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            map.put(i, count);
        }

        ArrayList<Integer> rows = new ArrayList<>(map.keySet());

        rows.sort((a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(a) - map.get(b);
            }
            return a - b;
        });

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = rows.get(i);
        }

        return ans;
    }
}