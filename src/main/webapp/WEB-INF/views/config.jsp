<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Config</title>
    </head>
    <body>
        <h1>Spring Beans:</h1>
        <c:if test="${not empty beans}">
           <table border=1>
           <c:forEach items="${beans}" var="bean">
              <tr> <td>${bean} </td></tr>
           </c:forEach>
           </table>
        </c:if>
    </body>
</html>
