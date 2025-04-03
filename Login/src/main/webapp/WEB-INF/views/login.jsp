<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- html xml:th="https://www.thymeleaf.org"--%>
<%--
jsp 에서 자바변수를 사용하는 방법은 <% %> 태그를 이용하거나 ${}형태를 사용하는 방법 존재

EL Expression Language 표현언어



--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
JSP 에서 반복과 조건, 데이터 관리 포멧, XML조작, 데이터베이스 엑세스와 같은 역활을 원활히 수행할 수 있도록 제공하는 라이브러리


--%>
<html>
<head>
    <title>로그인</title>
</head>
<body>
<%--
자바코드는 body태그 안애 주로 작성


--%>
<%
    String msg = "환영합니다! 로그인 해주세요.";
    int num = 25;

%>
<h3><%= msg %>
</h3>
<%= num %>


<%
    // 숫자 변수 선언
    int num1 = 10;
    int num2 = 5;

    // 계산
    int sum = num1 + num2;
    int product = num1 * num2;


    // 조건문
    String result = "";

    if(num1 > num2) {
        result = "num1 이 num2 보다 큽니다.";
    }
%>
<h2>숫자 계산 결과</h2>
<p>num1 : <%= num1 %>  </p>
<p>num2 : <%= num2 %>  </p>
<p>합계 : <%= sum%>    </p>
<p>곱   : <%= product%></p>
<p>결과 : <%= result%> </p>





<h3><%= msg%> </>
<h2>로그인</h2>
<form name="loginFrm" action="/login.do" method="POST">
    <input type="text" name="userId" required placeholder="아이디"><br>
    <input type="password" name="userPw" required placeholder="비밀번호"><br>
    <input type="submit" value="로그인">
    <input type="reset" value="취소">
</form>
</body>
</html>