<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>

<body>
<h1>Hello world!</h1>
<p>테스트 = ${serverTime}.</p>
<br><br>
<p> <a href="${pageContext.request.contextPath}/offers"> Show current Offers</a> </p>

</body>


</html>