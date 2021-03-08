
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="commonCss.jsp" %> 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/login.css">
<style type="text/css">
body{
    margin: 0;
    padding: 0;
    background: url("/images/img4.jpg");
    background-size: cover;
    background-position: center;
    font-family: sans-serif;
}
</style>
</head>
<body>
	<div class="login-box">
		<img src="/images/avatar.png" class="avatar">
		<h1>Login Here</h1>
		    <c:if test="${q == 0 }">
						<div class="alert alert-success">Registration Successfull</div>
					</c:if>
		<form action="/teacher/teacher_login" method="post" class="form-login">
			<p>User Name</p>
			<input type="text" name="teacher_username"
				placeholder="Teacher User Name">
			<p>Password</p>
			<input type="password" name="teacher_password"
				placeholder="Enter Password"> <input type="submit"
				name="submit" value="Login"> <a href="teacher_register">Sign
				Up here</a> <br /> <br /> <a href="teacher_password">Forgot your
				password?</a>
		</form>


	</div>
</body>
</html>

