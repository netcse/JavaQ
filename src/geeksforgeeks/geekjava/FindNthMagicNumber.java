package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/18/2015.
 */
public class FindNthMagicNumber {

    private static int nthMagicNo(int n) {
        int pow = 1, answer = 0;

        // Go through every bit of n

        while (n != 0) {
            pow = pow * 5;

            // If last bit of n is set
            if ((n & 1) >= 1) {
                answer += pow;
            }
            // Proceed to next bit
            n >>= 1;
        }
        return answer;
    }


    public static void main(String[] args) {

        int n = 9;
        System.out.println("n'th magic number is : " + nthMagicNo(n));

    }

}
