package ua.i.mail100.sort;

import java.util.Random;

public class Massive {
    public static <T extends Comparable<T>> void show(T[] a) {
        for (T element : a) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static <T extends Comparable<T>> void shuffleArray(T[] a) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            T subst = a[index];
            a[index] = a[i];
            a[i] = subst;
        }
    }
}
