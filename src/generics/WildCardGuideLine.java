package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Microsoft on 10/21/2015.
 */

class NaturalNumber {
    private int i;

    public NaturalNumber(int num) {
        this.i = num;
    }

    int get() {
        return this.i;
    }
}

class EvenNumber extends NaturalNumber {
    public EvenNumber(int num) {
        super(num);
        super.get();
    }

}

public class WildCardGuideLine {

    public static void main(String[] args) {
        List<EvenNumber> evenList = new ArrayList<>();
        List<? extends NaturalNumber> nnList = evenList;

        /**
         *   Because List<EvenNumber> is a subtype of List<? extends NaturalNumber>,
         *   you can assign le to ln. But you cannot use ln to add a natural number
         *   to a list of even numbers.
         **/
        /*  Following Operations are possible:
            You can add null.
            You can invoke clear.
            You can get the iterator and invoke remove.
            You can capture the wildcard and write elements that you've read from the list.
         */
        // nnList.add(new NaturalNumber(100)); error as strict read-only

        evenList.add(new EvenNumber(100));
        evenList.add(new EvenNumber(200));

        System.out.println(evenList.get(0)); // @address
        System.out.println(evenList.get(1)); // @address
        System.out.println(evenList.size()); // 2
        System.out.println(nnList.size());   // 2
        nnList.remove(0);
        System.out.println(nnList.size());   // 1
        System.out.println(evenList.size()); // 1
        nnList.clear();
        System.out.println(evenList.size()); // 0

    }
}
