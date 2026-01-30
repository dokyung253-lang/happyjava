package 종합.과제2;

import 종합.과제2.view.BoardView;

import java.util.Scanner;

public class Appstart {
    public static void main(String[] args) {
        // 최초로 실행할 화면view 요청한다.
        BoardView.getInstance().indexView();
    }
}
