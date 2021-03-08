<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="commonCss.jsp" %>  
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title> Transparent Login Form Design </title>
    <link rel="stylesheet" type="text/css" href="/css/password.css">  
</head>
    <body>
    <div class="login-box">
    <img src="/images/avatar.png" class="avatar">
        <h1>Forget Password</h1>
        <c:if test="${q == 0}">
						<div class="alert alert-danger">Email Not Verified</div>
					</c:if>
            <form action="student_mailverify" method="post">
            <p>Email</p>
            <input type="text" name="stud_email" placeholder="Enter Your Email id">
            <div class="d-grid gap-2 d-md-flex justify-content-md-end">
         
          </div>
              <br>
              <br>
          
            <input type="submit" name="submit" value="Verify">
            </form>
        
        
        </div>
    
    </body>
</html>