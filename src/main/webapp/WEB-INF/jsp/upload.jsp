<%--
  Created by IntelliJ IDEA.
  User: 一只欢乐的小孽畜
  Date: 2019/11/28 0028
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
    <%@include file="head.jsp" %>
</head>
<body>
<h1>文件上传</h1>
<form action="${ctx}/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="上传">
</form>
<h1>多文件上传</h1>
<form action="${ctx}/upload2" enctype="multipart/form-data" method="post">
    <input type="file" name="files"><br/>
    <input type="file" name="files"><br/>
    <input type="file" name="files"><br/>
    <input type="submit" value="上传">
</form>
</body>
</html>
