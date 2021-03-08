<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/css/register.css">
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
		<h1>Register Here</h1>
		<form method="post" action="studregister2" class="form-login">
		
			<input type="text" name="stud_fname" id="stud_fname" placeholder="Enter Your Firstname">
			<input type="text" name="stud_lname" id="stud_lname" placeholder="Enter Your Lastname">
			<input type="email" name="stud_email" id="stud_email" placeholder="Enter Your Email">
				<input type="text" name="stud_mobile" id="stud_mobile" placeholder="Enter Your Mobile">
					
			<input type="password" name="stud_password" id="stud_password" placeholder="Enter Your Password">
				<input type="password" name="confirmpass" name="confirmpass" placeholder="Confirm Your Password">
			<input type="submit" name="submit" value="Register"> <a href="stud_login">Login Here</a>
		</form>


	</div>
</body>
<script type="text/javascript">
function studReg()
{
alert("Button Pressed");
}

</script>
</html>


