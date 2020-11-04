<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Offers</title>
</head>

<body>
<h1>Offers</h1>

    <c:forEach var="offer" items="${offers}">
        <p>
            <c:out value="${offer}"></c:out>
        </p>
    </c:forEach>
</body>


</html>