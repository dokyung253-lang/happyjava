package day25;

public class Phone {
    int price;
    /*  클래스 기본 포맷.(초기엔 작성하기)
        1. 멤버변수 - 속성
        2. 생성자
        3. 멤버변수 - 메소드
         */
    // 오버로드 = 매개변수에 따라 함수명 똑같은 것에 매개변수만 다른 여러개의 함수를 생성하는 것
    // 오버로드에는 규칙&순서가 들어가고, 중요하다.
    // 1. 멤버변수 - 속성
    String model;
    String color;
    // 2. 생성자
        // 1. 클래스명 동일하게 생성자명 작성한다.
    Phone(){}
        // 2. ( )안에 매개변수 정의한다.
        // 3. 메소드와 다른점은 반환타입 없다.
        Phone(String model, String color){
            this.model = model;
            this.color = color;}
        // 4.
    Phone(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = (int)(price * 0.8); // 20% 할인
    }
    // 3. 멤버함수 - 메소드

}
