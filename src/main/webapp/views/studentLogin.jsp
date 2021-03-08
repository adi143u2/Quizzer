<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="commonCss.jsp" %> 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="/css/login.css">  
 <style>
 body{
    margin: 0;
    padding: 0;
    background: url("/images/img3.jpg");
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
           <form action="student_dashboard" method="post" class="form-login">
            <p>Student Id</p>
            <input type="text" name="stud_rollno" placeholder="studentid">
            <p>Password</p>
            <input type="password" name="stud_password" placeholder="Enter Password">
            <input type="submit" name="submit" value="Login">
             <a href="stud_register">Sign Up Here</a> 
             <br> <br>
            <a href="stud_forgetpass">Forget Password</a>    
            </form>
        
        
        </div>
</body>
</html>

