<%--
  Created by IntelliJ IDEA.
  User: rlaud
  Date: 2022-10-30
  Time: 오전 8:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!-- EL의 param이라는 지정된 객체를 이용해 전달된 파라미터를 쉽게 추출할 수 있다. -->
    <h1>NUM1 ${param.num1}</h1>
    <h1>NUM2 ${param.num2}</h1>

    <!--웹의 파라미터는 모두 문자열이므로 형변환 필요 -->
    <h1>SUM ${Integer.parseInt(param.num1)+Integer.parseInt(param.num2)}</h1>
</body>
</html>
<!--
    JSP의 제한적인 사용방법
    1. JSP에서 쿼리 스트링이나 파라미터를 처리하지 않는다. - JSP 대신에 서블릿을 통해서 처리
    2. JSP는 입력 화면을 구성하거나 처리 결과를 보여주는 용도로만 사용한다.
    3. 브라우저는 직접 JSP 경로를 호출하지 않고 서블릿 경로를 통해서 JSP를 보는 방식으로 사용한다.
-->