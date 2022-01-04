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
    <title>Spring MVC</title>
</head>
<body>

<h2>Dear Employee, Please enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    <!--к каждом форме срабатывает геттер, и первоначально
    значения null,null и 0. После нажатия кнопки типа submit
    вызываются сеттеры, которые устанавл. значения с форм-->
    Name: <form:input path="name"/> <!--к каждом форме срабатывает геттер-->
    <span style="color: red; "><form:errors path="name"/></span><!--устан. формы для вывода ошибки и измен. ее цвета-->
    <br><br>
    Surname: <form:input path="surname"/>
    <span style="color: red; "><form:errors path="surname"/></span> <!--устан. формы для вывода ошибки и измен. ее цвета-->
    <br><br>
    Salary: <form:input path="salary"/>
    <span style="color: red; "><form:errors path="salary"/></span>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select><br><br>
    Witch car do you want?<br><br>
    <form:radiobuttons items="${employee.carBrands}" path="carBrand"/><br><br>

    Foreign language:<br>
    <form:checkboxes path="languages" items="${employee.languageList}"/><br><br>

    Tel: <form:input path="phoneNumber"/> <!--к каждом форме срабатывает геттер-->
    <span style="color: red; "><form:errors path="phoneNumber"/></span><!--устан. формы для вывода ошибки и измен. ее цвета-->
    <br><br>

    <input type="submit" value="OK"/>
</form:form>

</body>
</html>
