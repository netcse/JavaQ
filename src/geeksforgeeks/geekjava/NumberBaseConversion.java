package geeksforgeeks.geekjava;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Microsoft on 10/18/2015.
 */
public class NumberBaseConversion {
    public static void main(String[] args) {

        // This calculates number base system
        // 1101(2) = 1*2^3 + 1*2^2 + 0 + 1*2^0
        List<String> bits = new ArrayList<>();
        int base = 2;
        bits.add(String.valueOf(1111));
        int sum = 0;
        for (String l : bits) {
            for (int i = 0; i < l.length(); i++) {
                sum = sum + (int) (Integer.parseInt(String.valueOf(l.charAt(i))) * Math.pow(base, (l.length() - (i + 1))));
            }
            System.out.println("1111 (2) == 15 (10) ::: " + sum);
            sum = 0;
        }

    }
}
