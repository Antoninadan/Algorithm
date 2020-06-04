package ua.i.mail100.sort;

public class Bubble {
    public static void main(String[] args) {
        Integer[] mas = {1, 45, -90, 40, 2};
        bubbleSort1(mas);
        System.out.println();

        Integer[] mas2 = {1, 45, -90, 40, 2};
        bubbleSort2(mas2);
    }

    public static Integer[] bubbleSort1(Integer[] mas) {
        int length = mas.length;
        int flag = 1;
        while (flag != 0) {
            flag = 0;
            for (int i = 0; i < length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    int subst = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = subst;
                    System.out.print("i = " + i + ":   ");
                    Massive.show(mas);
                    flag++;
                }
            }
        }
        return mas;
    }

    public static Integer[] bubbleSort2(Integer[] mas) {
        int length = mas.length;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;

                    System.out.print("j = " + j + ":   ");
                    Massive.show(mas);
                }
            }
        }
        return mas;
    }


}
