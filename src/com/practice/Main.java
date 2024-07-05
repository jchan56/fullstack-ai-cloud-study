package com.practice;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        logicalOpTest();
        loginTest();
    }

    private static void logicalOpTest() {
        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        System.out.println("첫 번째 수: " + num1);
        System.out.println("두 번째 수: " + num2);

        String result = ((num1 & 1) == 1 && (num2 & 1) == 1) ? "유효한수" : "무효한수";
        System.out.println(result);
    }

    private static void loginTest() {
        Scanner sc = new Scanner(System.in);

        String userId = "admin";
        String password = "1234";

        System.out.print("아이디를 입력하세요: ");
        String inUserId = sc.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String inPassword = sc.nextLine();

        String result = (inUserId.equals(userId) && inPassword.equals(password)) ? "로그인 성공!" : "로그인 실패!";
        System.out.println(result);

        sc.close();
    }

}
