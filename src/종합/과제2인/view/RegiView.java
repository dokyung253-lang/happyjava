package 종합.과제2인.view;

import 종합.과제2인.controller.RegiController;

import java.util.Scanner;

Scanner scan = new Scanner(System.in);
public class RegiView {
    public void writeView() {
        scan.nextLine();
        String id = scan.nextLine();
        System.out.println("아이디: ");
        int pw = scan.nextInt();
        System.out.println("비밀번호: ");
        String name = scan.nextLine();
        System.out.println("닉네임: ");
        String phone = scan.nextLine();
        System.out.println("전화번호: ");
        boolean result = rc.doPost(id, pw, name, phone);
        if (result) {
            System.out.println("[안내] 회원가입 완료");
        } else {
            System.out.println("[안내] 회원가입 실패");
        }
    }
    public void LoginView(){
        String id = scan.nextLine();
        System.out.println("아이디: ");
        int pw = scan.nextInt();
        System.out.println("비밀번호: ");
        boolean result=rc.doLogin(id,pw);
        if(result) {
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");}
    }
}