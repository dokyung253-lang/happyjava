package day14;

public class Exam3 {
    public static void main(String[] args) {

        // [ 동기화 vs 비동기화 ], 메소드들은 비동기화 상태이다.
        /* [ 동기화 ]
            1. 정의 : 메소드/기능에 Lock(락) 사용하여 메소드를 점령하는 상태
            2. 목적 : 서로 다른 여러 스레드가 동시에 하나의 메소드에 사용한다면 충돌 발생할 수 있다.
            3. 비교
                동기화                     비동기화
                처리순서 보장             처리순서 보장 X
                주문 순으로 음료 나감      먼저 제조된 순서대로 음료 나감
            4. 사용법
         */

        // 1) 계산기(Calculator) 객체 생성
        Calculator calculator = new Calculator();
        // 2) 스레드A(UserA)
        UserA threadA = new UserA();
        threadA.calculator = calculator;
        // 3) 스레드B(UserB)
        UserB threadB = new UserB();
        threadB.calculator = calculator;
        // * 2개의 스레드가 동일한 Calculator 객체를 멤버변수로 갖는 예제
        threadA.start();
        threadB.start();
    }// main end
}// class end
class Calculator{
    public int memory; // 멤버변수 // 계산기가 갖는 값
    // public void setMemory( int memory ){ // 비동기 메소드
    public synchronized void setMemory( int memory ){ // synchronized 동기화메소드
        this.memory = memory; // this란? 현재 메소드를 실행한 객체라는 뜻 // 멤버변수명 과 매개변수명이 같을 때 식별용
        try {Thread.sleep(2000);} // 2초간 스레드 일시정지
        catch (Exception e){}
        System.out.println( Thread.currentThread().getName());
        System.out.println(" 결과 : "+ this.memory );
    }
}
// 2개의 스레드가 동일한 계산기의 객체를 갖는 예제
class UserA extends Thread{
    Calculator calculator;
    @Override public void run(){
        calculator.setMemory(100); // Calculator에 100 넣기
    }
}
class UserB extends Thread {
    Calculator calculator;

    @Override
    public void run() {
        calculator.setMemory(200); // Calculator에 200 넣기
    }
}
