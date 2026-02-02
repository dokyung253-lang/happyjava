package 종합.과제3.view;

import 종합.과제3.controller.AdminController;

import java.util.Scanner;

public class AdminView {
    private AdminView() {
    }

    private static final AdminView instance = new AdminView();

    public static AdminView getInstance() {
        return instance;
    }

    private AdminController mc = AdminController.getInstance();
    private Scanner scan = new Scanner(System.in);

    // [*] 메인 페이지
    public void index() {
        for (; ; ) {
            System.out.print("1. 회원가입 2. 로그인 선택 >");
            int ch = scan.nextInt();
            if (ch == 1) { signup(); }
            else if (ch == 2) {
            }
        }
    }
    // [1] 회원가입 페이지
    public void signup(){
        System.out.print("아이디 : ");
        String aid = scan.next();
        System.out.print("비밀번호 : ");
        String apw = scan.next();
        System.out.print("닉네임 : ");
        String aname = scan.next();
        System.out.print("연락처 : ");
        String aphone = scan.next();
        boolean result = true; // 임시
        if (result == true) {System.out.println("회원가입 성공");
        } else {System.out.println("회원가입 실패");}
    }
}
