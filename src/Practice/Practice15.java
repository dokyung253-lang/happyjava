package Practice;
import java.util.Scanner;

public class Practice15 {
    String str1 = new String("유재석");
    String str2 = new String("유재석");
    {str2.equals(str2);}


    public static void main(String[] args) {
        Object o1 = new BookDto();
        Object o2 = new BoardDto();

        System.out.println(o1 + "|" + o2);
}
}
/*[문제 1] BookDto는 toString()을 오버라이딩하지 않고 BoardDto는 toString()을 오버라이딩하도록 만든 뒤 Object 타입
변수에 저장하여 두 객체를 하나의 출력문으로 출력했을 때 결과 차이가 나타나게 만드세요.
[출력예시]
day.BookDto@7cca494b | BoardDto{...}*/
class BookDto{ }
class BoardDto{
    @Override
    public String toString(){
        return "BoardDto{}";
    }
}

/*[문제 2] new String("유재석")으로 생성한 두 객체의 == 와 equals() 비교 결과를 하나의 출력문으로 나타나게 만드세요.
[출력예시]
== 비교:false, equals 비교:true
    */


/*[문제 3] Class 리플렉션

1. String 객체를 하나 생성하고 getClass()를 이용하여 클래스 타입 정보를 가져오세요.

2. Class.forName("java.lang.String")을 사용하여 String 클래스를 직접 로드하세요.

3. 로드된 Class 객체에서 getMethods()를 사용하여 메소드 개수를 구하세요.

4. 위 결과들을 하나의 출력문으로 나타나게 만드세요.

[출력예시]

class java.lang.String | forName 성공 | method count:90

*/


/*[문제 4] 문자열 "100"과 "3.14"를 각각 기본타입으로 변환하고 기본타입을 문자열로 변환하는 방법을 포함하여 하나의 출력문
으로 나타나게 만드세요.

[출력예시]

int:100, double:3.14, str1:"100", str2:"100"

*/


/*[문제 5] LocalDateTime.now()로 현재 날짜/시간을 생성하고 지정된 포맷으로 변환 후 +10일, -30일 계산 결과를 하나의 출
력문으로 나타나게 만드세요.

[출력예시]

현재:2025년 07월 25일 11:43:11 | +10일:2025-08-04T11:43:11 | -30일:2025-06-25T11:43:11
*/
