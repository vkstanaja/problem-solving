package org.practice.algorithms;

public class NQueens {
    public int[] nQueens(int n) {
        boolean []c = new boolean [n];
        boolean []d1 = new boolean[2*n];
        boolean [] d2 = new boolean[2*n];
        int[]places = new int[n];
        for (int i = 0; i < n; i++) {
            places[i] = -1;
        }

        helper(0, places, n, c, d1, d2);
        return places;
    }

    private boolean helper(int rc, int[]places, int n, boolean[]c, boolean[]d1, boolean[] d2) {
        if (rc == n) return true;
        for (int i = 0; i < n; i++) {
            if (c[i] || d1[rc+i] || d2[n-i+rc-1]) continue;

            c[i] = true;
            d1[rc+i] = true;
            d2[n-i+rc-1] = true;
            places[rc] = i;
            boolean b = helper(rc+1, places, n, c, d1, d2);
            if (b == true)return true;
            c[i] = false;
            d1[rc+i] = false;
            places[rc] = -1;
            d2[n-i+rc-1] = false;
        }

        return false;
    }
}
