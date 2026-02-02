package 종합.과제2인.controller;
import 종합.과제2인.model.MemberDto;
import 종합.과제2인.model.dao.WaitingDao;
import 종합.과제2인.model.dto.WaitingDto;
import java.util.ArrayList;
import java.util.List;

public class WaitingController {
    private List<Object> members;

    private WaitingController(){};
    private static final WaitingController instance=new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }
    private WaitingDao wd=WaitingDao.getInstance();
    // [1] 회원가입메소드
    public boolean doPost(String phone, int people){
        boolean result=wd.doPost(phone, people);
        return result;
    }

    public ArrayList<WaitingDto> doGet(){
        ArrayList<WaitingDto> result=wd.doGet();
        return result;
    }

    // [2] 로그인( 현재 정보와 기존 정보를 비교 하는 작업 )
    public int login( String mid , String mpw ){
        System.out.println("MemberDao.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        for( int index = 0 ; index <= members.size()-1 ; index++ ) {// 1. 리스트(배열) 0부터 마지막 인덱스까지 반복한다.
            MemberDto memberDto = members.get( index ); // 2. index번째 회원객체를 꺼낸다.
            // 3. 만약에 index번째 회원객체내 아이디 와 비밀번호가 입력받은 아이디/비밀번호 같다면
            if( memberDto.getid().equals( mid ) && memberDto.getpw().equals( mpw ) ){
                return memberDto.getno();// 4. 로그인 성공 하면 회원번호 반환
            }
        } // for end
        return 0; // 5. 반복문 중에 동일항 정보가 없다면 로그인 실패 0
    } // m end
    }

}
