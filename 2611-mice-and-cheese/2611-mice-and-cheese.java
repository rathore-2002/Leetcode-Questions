class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        List<Pair<Integer, Integer>> ans = new ArrayList<>();
        for (int i = 0; i < reward1.length; i++) {
            ans.add(new Pair<>(reward1[i] - reward2[i], i));
        }
        Collections.sort(ans, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += reward1[ans.get(i).getValue()];
        }
        for (int i = k; i < ans.size(); i++) {
            max += reward2[ans.get(i).getValue()];
        }
        return max;
    }
}