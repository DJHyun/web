create table board(
	board_id number primary key,
	board_title varchar2(30) not null,
	board_date date not null,
	board_content varchar2(500) not null,
	board_score	  number not null,
	board_reference number not null,
	member_id varchar2(20) not null,
	movie_id number not null
	);