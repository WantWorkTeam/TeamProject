

-- 게시판 테이블 생성
create table board01(
    board_id number(20) primary key, --게시판 글번호
    title varchar2(100), --게시판 제목
    writer varchar2(20), --게시판 작성자
    content varchar2(1000), --게시판 글 내용
    regdate date default sysdate, -- 게시판 등록시간
    hit number(10) default 0  -- 게시판 조회수
);

-- 게시판 sequence (글 번호 증가 및 갱신)
create sequence board01_seq start with 1 increment by 1;


select * from board01;