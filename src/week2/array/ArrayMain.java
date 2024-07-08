package week2.array;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        System.out.print("회원의 이름을 입력하세요: ");
        String name = sc.nextLine();

        String greeting = greet(name);

        System.out.println(greeting);

        sc.close();
    }

    public static String greet(String name) {
        return "Hello " + name;
    }
}