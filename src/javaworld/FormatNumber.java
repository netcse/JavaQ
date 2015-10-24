package javaworld;

import java.math.BigDecimal;
import java.util.BitSet;
import java.util.Formatter;


/**
 * Created by Microsoft on 10/15/2015.
 */
public class FormatNumber {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        // ( -> puts parenthesis to negative number &
        // , insert comma every after 3 digit from right
        f.format("%(,d", -10_024_000_000L);
        //System.out.println(f.toString());
        BigDecimal bigDecimal = new BigDecimal(new String("2347892479832748932789432748932"));
//        System.out.println(bigDecimal.multiply(bigDecimal));
//        System.out.println(bigDecimal.TEN);
        BitSet bitSet = new BitSet(10);
        bitSet.set(0, 10, true);
        int i = 0;
        System.out.println(bitSet.get(i++));
        System.out.println(bitSet.get(9));
        bitSet.clear();
        System.out.println(bitSet.get(9));
    }
}

