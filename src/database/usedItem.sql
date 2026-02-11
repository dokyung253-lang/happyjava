drop database if exists usedItem;
create database usedItem;
use usedItem;
create table usedItem(
    orderNum int auto_increment, 
    constraint primary key(orderNum),
    mname varchar(10),
    pname varchar(50),
	content varchar(100),
    price bigint ,
    pw varchar(10),
    phoneNum varchar(11),
    orderdate datetime default now(),
    sold bool default true
    );
    INSERT INTO usedItem (orderNum, mname, pname, content, price, pw, phoneNum, sold) VALUES
(1, '포근이', '중고 곰인형', '세탁 완료된 깨끗한 곰인형입니다.', 15000, '1234', '01012345678', false),
(2, 'IT매니아', '기계식 키보드', '청축이라 타건감 좋아요. 박스 풀구성.', 45000, '5566', '01098765432', false),
(3, '운동왕', '덤벨 10kg 세트', '이사 가느라 싸게 내놓습니다. 직거래 희망.', 20000, '0000', '01011112222', true),
(4, '북러버', '자바 프로그래밍 입문', '거의 새 책입니다. 밑줄 없어요.', 18000, '4321', '01022223333', false),
(5, '캠핑족', '경량 캠핑 의자', '2회 사용. 가볍고 튼튼해요.', 35000, '1111', '01044445555', false),
(6, '애플빠', '에어팟 프로 1세대', '오른쪽 유닛 노이즈 캔슬링 살짝 이상함.', 50000, '8888', '01066667777', true),
(7, '요리사', '에어프라이어 5L', '용량이 커서 닭 한 마리 통째로 들어갑니다.', 30000, '9999', '01088889999', false),
(8, '미니멀', '이케아 탁상 스탠드', '심플한 디자인의 스탠드입니다.', 12000, '1357', '01077778888', false),
(9, '게이머', 'PS5 듀얼센스', '스틱 쏠림 현상 전혀 없습니다.', 55000, '2468', '01055556666', false),
(10, '자전거왕', '알루미늄 자전거 펌프', '휴대하기 좋고 공기 주입 잘 됩니다.', 8000, '7777', '01033334444', true);
select * from usedItem ;