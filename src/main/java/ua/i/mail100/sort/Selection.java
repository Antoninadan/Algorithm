package ua.i.mail100.sort;

public class Selection {
    public static void main(String[] args) {
        Integer[] mas = {1, 45, -90, 40, 2, 80, -9};
        Massive.show(mas);
        selectionSort(mas);
        Massive.show(mas);

        System.out.println();
    }

    public static Integer[] selectionSort(Integer[] mas) {
        int length = mas.length;
        for (int i = 0; i < length; i++) {
            int min = mas[i];
            int iMin = i;
            for (int j = i + 1; j < length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    iMin = j;
//                    System.out.print("i = " + j + ":   ");
//                    Massive.show(mas);
                }
            }
            if (i != iMin) {
                int tmp = mas[i];
                mas[i] = mas[iMin];
                mas[iMin] = tmp;
            }
        }
        return mas;
    }
}
