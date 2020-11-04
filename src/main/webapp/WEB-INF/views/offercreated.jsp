<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <style type="text/css">@import url("${pageContext.request.contextPath}/resources/css/main.css");</style>
    <link rel=stylesheet" href="main.css">
</head>

<body>

${offer.name} 가 새로운 제안을 하였습니다. </br>

<a href="${pageContext.request.contextPath}/offers"> click here to view current offers </a>

</body>


</html>