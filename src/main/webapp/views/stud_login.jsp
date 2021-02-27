<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="commonCss.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-offset-5 col-md-4 text-center">
			<form action="Login-Controller" method="post" class="form-login">
				<br>
				<h4>Log In</h4>
				<br> <input type="text" name="id"
					class="form-control input-sm chat-input" placeholder="studentid" />
				<br> <br> <input type="password" name="password"
					class="form-control input-sm chat-input" placeholder="password" />
				<br>


				<div class="wrapper">
					<span class="group-btn"> <input class="bg-danger"
						type="submit"><i class="fa fa-sign-in"></i>
					</span> <br> <a href="studentreg.jsp"><span class="text-danger">
							Sign Up Here.. </span></a>
				</div>
				<div>
					<a href="#">Forgot your password?</a>
				</div>

			</form>
		</div>
	</div>

</div>
</body>
</html>