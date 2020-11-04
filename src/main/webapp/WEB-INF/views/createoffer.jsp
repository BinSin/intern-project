<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <style type="text/css">@import url("${pageContext.request.contextPath}/resources/css/main.css");</style>
    <link rel=stylesheet" href="main.css">
</head>

<body>

<sf:form method="post" action="${pageContext.request.contextPath}/docreate" modelAttribute="offer">
    <table class="formtable">
        <tr> <td class="label"> Name : </td> <td> <sf:input class="control" type="text" path="name"/> <br/>
            <sf:errors path="name" class="error" /> </td> </tr>
        <tr> <td class="label"> Email : </td> <td> <sf:input class="control" type="text" path="email"/> <br/>
            <sf:errors path="email" class="error" /> </td> </tr>
        <tr> <td class="label"> Offer : </td> <td> <sf:textarea class="control" path="text" /> <br/>
            <sf:errors path="text" class="error" /> </td> </tr>
        <tr> <td class="label"> </td> <td> <input class="control" type="submit" value="새 제안"/> </td> </tr>
    </table>
</sf:form>

</body>


</html>