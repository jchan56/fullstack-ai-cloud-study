package week1.control;

import java.util.Random;

public class ControlStatement {
    public static void main(String[] args) {
        loopTest();
        getEvents();
    }

    private static void loopTest() {
        int i = 1;

        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        i = 4;
        while (i >= 1) {
            System.out.println(i + " ");
            i--;
        }


    }
    private static void getEvents() {
        Random rd = new Random();
        int count = 0;

        while (count < 5) {
            int num = rd.nextInt(50) * 2;
            System.out.println(num);
            count++;
        }
    }
}