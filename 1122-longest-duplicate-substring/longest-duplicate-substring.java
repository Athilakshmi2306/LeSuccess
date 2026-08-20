import java.util.*;

class Solution {

    public String longestDupSubstring(String s) {

        int n = s.length();
        int left = 1;
        int right = n - 1;
        String ans = "";

        while (left <= right) {

            int mid = left + (right - left) / 2;

            String dup = check(s, mid);

            if (dup != null) {
                ans = dup;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private String check(String s, int len) {

        long base = 256;
        long mod = 1000000007L;

        long hash = 0;
        long power = 1;

        for (int i = 0; i < len - 1; i++) {
            power = (power * base) % mod;
        }
        for (int i = 0; i < len; i++) {
            hash = (hash * base + s.charAt(i)) % mod;
        }

        HashMap<Long, ArrayList<Integer>> map = new HashMap<>();

        map.computeIfAbsent(hash, k -> new ArrayList<>()).add(0);

        for (int i = len; i < s.length(); i++) {

            hash = (hash - s.charAt(i - len) * power) % mod;

            if (hash < 0) {
                hash += mod;
            }

            hash = (hash * base + s.charAt(i)) % mod;

            int start = i - len + 1;

            if (map.containsKey(hash)) {

                for (int oldStart : map.get(hash)) {

                    boolean same = true;

                    for (int j = 0; j < len; j++) {

                        if (s.charAt(oldStart + j)
                                != s.charAt(start + j)) {
                            same = false;
                            break;
                        }
                    }

                    if (same) {
                        return s.substring(start, start + len);
                    }
                }
            }

            map.computeIfAbsent(hash, k -> new ArrayList<>()).add(start);
        }

        return null;
    }
}