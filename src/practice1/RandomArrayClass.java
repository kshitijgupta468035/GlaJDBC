package practice1;

import java.util.*;
import java.util.LinkedHashSet;

public class RandomArrayClass {
    int length;
    public int[] populatePseudorandomElementsInArray(int[] array) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add((int) (Math.random() * length -1));
        }

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            list2.add(itr.next());
        }
        for (int i = 0; i < list2.size();  i++) {
            array[i] = list2.get(i);
        }

        return array;

    }
}
