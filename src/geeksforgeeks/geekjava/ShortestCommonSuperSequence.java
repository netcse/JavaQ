package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/19/2015.
 */

public class ShortestCommonSuperSequence {

    // Finds the shortest super sequence of seqFirst and seqSecond
    public static void findShortestCommonSuperSeq(String seqFirst, String seqSecond) {

        int seqFirstLen = seqFirst.length();
        int seqSecondLen = seqSecond.length();

        int[][] dp = new int[seqFirstLen + 1][seqSecondLen + 1];

        // Fill table in bottom up manner
        for (int i = 0; i <= seqFirstLen; i++) {
            for (int j = 0; j <= seqSecondLen; j++) {
                // in c++ !i
                if (i == 0) {
                    dp[i][j] = j;
                }
                // in c++ !j
                else if (j == 0) {
                    dp[i][j] = i;
                } else if (seqFirst.charAt(i - 1) == seqSecond.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[seqFirstLen][seqSecondLen]);
    }

    public static void main(String[] args) {

        String seqFirst = "abcde";
        String seqSecond = "defgh";

        findShortestCommonSuperSeq(seqFirst, seqSecond);

    }
}
