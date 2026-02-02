package 종합.과제3.model.dao;

import 종합.과제3.model.dto.MemberDto;
import java.util.ArrayList;

public class MemberDao {

    private MemberDao() {}
    private static final MemberDao instance = new MemberDao();

    public static MemberDao getInstance() {return instance;}

    private ArrayList<MemberDto> members = new ArrayList<>();
    private int currentMno = 1; // [*]자동회원번호 부여하기 위한 최신 회원번호

    //[1] 회원가입
    public boolean signup(String mid, String mpw, String mname, String mphone, boolean isAdmin) {
        System.out.println("MemberDao.signup");
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mphone = " + mphone);
        MemberDto memberDto = new MemberDto(currentMno, mid, mpw, mname, mphone, isAdmin); // 2. 회원객체에 저장한다.
        boolean result = members.add(memberDto); //2. 회원객체를 리스트에 저장한다.
        if (result) {currentMno++;} // [*] 저장 성공 시 회원번호 1 증가
        return result; // 저장 성공여부를 반환한다.
    }

    //[2] 로그인( 현재정보와 기존정보를 비교하는 작업)
    public boolean login(String mid, String mpw) {
        System.out.println("MemberDao.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        for (int index = 0; index <= members.size(); index++) {
            MemberDto memberDto = members.get(index); // 2. index번째 회원 객체를 꺼낸다.
            // 3. 만약에 index번째 회원객체내 아이디와 비밀번호가 일치한다면
            if (memberDto.getMid().equals(mid) && memberDto.getMpw().equals(mpw)) {
                return true; //4. 로그인 성공
            }
        }// for end
        return false; // 5. 반복문 중에 동일한 정보가 없다면 로그인 실패
    }
}

