package week2.control;

public class Loop {
    public static void main(String[] args) {
        forTest();
    }

    private static void forTest() {
        for (int i = 10, direction = -1; i > 0; i += direction) {
            System.out.print(i + " ");
            if (i == 1) {
                direction = 1;
            }
        }
        System.out.print(10);
    }
}

