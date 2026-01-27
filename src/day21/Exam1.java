package day03;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 조건문 if, 만약에~, 경우의 수
        int 온도 = 5;
        if (온도 <= 10) {System.out.print("외투를입는다.");}

        //(2) if(조건문) {실행문; 실행문;}
        int 나이 = 10;
        if (나이 >= 19) {
            System.out.println("성인입니다.");
            System.out.println("19세입니다.");
        }

        //(3) if(조건문) {실행문; } else{실행문;}
        boolean 회원검사 = false;
        if (회원검사 == true) {
            System.out.println("안녕하세요 회원님:");
        } else {
            System.out.println("비회원입니다.");
        }
        //(4)
        int 자갑돈 = 1750;
        if (자갑돈 >= 3000) {
            System.out.println("택시를탄다.");
        } else if (자갑돈 >= 1700) {
            System.out.println("버스를 탄다.");
        } else if (자갑돈 >= 1700) {
            System.out.println("전동자전거 탄다.");
        } else {
            System.out.println("걸어간다.");
        }
        // ㅅ: 여러 조건에 따른 하나의 실행문 갖는다. vs V: 여러 조건에 따른 여러 실행문 갖는다.
        if (자갑돈 >= 3000) {
            System.out.println("택시를탄다.");
        }
        if (자갑돈 >= 1700) {
            System.out.println("버스를탄다.");
        }
        if (자갑돈 >= 1700) {
            System.out.println("전동자전거탄다.");
        }
        if (자갑돈 < 1200) {
            System.out.println("걸어간다.");
        }

        // (5) if 중첩
        int age = 25;
        char gender = 'w'; //여자
        if (age >= 19) {
            System.out.println("성인");
            if (gender == 'w') { // 문자비교 == vs 문자열비교 .equals
                System.out.println("성인여자");
            } else {
                System.out.println("미성년자");
            }
        }
        // (6) switch : 논리검사 보다는 값에 따른 흐름제어 사용
        char grade = 'B';
        switch (grade) {// switch에 '등급'을 대입하고
            case 'A': // 만일 A등급이면               *case가 일치하면 실행된다. 아래 case 모두 실행한다.
                System.out.println("우수 학생");
                break; // switch를 탈출한다.
            case 'B': // 만일 B등급이면
                System.out.println("장려 학생");
                break;
            default:
                System.out.println("학생"); // 그 외
        }
        // (7) switch 활용
        int adult = 1;
        char gender2 = 'W';
        switch (adult) {
            case 1 :
            System.out.println("성인");
            switch (gender2) {
                case 'w':
                    System.out.println("성인여자");
                    break;
                case 'm':
                    System.out.println("성인남자"); //마지막 case에서는 break 생략 가능
            }
            break;
            default:
                System.out.println("미성년자");
                break; // 마지막 case에서는 break 생략 가능
        } // if = 조건에 따른 논리 검사 실행( 범위 경우의수) , switch = 어떠한 값에 따른 흐름제어( 정해진 경우의수)
    }
    }
