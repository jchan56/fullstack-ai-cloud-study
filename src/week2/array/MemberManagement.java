package week2.array;

import java.util.Scanner;

public class MemberManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] members = new String[10][3];
        int count = 0;

        while (true) {
            System.out.print("\n명령을 입력하세요 (s: 목록 확인, a: 추가, u: 수정, d: 삭제, f: 검색, x: 종료): ");
            String command = sc.nextLine();

            if (command.equals("x")) {
                break;
            } else if (command.equals("a")) {
                if (count >= 10) {
                    System.out.println("더 이상 회원을 추가할 수 없습니다.");
                    continue;
                }
                System.out.print("번호: ");
                String id = sc.nextLine();
                if (id.isEmpty()) continue;

                System.out.print("이름: ");
                String name = sc.nextLine();
                if (name.isEmpty()) continue;

                System.out.print("전화번호: ");
                String phoneNumber = sc.nextLine();
                if (phoneNumber.isEmpty()) continue;

                members[count][0] = id;
                members[count][1] = name;
                members[count][2] = phoneNumber;
                count++;
            } else if (command.equals("s")) {
                System.out.println("\n회원 목록:");
                for (int i = 0; i < count; i++) {
                    System.out.println("번호: " + members[i][0] + ", 이름: " + members[i][1] + ", 전화번호: " + members[i][2]);
                }
            } else if (command.equals("u")) {
                System.out.print("수정할 회원의 번호를 입력하세요: ");
                String id = sc.nextLine();
                int index = -1;
                for (int i = 0; i < count; i++) {
                    if (members[i][0].equals(id)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("해당 번호의 회원이 없습니다.");
                } else {
                    System.out.print("새 전화번호: ");
                    members[index][2] = sc.nextLine();
                }
            } else if (command.equals("d")) {
                System.out.print("삭제할 회원의 번호를 입력하세요: ");
                String id = sc.nextLine();
                int index = -1;
                for (int i = 0; i < count; i++) {
                    if (members[i][0].equals(id)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("해당 번호의 회원이 없습니다.");
                } else {
                    for (int i = index; i < count - 1; i++) {
                        members[i] = members[i + 1];
                    }
                    members[count - 1] = new String[3];
                    count--;
                    System.out.println("회원 정보가 삭제되었습니다.");
                }
            } else if (command.equals("f")) {
                System.out.print("검색할 회원의 번호를 입력하세요: ");
                String id = sc.nextLine();
                int index = -1;
                for (int i = 0; i < count; i++) {
                    if (members[i][0].equals(id)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("해당 번호의 회원이 없습니다.");
                } else {
                    System.out.println("번호: " + members[index][0] + ", 이름: " + members[index][1] + ", 전화번호: " + members[index][2]);
                }
            } else {
                System.out.println("올바르지 않은 명령입니다.");
            }
        }

        sc.close();
    }
}
