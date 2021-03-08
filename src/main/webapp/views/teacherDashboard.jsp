<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  <%@ include file="commonCss.jsp" %> 
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Dashboard</title>
	<link rel="stylesheet" href="/css/dashboard.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
	
	
</head>
<body>

<div class="wrapper">
    <div class="sidebar">
        <h2>QUIZZER</h2>
        <ul>
            <li><a href="#"><i class="fas fa-home"></i>Dashboard</a></li>
            <li><a href="/teacher/teacher_newquiz"><i class="fas fa-plus"></i>New Quiz</a></li>
            <li><a href="#"><i class="fas fa-edit"></i>Teacher</a></li>
            <li><a href="#"><i class="fas fa-chart-line"></i>Results</a></li>
            <li><a href="#"><i class="fas fa-graduation-cap"></i>Courses</a></li>
            <li><a href="#"><i class="fas fa-users"></i>Student</a></li>
            <li><a href="#"><i class="fas fa-user-alt"></i>Account</a></li>
            <li><a href="#"><i class="fas fa-question-circle"></i>Help</a></li>
            
        </ul> 
        <div class="social_media">
          <a href="https://www.facebook.com/"><i class="fab fa-facebook-f"></i></a>
          <a href="https://www.twitter.com/"><i class="fab fa-twitter"></i></a>
          <a href="https://www.instagram.com/"><i class="fab fa-instagram"></i></a>
          <a href="https://www.linkedin.com/"><i class="fab fa-linkedin"></i></a>
          
      </div>
    </div>
    <div class="main_content">
        <div class="header">Dashboard                <h3> Hi  ${teacher.teacher_fname }</h3></div> 
     
    </div>
</div>



</body>
</html>    