<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>main</head>
<%@include file="head.jsp" %>
<body>
<h2>Hello World!</h2>
<h3>mian.jsp</h3>
<h4><%=System.currentTimeMillis()%>
</h4>
<div>${name}</div>
<div><t:message code="username.label"/></div>
<div><t:message code="password.label"/></div>
<div><t:message code="hello.label"/></div>
<div>${message}</div>
</body>
</html>
