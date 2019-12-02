<%--
  Created by IntelliJ IDEA.
  User: 一只欢乐的小孽畜
  Date: 2019/11/27 0027
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生新增</title>
    <%@include file="head.jsp" %>
</head>
<body>
<h1>学生新增<%=System.currentTimeMillis()%></h1>
<div>${classList}</div>
<f:form action="${ctx}/stu/add" modelAttribute="student" method="post">
    <p>编号:<f:input path="sid"/></p>
    <p>姓名:<f:input path="sname"/></p>
    <p>年龄:<f:input path="age"/></p>
    <p>备注:<f:input path="remark"/></p>
    <input type="submit" value="确定">
</f:form>
</body>
</html>
