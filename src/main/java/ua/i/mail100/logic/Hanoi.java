package ua.i.mail100.logic;

public class Hanoi {

    public static void main(String[] args) {

        hanoi(3, 'A', 'B', 'T');
    }


    static void hanoi(int n, char from, char to, char temp) {
        if (n > 0) {
            hanoi(n - 1, from, temp, to);
            System.out.println(from + "->" + to);
            hanoi(n - 1, temp, to, from);
        }
    }
}
