package day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam4 {
    public static void main(String[] args) {
        /*Thread Pool
            1. 정의 : 미리 일정개수의 Thread를 생성하고 필요에 따라 재사용하는 방식
            2. 목적 : 작업이 들어올때마다 새로운 스레드가 아닌 기존스레드 이용한다.
            3. 효과 : Thread 재사용, 자원효율성, 서버과부하 방지 등등
            4. 구조 : '큐'라는 자료구조를 배치하여, 스레드풀에서 (현재 놀고있는)스레드 선입선출
            5. 예시 : <콜센터>
                               직원1(유재석; 스레드)
                콜요청 -->      직원2(강호동; 스레드)
                               직원3(신동엽; 스레드)
               * 콜 2개 요청 -> 2명 배정, 직원 1명 대기
               * 콜 5개 요청 -> 3명 배정, 콜요청 2개 대기
            6. 사용처 : 1) 서버프로그램(톰캣) 2) JDBC 3) 채팅 3) 대기프로그램 4) SPRING프레임워크
            7. 사용법
                1) ExecutorService executorService = Executors.newFixedThreadPool( 총스레드 갯수);
                2) executorService.submit(스레드객체);
                3)
         */
        // [1] 작업스레드 배정/만들기 , 3 = 3개 단위로 스레드가 실행됨
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // [2] 여러스레드를 만들어서 각 스레드들을 작업스레드풀에 등록하기
        for( int i = 1; i <= 10; i++ ){
            String name = "Thread" + i; // 스레드 이름 배정
            // [3] 작업스레드 생성
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try{ Thread.sleep(2000);}catch (Exception e){}
                    System.out.println("작업중인 스레드: " + name);
                }
            };
            // [4] 생성된 작업스레드를 스레드풀에 등록한다.
            executorService.submit( runnable ); // 만약 스레드풀에 대기중인 스레드 있으면 실행, 아니면 대기
            }// for end
        // [5] 스레드풀 종료( 스레드풀에 있는 모든 스레드 안전하게 종료)
        executorService.shutdown();
        }// main end
    }// class end

