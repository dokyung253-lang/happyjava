package day23;

import java.util.Arrays;

public class Exam1 {
    public static void main(String [] args){
        // [1] 배열이란? *동일한 타입*의 여러 자료들을 순서대로  저장하는 자료 타입
        // [2] 선언 : 타입[] 변수명 = new 타입 [총 개수];
        // [3] 특징 : (1) *(중요)동일한 타입끼리* (2) 고정 길이 (3) 요소의 초기값 존재
        // [4] 인덱스란? 배열내 요소(값)들이 저장된 순서 번호, 0번 시작
        int[] arr1 = new int[3];
        String[ ] arr2 = {"봄", "여름", "가을", "겨울"}; // { 초기값1, 초기값2, 초기값3, 초기값4}
        // [5] 배열변수의 출력
        System.out.println( arr1 ); // [I@4c873330 : 배열의 주소(메모리 위치)값 출력   *주소값은 개발자가 지정 불가.
        System.out.println( arr2 ); // [Ljava.lang.String;@119d704]
        //[6] 배열변수의 요소/값 전체 출력, Arrats.toString( 배열변수명 );
        System.out.println( Arrays.toString( arr1 )); // [0, 0, 0]
        System.out.println( Arrays.toString( arr2 )); // [봄, 여름, 가을, 겨울]
        // [7]  배열 사용
        System.out.println( arr1.length ); // 배열변수명.length : 배열의 총길이 = 3
        // [8] 배열의 요소값 수정
         arr1[0] = 10; // 배열변수명[인덱스] 새로운값;
        System.out.println( arr1[0]); // 배열변수명[인덱스]
        arr2[1] = "spring";
        System.out.println( arr2[1]);
        // [9] 배열의 요소 추가/ 삭제 없다.
        // arr1[4] 40; //

        // [10] 반복문 활용
        for( int index = 0; index <= arr1.length-1 ; index++){ // index는 0부터 마지막 인덱스 이하까지 1씩 증가한다.
            System.out.println( arr1[ index ]); // [index]번쨰 요소값 가져오기/ 출력
        } // for end
        // [11] 향상된 for 문 : 위와 같이 많이 사용되므로 추가된 *반복문*,
        // for( 타입 반복변수 : 배열변수명 ){} , 이터레이터(iterator; 반복자; 순회자)가 가능한 배열/ 객체만 사용 가능
        for( int value : arr1 ){
            System.out.println(value);
        }

        // G : 쓰레기 C: 수집가 ; 비어있는 메모리 삭제. 따라서 비어있는 주소값에 임의의 초기값을 생성한다.
        // 비어있을때의 초기값 = 정수는 0, 실수는 0.0, 문자열은 null, 논리는 false가 들어감

    }// main end
}// class end
