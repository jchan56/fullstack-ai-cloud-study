package week2.control;

import java.util.*;

public class Loop {
    private static final Random rd = new Random();

    public static void main(String[] args) {
        forTest();
        forTest2();
    }

    private static void forTest() {
        int direction = -1;
        for (int i = 10; i != 11; i += direction) {
            System.out.print(i + " ");
            if (i == 1) {
                direction = 1;
            }
        }
        System.out.println(); // 개행 추가
    }

    private static void forTest2() {
        for (int i = 0; i < 10; i++) {
            int number = rd.nextInt(50) * 2 + 1;
            System.out.print(number + " ");
        }
        System.out.println(); // 개행 추가
    }
}
