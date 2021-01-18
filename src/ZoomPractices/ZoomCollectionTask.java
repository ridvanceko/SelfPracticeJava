package ZoomPractices;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ZoomCollectionTask {

    public static void main(String[] args) {

        int [] array= {2, 3, 4, 4, 7, 2, 1};

        Set<Integer> ascending = new TreeSet<>();

        for (int i = 0; i <array.length ; i++) {

            ascending.add(array[i]);

        }
        System.out.println(ascending);
    }
}
