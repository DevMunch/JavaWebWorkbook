<%--
  Created by IntelliJ IDEA.
  User: rlaud
  Date: 2022-10-30
  Time: 오전 6:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calc/makeResult" method="post">
    <input type="number" name="num1">
    <input type="number" name="num2">
    <button type="submit">SEND</button>
</form>
</body>
</html>
<!--
GET
- 주용도 : 조회
- 구성 : URL 뒤의 '?'와 쿼리 스트링
- 효과 : 사용자가 손쉽게 사용할 수 있는 링크를 제공할 수 있다.
- 브라우저에 따라 길이의 제한
- URL 뒤의 쿼리 스트링으로 모든 정보가 전달되는 단점
- 쿼리 스트링 길이에 대한 제한(일반적으로 2kb 브라우저마다 차이가 있다.
POST
- 주용도 : 등록 / 수정/ 삭제와 같은 처리
- 구성 : URL 전달 수 HTTP 몸체(Body)로 쿼리 스트링
- 효과 : 단순 조회가 아니라 원하는 작업을 처리할 수 있게 된다.
- GET 방식에 비해서 많은 양의 데이터를 전송한다.
- 주소창만으로는 테스트가 어렵다.
-->