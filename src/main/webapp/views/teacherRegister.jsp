<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    

<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Registartion</title>
<link rel="stylesheet" type="text/css" href="/css/register.css">
<style>
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
		<h1>Register Here</h1>
	<form action="teacher_register" method="post" class="form-login">
		
			<input type="text" name="teacher_fname" id="teacher_fname" placeholder="Enter Your Firstname">
			<input type="text" name="teacher_lname" id="teacher_lname" placeholder="Enter Your lastname">
			<input type="email" name="teacher_email" id="teacher_email" placeholder="Enter Your Email">
				<input type="text" name="teacher_username" id="teacher_username" placeholder="Enter Yoour User Name">
					
			<input type="password" name="teacher_password" id="teacher_password" placeholder="Enter Your Password">
				<input type="password" name="confirmpass" name="confirmpass" placeholder="Confirm Your Password">
			<input type="submit" name="submit" value="Register"> <a href="teacher_login">Login Here</a>
		</form>


	</div>
</body>
</html>

