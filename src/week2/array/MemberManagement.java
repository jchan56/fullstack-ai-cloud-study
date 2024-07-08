package week2.array;

import java.util.Scanner;

public class MemberManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] members = new String[10][3];
        int count = 0;

        while (true) {
            System.out.print("번호: ");
            String id = sc.nextLine();
            if (id.isEmpty()) break;
            /* if (id.equals("")) {
            break;
            }
             */

            System.out.print("이름: ");
            String name = sc.nextLine();
            if (name.isEmpty()) break;

            System.out.print("전화번호: ");
            String phoneNumber = sc.nextLine();
            if (phoneNumber.isEmpty()) break;

            members[count][0] = id;
            members[count][1] = name;
            members[count][2] = phoneNumber;
            count++;
        }

        System.out.println("\n회원 목록:");
        for (int i = 0; i < count; i++) {
            System.out.println("번호: " + members[i][0] + ", 이름: " + members[i][1] + ", 전화번호: " + members[i][2]);
        }

        sc.close();
    }
}
