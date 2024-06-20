﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*, java.text.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<!DOCTYPE HTML>
<html>
<head>
<link rel='stylesheet' href="<c:url value='/css/styles.css' />"  type='text/css' />
<meta charset="UTF-8">
<title>顯示伺服器的時間</title>
</head>
<body>
<div align='center'>
伺服器的時間為${now}<br>
<hr>
<font style="font-size:16px;">
伺服器時間是由控制器算出，存入Model後再轉交給serverTime.jsp，以EL取出控制器送回的資料<br>
本回應由 /WEB-INF/views/ch01/serverTime.jsp送出<br>
</font>
<br>
<hr>
<small>&lt;&lt;<a href="<c:url value='/ch01/index' />">回第一章首頁</a>&gt;&gt;</small>
</div>
</body>
</html>
<!--      ch01\hello.jsp    -->