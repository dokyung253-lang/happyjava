package 종합.과제2인.view;
import 종합.과제2인.controller.WaitingController;
import 종합.과제2인.model.dto.WaitingDto;
import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private WaitingView() {}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance() {
        return instance;
    }
    private WaitingController wc = WaitingController.getInstance();
    private Scanner scan = new Scanner(System.in);
    // [1] 대기등록
    public void writeView() {
        scan.nextLine();
        System.out.println("전화번호: ");
        String phone = scan.nextLine();
        System.out.println("인원수: ");
        int people = scan.nextInt();
        boolean result = wc.doPost(phone, people);
        if (result) {System.out.println("[안내] 대기 등록 완료");}
        else {System.out.println("[안내] 대기 등록 실패");}
    }
    // [2] 대기 현황 출력
    public void printView() {
        ArrayList<WaitingDto> waitings = wc.doGet();
        for (WaitingDto waiting : waitings) {System.out.printf("번호: %d, 전화번호:%s, 인원수:%d \n",
                    waiting.getNo(), waiting.getPhone(), waiting.getPeople());
        }
    }

    public void indexView() {
        for ( ; ; ) {

            System.out.println("======맛집 대기 시스템======");
            System.out.println("1. 대기등록ㅣ2.대기현황");
            System.out.println("==========================");
            System.out.println("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {
                writeView();
            } else if (ch == 2) {
                printView();
            }
        }
    }

    // [2] 로그인


    // [2] 로그인 페이지
    public void login(){
        System.out.print("아이디 : ");     String mid = scan.next();
        System.out.print("비밀번호 : ");    String mpw = scan.next();
        boolean result = true;
        if( result == true ){ System.out.println("로그인 성공 ");}
        else{  System.out.println("로그인 실패");}

    }


    // [*] 메인 페이지
    public void index(){
        for( ; ; ){
            System.out.print("1.회원가입 2.로그인  선택>");
            int ch = scan.nextInt();
            if( ch == 1 ){ signup(); }
            else if( ch == 2 ){ login(); }
        }
    }
    // [2] 로그인 페이지
    public void login(){
        System.out.print("아이디 : ");     String mid = scan.next();
        System.out.print("비밀번호 : ");    String mpw = scan.next();
        boolean result = mc.login( mid , mpw );
        if( result == true ){ System.out.println("로그인 성공 ");}
        else{  System.out.println("로그인 실패");}
    }

}