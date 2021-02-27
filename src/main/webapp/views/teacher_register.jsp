<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="commonCss.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Registartion</title>
<style type="text/css">

body {
    background-image:url("/finalproject/images/img3.jpg");
    background-position:center;
    background-size:cover;
    
    -webkit-font-smoothing: antialiased;
    font: normal 14px Roboto,arial,sans-serif;
  }
  
  .container {
      padding: 110px;
  }
  ::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
      color: #ffffff!important;
      opacity: 1; /* Firefox */
      font-size:18px!important;
  }
  .form-login {
      background-color: rgba(0,0,0,0.55);
      padding-top: 10px;
      padding-bottom: 20px;
      padding-left: 20px;
      padding-right: 20px;
      border-radius: 15px;
      border-color:#d2d2d2;
      border-width: 5px;
      color:white;
      box-shadow:0 1px 0 #cfcfcf;
  }
  
  .form-control{
      background:transparent!important;
      color:white!important;
      font-size: 18px!important;
  }
  h1{
      color:white!important;
  }
  h4 { 
   border:0 solid #fff; 
   border-bottom-width:1px;
   padding-bottom:10px;
   text-align: center;
  }
  
  .form-control {
      border-radius: 10px;
  }
  .text-white{
      color: white!important;
  }
  .wrapper {
      text-align: center;
  }
  .footer p{
      font-size: 18px;
  }

</style>
</head>

<body>
<div class="container">
	<div class="row">
		<div class="col-md-offset-5 col-md-4 text-center">
			<form action="Teacher_register" method="post" class="form-login">
				<br>
				<h4>Sign Up</h4>
				<br>
				<div class=row>
					<div class=col-6>
						<input type="text" name="teacher_fname"
							class="form-control input-sm chat-input" placeholder="firstname" />
					</div>
					<div class=col-6>
						<input type="text" name="teacher_lname"
							class="form-control input-sm chat-input" placeholder="lastname" />

					</div>
				</div>
				<br>
				<br> <input type="email" name="teacher_email"
					class="form-control input-sm chat-input" placeholder="email" /> <br>
				<br> <input type="password" name="teacher_password"
					class="form-control input-sm chat-input" placeholder="password" />
				<br>
				<br> <input type="password" name="confirmpass"
					class="form-control input-sm chat-input"
					placeholder="Confirmpassword" /><br>

				<div class="wrapper">
					<span class="group-btn"> <input class="bg-danger"
						type="submit"><i class="fa fa-sign-in"></i>
					</span> <br> <a href="teacherlogin.jsp"><span class="text-danger">
							Login Here.. </span></a>
				</div>


			</form>
		</div>
	</div>

</div>
</body>
</html>