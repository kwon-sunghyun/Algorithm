SELECT ANIMAL_ID, NAME, Date_format(DATETIME, '%Y-%m-%d') as '날짜' FROM ANIMAL_INS 
    ORDER BY 1 ##문제에 들어온 날짜1를 조회하는 있다.
               ##Order by 1의 의미는 테이블의 컬럼순서 번호이다.컬럼순서는 1부터 시작한다.