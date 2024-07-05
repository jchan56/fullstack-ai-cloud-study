package week1.control;

import java.util.Random;

public class ControlStatement {
    public static void main(String[] args) {
        loopTest();
    }

    private static void loopTest() {
        int i = 1;

        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        i = 4;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }
}