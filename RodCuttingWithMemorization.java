/**
 * Created by darshanubuntu on 3/22/15.
 *
 * This is implementation of rod cutting problem with top down approach which is recursive approach modified to have memorization
 * this will make sure no sub problems are solved twice
 */
public class RodCuttingWithMemorization {

    public static void main(String[] args) {
        int[] p = {1,5,8,9,10,17,17,20,24,30,31,31,34,38,42,43,45,51,54,60,61,65,68,89,70,77,77,80,84,90,91,95,98,99,100,107,107,110,114,120};
        int n =33;
        int[] r = new int[n+1];
        for (int i = 0; i <= n; i++) {
            r[n]=-1;
        }
        System.out.println(cutRodWithMemorization(p, n,r));
    }

    private static int cutRodWithMemorization(int[] p, int n, int[] r) {
        int q=-1;
        if(r[n] >= 0) return r[n];
        else if(n == 0) q= 0;
        else {
            for (int i = 1; i < n; i++) {
                q = Math.max(q, p[i] + cutRodWithMemorization(p, n - i, r));

            }

        }
        r[n]=q;
        return q;
    }
}
