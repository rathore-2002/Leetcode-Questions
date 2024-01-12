public class Solution {
    static class Pair {
        long first, second;

        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public long beautifulSubstrings(String s, int k) {
        long a = 0, b = 0, ans = 0;
        Map<Long, Map<Long, Long>> mp = new HashMap<>();
        mp.put(0L, new HashMap<>());
        mp.get(0L).put(0L, 1L);

        for (char ch : s.toCharArray()) {
            a += isVowel(ch) ? 1 : 0;
            b += isVowel(ch) ? 0 : 1;

            for (Map.Entry<Long, Long> entry : mp.getOrDefault(a - b, new HashMap<>()).entrySet()) {
                long z = entry.getKey();
                long count = entry.getValue();

                if ((a - z) * (a - z) % k == 0) {
                    ans += count;
                }
            }

            mp.computeIfAbsent(a - b, key -> new HashMap<>()).merge(a % k, 1L, Long::sum);
        }

        return ans;
    }
}