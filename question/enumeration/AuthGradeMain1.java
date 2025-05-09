package question.enumeration;

import java.util.Scanner;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String scannerDescription = scanner.next();

        AuthGrade authGrade = AuthGrade.valueOf(scannerDescription.toUpperCase());
        System.out.println("당신의 등급은: " + authGrade.getDescription() + "입니다.");

        printMainMenu(scannerDescription);

    }

    public static void printMainMenu(String scannerDescription) {
        AuthGrade[] grades = AuthGrade.values();
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
        for (int i = 0; i < grades.length; i++) {
            if (scannerDescription.toUpperCase().equals(grades[0].name())) {
                break;
            } else if (scannerDescription.toUpperCase().equals(grades[1].name())) {
                System.out.println("- 이메일 관리 화면");
                break;
            } else if (scannerDescription.toUpperCase().equals(grades[2].name())) {
                System.out.println("- 이메일 관리 화면");
                System.out.println("- 관리자 화면");
                break;
            }
        }
    }
}
