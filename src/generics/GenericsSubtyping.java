package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsSubtyping {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        System.out.println(strList.getClass() == intList.getClass());

        Collection cs = new ArrayList<String>();
        System.out.println(cs instanceof Collection);
        Box box = new Box();
        box.set("Hello");
        System.out.println(box.get());

        Box<Integer> genBox = new Box<>();
        genBox.set(1);
        System.out.println(genBox.get());

    }
}
