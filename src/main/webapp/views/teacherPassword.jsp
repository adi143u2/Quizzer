<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ include file="commonCss.jsp" %>  
<html>
<head>
    <title> Transparent Login Form Design </title>
    <link rel="stylesheet" type="text/css" href="/css/password.css">   
</head>
    <body>
    <div class="login-box">
    <img src="/images/avatar.png" class="avatar">
        <h1>Forget Password</h1>
        <c:if test="${q == 0 }">
						<div class="alert alert-danger">Email Not Verified</div>
					</c:if>
            <form action="teacher_mailverify" method="post">
            <p>Email</p>
            <input type="text" name="teacher_email" placeholder="Enter Your Email id">
            
            <input type="submit" name="submit" value="Submit">
            </form>
        
        
        </div>
    
    </body>
</html>
</html>