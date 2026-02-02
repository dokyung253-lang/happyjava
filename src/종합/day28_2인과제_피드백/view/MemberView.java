package 종합.day28_2인과제_피드백.view;

import 종합.day28_2인과제_피드백.controller.MemberController;

import java.util.Scanner;

public class MemberView {
    private MemberView() {
    }

    private static final MemberView instance = new MemberView();

    public static MemberView getInstance() {
        return instance;
    }

    private MemberController mc = MemberController.getInstance();

    private Scanner scan = new Scanner(System.in); // 입력객체

    // [*] 메인 페이지
    public void index() {
        for (; ; ) {
            System.out.println("1.회원가입 2.로그인 선택 > ");
            int ch = scan.nextInt();
            if (ch == 1) {signup();
            }else if (ch == 2) { login();}
        }
    }

    //[1] 회원가입 페이지
    public void signup() {
        System.out.print("아이디 : ");
        String mid = scan.next();
        System.out.print("비밀번호 : ");
        String mpw = scan.next();
        System.out.print("닉네임 : ");
        String mname = scan.next();
        System.out.print("연락처 : ");
        String mphone = scan.next();
        boolean result = true; // 임시
        if (result == true) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    // [2] 로그인 페이지
    public void login() {
        System.out.print("아이디 : ");
        String mid = scan.next();
        System.out.print("비밀번호 : ");
        String mpw = scan.next();
        boolean result = mc.login( mid, mpw );
        if (result == true) {System.out.println("로그인성공");
        } else {System.out.println("로그인실패");}
    }
}
