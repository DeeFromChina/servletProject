<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%-- <%@include file="/common/header.jsp"%> --%>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<style>
</style>
</head>
<script language="javascript">
</script>
<body>
<h1>123</h1>
<form action="/javaWebTestProject/helloClass123" method="post">
<input type="text" name="name"/>
<br>
<input type="password" name="password"/>
<input type="submit" value="post"/>
</form>
<form action="/javaWebTestProject/helloClass123" method="get">
<input type="text" name="name"/>
<br>
<input type="password" name="password"/>
<input type="submit" value="post"/>
</form>
</body>
</html>