<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
	<title>New Quizz</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/dashboard.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>

<div class="wrapper">
    <div class="sidebar">
        <h2>QUIZZER</h2>
        <ul>
            <li><a href="#"><i class="fas fa-home"></i>Dashboard</a></li>
            <li><a href="./newquizz.jsp"><i class="fas fa-plus"></i>New Quiz</a></li>
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
        <div class="header">Editor</div> 
    </div>
</div>
	

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3 col-sm-4 col-xs-12"></div>
			<div class="col-md-6 col-sm-4 col-xs-12">
				
  					<form action="quizdata" method="post">
  					<div class="form-group custom-form">
  						<label class="control-label">Paper: </label>
  						<div class="dropdown">
						 <select name="exam_id" class="btn btn-info btn-block">
						 	<option>Core Java</option>
						 	<option>Operating System</option>
						 	<option>Data Structure</option>
						 	<option>Database Technologies</option>
						 	<option>Web Technologies</option>
						 	<option>Advance Java</option>
						 </select>
						</div>
					
  					</div> 
					<div class="form-group">
						<label class="control-label">Question:</label>
						<div class="">
							<input type="text" class="form-control" placeholder="Question" name="que_question">
						</div>
					</div>
					
					
					
					<div class="form-group">
						<label class="control-label">Option 1:</label>
						<div class="">
							<input type="text" class="form-control" placeholder="Option 1" name="que_opt1">
						</div>
					</div>
  					<br/>
  					<div class="form-group">
						<label class="control-label">Option 2:</label>
						<div class="">
							<input type="text" class="form-control" placeholder="Option 2" name="que_opt2">
						</div>
					</div>
  					<br/>
  					<div class="form-group">
						<label class="control-label">Option 3:</label>
						<div class="">
							<input type="text" class="form-control" placeholder="Option 3" name="que_opt3">
						</div>
					</div>
  					<br/>
  					<div class="form-group">
						<label class="control-label">Option 4:</label>
						<div class="">
							<input type="text" class="form-control" placeholder="Option 4" name="que_opt4">
						</div>
					</div>
					<div class="form-group custom-form" style="color:black;">
						<label class="control-label">Correct Answer:</label> <br>
						<input type="radio" name="que_correctopt" value="1" >Option 1
	  					<input type="radio" name="que_correctopt" value="2">Option 2
	  					<input type="radio" name="que_correctopt" value="3">Option 3
					    <input type="radio" name="que_correctopt" value="4">Option 4
  					</div>
  					
  					<div class="form-group custom-form">
  						<label class="control-label">Difficulty: </label>
  						<div class="dropdown">
						 <select name="que_difficulty" class="btn  btn-block">
						 	<option>Easy</option>
						 	<option>Medium</option>
						 	<option>Hard</option>
						 	
						 </select>
						</div>
					
  					</div> 
  					
  					<br/>
				<div class="form-group custom-form">
					<input type="submit" value="Submit" class="btn btn-warning ">
  				</div>
  				</form>
				</div>
				<div class="col-md-3 col-sm-4 col-xs-12"></div>
			</div></div>
</body>
</html>