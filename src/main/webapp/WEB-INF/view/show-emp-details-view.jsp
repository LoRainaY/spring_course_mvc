<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Яна
  Date: 02.01.2022
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear Employee, you are WELCOME!!!</h2>
<br>
<br>
<br>

Your name: ${employee.name}<br>
Your surname: ${employee.surname}<br>
Your salary: ${employee.salary}<br>
Your department: ${employee.department}<br>
Your car: ${employee.carBrand}<br>
Language(s):
<ul>
<c:forEach var="lang" items="${employee.languages}">
    <li>${lang}</li>
</c:forEach>

</ul><br>
Your phone number: ${employee.phoneNumber}<br>
Your email: ${employee.email}<br>
</body>
</html>
