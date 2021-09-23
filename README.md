# mybatis_pratice
스프링 부트와 마이바티스 연습

https://start.spring.io/

+ Project
  + Build : Gradle
  + Language : Java
  + Spring Boot : 2.5.4
  + Dependencies : Spring Web, Thymeleaf, Lombok, MyBatis Framework, MySQL Driver
  
+ 목표
  + 마이바티스를 이용하기
  + 웹 화면에 DB에서 가져온 데이터 표시하기

1. DB 생성 및 테이블 생성
    1. mybatistest db 생성
    2. testtable 테이블 생성(id와 name 칼럼만 생성)
    
2. 설정
    1. application.properties 설정
        1. spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
        2. spring.datasource.url=jdbc:mysql://(주소)/(databases)?serverTimezone=UTC&characterEncoding=UTF-8
        3. spring.datasource.username=(아이디)
        4. spring.datasource.password=(비밀번호)
        5. mybatis.mapper-locations=classpath:(mapper 위치)
    
3. mapper 패키지 생성
    1. mapper 인터페이스와 dto 클래스 생성
    
4. mapper.xml 생성
    1. resources/mappers/ 에 mapper.xml 생성
   ~~~
   <mapper namespace="testgroup.sj.mapper.IdNameMapper">
           namespace는 Mapper 클래스 위치
           <select id="getIdName" resultType="testgroup.sj.mapper.IdNameModel">
           id는 method 이름, resultType는 DTO 위치
               SELECT * FROM mybatistest.testtable;
           </select>
           </mapper>
   ~~~

5. controller 생성
    1. controller 패키지에 controller 클래스 생성

6. service 생성
    1. service 패키지에 service 클래스 생성
    

    
7. html 생성
    1. templates 아래에 html 생성
    
