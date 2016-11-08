<%--
  Created by IntelliJ IDEA.
  User: xavi
  Date: 7/11/16
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Reading Cookies Example</title>
    </head>


    <body bgcolor="#f0f0f0">



        <c:if test="${ cookiesArray.size() > 0 }">
            <h2> Found Cookies Name and Value</h2>
            <c:forEach items="${cookiesArray}" var="name">
                <c:out value="${name.name}"/>
                <c:out value="${name.value}"/>
                <p>hola</p>
                <br/>
            </c:forEach>
        </c:if>

        <c:if test="!${cookies}">
            <h2>No cookies founds</h2>
        </c:if>

    </body>
</html>
