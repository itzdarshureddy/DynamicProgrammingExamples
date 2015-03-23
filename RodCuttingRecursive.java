//this program demonstrates why recursive approach to "rod cutting" problem is a bad approach
//when the input parameter n to the function cutRod(p,n) comes close to 39 the program takes almost an hour to complete.
//this program demonstrates the need for dynamic programming

public class RodCuttingRecursive {

    public static void main(String[] args) {

        int[] p = {1,5,8,9,10,17,17,20,24,30,31,31,34,38,42,43,45,51,54,60,61,65,68,89,70,77,77,80,84,90,91,95,98,99,100,107,107,110,114,120};
        System.out.println(cutRod(p, 33));
    }

    private static int cutRod(int[] p, int n) {
        if(n == 0) return 0;
        int q = -1;
        for (int i = 1; i < n; i++) {
            q = Math.max(q,p[i]+cutRod(p,n-i));

        }
        return q;
    }
}
