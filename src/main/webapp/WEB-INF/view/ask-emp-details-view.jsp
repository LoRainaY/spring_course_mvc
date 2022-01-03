<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Яна
  Date: 02.01.2022
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Dear Employee, Please enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    <!--к каждом форме срабатывает геттер, и первоначально
    значения null,null и 0. После нажатия кнопки типа submit
    вызываются сеттеры, которые устанавл. значения с форм-->
    Name: <form:input path="name"/><br> <!--к каждом форме срабатывает путтер-->
    Surname: <form:input path="surname"/><br>
    Salary: <form:input path="salary"/><br><br>

    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select><br><br>
    Witch car do you want?<br>
    <form:radiobutton path="carBrant" value="BMW"/>BMW
    <form:radiobutton path="carBrant" value="Audi"/>Audi
    <form:radiobutton path="carBrant" value="Toyota"/>Toyota<br><br>


    <input type="submit" value="OK"/>
</form:form>

</body>
</html>
