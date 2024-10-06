package enumeration.test.ex1;

import java.util.Locale;
import java.util.Scanner;

public class AutoGradeMain2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: LOGIN");
        String grade = scanner.nextLine();

        AutoGrade autoGrade = AutoGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 "+autoGrade.getDescription()+"입니다.");

        System.out.println("==메뉴 목록==");
        if(autoGrade.getLevel()>0){
            System.out.println("- 메인 화면");
        }if(autoGrade.getLevel()>1){
            System.out.println("- 이메일 관리 화면");
        }if(autoGrade.getLevel()>2){
            System.out.println("- 관리자 화면");
        }

    }
}
