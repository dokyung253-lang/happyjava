package 종합.과제2인.model.dao;
import 종합.과제2인.model.dto.WaitingDto;
import java.util.ArrayList;
public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance=new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    private final ArrayList<WaitingDto> waitings=new ArrayList<>();
    private static int currentNo=1; // [*] 자동회원번호 부여하기 위한 최신 회원번호
    // [1] 회원가입
    public boolean doPost(String phone, int people){
        System.out.println("WaitingDao.doPost"); // sout + m (필수는 아니지만 중간중간 찍어놓으면 편함 = console.log)
        System.out.println("phone = " + phone + ", people = " + people); // sout + p (= console.log)
        WaitingDto waitingDto=new WaitingDto(currentNo, phone, people); // 1. 회원 객체(dto) 생성한다.
        boolean result=waitings.add(waitingDto); // 2. 회원객체를 리스트에 저장한다.
        currentNo++;
        return result;
    }
    public ArrayList<WaitingDto> doGet(){
        return waitings;
    }
    // [2] 로그인(현재 정보와 기존 정보를 비교하는 작업)
    public boolean login(String id, pw){
        System.out.println("MemberDao.login");
        System.out.println("id = " + id + "pw = "+ pw);
        for(int index = 0; index<= waitings.size()-1; index ++ ){ // 1. 리스트(배열) 0부터 마지막 인덱스까지
            WaitingDto waitingDto = waitings.get(index); // 2. index번째 회원객체를 꺼낸다.
            // 3. 만약에 index번쨰 회원객체내 아이디와 비밀번호가 입력받은 아이디/비밀번호와 같다면
            if(waitingDto.getid().equals( id )&& waitingDto,getpw().equals( pw )){
                return true // 4. 로그인 성공
            }
        } // for end
        return false; // 5. 반복문 중에 동일항 정보가 없다면 로그인 실패
    } // m end
}