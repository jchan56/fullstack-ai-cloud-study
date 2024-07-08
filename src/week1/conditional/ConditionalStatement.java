package week1.conditional;

import java.util.Calendar;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        dateTest();
        loginService();
    }

    private static void dateTest() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        int hour= cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.printf("%d-%d-%d %d요일 %d:%d:%d", year, month, day, week, hour, minute, second);
    }

    private static void loginService() {
        Scanner sc = new Scanner(System.in);

        String correctUserId = "admin";
        String correctPassword = "1234";

        int cnt = 0;

        while (true) {
            cnt++;

            System.out.print("아이디를 입력하세요: ");
            String userId = sc.nextLine();

            String password = sc.nextLine();

            boolean loginSuccess = userId.equals(correctUserId) && password.equals(correctPassword);
            System.out.println(loginSuccess ? "로그인 성공!" : "로그인 실패! 다시 시도하세요.");

            if (loginSuccess) {
                break;
            }

            if (cnt == 3) {
                System.out.println("로그인 시도 횟수를 초과했습니다. 10분 후에 다시 시도하세요.");
                break;
            }
        }
        sc.close();
    }
}
