<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="commonCss.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

/*author:starttemplate*/
/*reference site : starttemplate.com*/
body {
    background-image:url("/finalproject/images/img5.jpg");
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
<div class="container" >
    <div class="row">
        <div class="col-md-offset-5 col-md-4 text-center">
              <form method="post" action="studregister2" class="form-login"><br>
                <h4>Sign Up</h4>
                <br>
                <div class=row>
                <div class=col-6>
                <input type="text" name="stud_fname" id="stud_fname" class="form-control input-sm chat-input" placeholder="firstname"/>
                </div>
                 <div class=col-6>
                 <input type="text" name="stud_lname" id="stud_lname" class="form-control input-sm chat-input" placeholder="lastname"/>
                 
                 </div>
                </div><br><br>
                                <input type="email" id="stud_email" name="stud_email" class="form-control input-sm chat-input" placeholder="email"/>
                <br><br>
                <input type="text" name="stud_mobile" id="stud_mobile" class="form-control input-sm chat-input" placeholder="mobile"/>
                <br><br>
                <input type="password" name="stud_password" id="stud_password" class="form-control input-sm chat-input" placeholder="password"/>
                <br><br>
				<input type="password" name="confirmpass" class="form-control input-sm chat-input" placeholder="Confirmpassword"/>
                
            <br>    <div class="wrapper">
                        <span class="group-btn">
                            <input class="bg-danger"  type="submit"><i class="fa fa-sign-in"></i>
                        </span>
                        <br> <a href="studentlogin.jsp"><span class="text-danger">
                        	Login Here..
						</span></a>
                </div>
               
              
            </form>
        </div>
    </div>
  
</div>
</body>
<script type="text/javascript">
function studReg()
{
alert("Button Pressed");
}

</script>
</html>