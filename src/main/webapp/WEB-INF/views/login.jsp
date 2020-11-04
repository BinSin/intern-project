<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Login Page</title>
</head>
<body>
<div class="container">
    <c:url value="/login" var="loginUrl"/>
    <form action="${loginUrl}" method="post">       1
        <c:if test="${param.error != null}">        2
            <p>
                Invalid username and password.
            </p>
        </c:if>
        <c:if test="${param.logout != null}">       3
            <p>
                You have been logged out.
            </p>
        </c:if>
        <p>
            <label for="username">Username</label>
            <input type="text" id="username" name="username"/>	4
        </p>
        <p>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>	5
        </p>
        <input type="hidden"                        6
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <button type="submit" class="btn">Log in</button>
    </form>
</div>
</body></html>