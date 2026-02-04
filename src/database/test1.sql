create database mydb0203; -- db 생성
use mydb0203; -- db 활성화/선택/사용

-- [1] 테이블 생성
-- create table 테이블명(속성명 타입 제약조건, 속성명 타입 제약조건 );
create table test1( 속성명 int );
-- [2] 테이블 목록 보기
-- show tables;
show tables;
-- 2개 이상의 속성명 정의한 테이블
create table test2( 속성명1 int, 속성명2 double);
-- [3] 테이블 삭제, drop table 테이블명; drop table/ database if exists 테이블/데이터베이스명
drop table test1;
-- [4] 테이블 간단 조회, select 속성명1, 속성명2 from 테이블명; select * from 테이블명;
select * from test2;
-- [5] 다양한 데이터타입의 테이블 생성
create table test3(
정수속성1 tinyint, 정수속성2 smallint , 정수속성3 mediumint , 
정수속성4 int, 정수속성5 bigint, 정수속성6 int unsigned, -- signed부호있음(+-) unsigned(부호없음)
실수속성1 float, 실수속성2 double, 실수속성3 decimal, -- decimal 문자타입으로 실수표현(오차 x/ 부동소수점X)
날짜속성 date, 시간속성 time, 날짜시간속성 datetime,
문자속성1 char(5), -- 고정길이의 문자타입, char(5) -> "유재석" -> [유][재][석][][] 2칸이 남는다.
문자속성2 varchar(5), -- 가변길이의 문자타입, varchar(5) -> "유재석" -> [유][재][석] x x 남은 2칸 삭제된다. 
문자속성3 text , 문자속성4 longtext , -- 4G 대용량
논리속성 bool -- true/false, tinyint 취급, 1 또는 0
);
select * from test3;

