
<!DOCTYPE html>    
<html>    
<head>    
<meta name="viewport" content="width=device-width, initial-scale=1">    
<%@ include file="navbar.jsp"%>
<link href="/css/navbar.css" rel="stylesheet">
<link href="/css/feedback.css" rel="stylesheet">
   
</head>    
<body>    
<h2>FEED BACK FORM</h2>    
<div class="container">    
  <form action="feedbackData" method="post">    
    <div class="row">    
      <div class="col-25">    
        <label for="fname">First Name</label>    
      </div>    
      <div class="col-75">    
        <input type="text" id="fname" name="fed_fname" placeholder="Your name..">    
      </div>    
    </div>    
    <div class="row">    
      <div class="col-25">    
        <label for="lname">Last Name</label>    
      </div>    
      <div class="col-75">    
        <input type="text" id="lname" name="fed_lname" placeholder="Your last name..">    
      </div>    
    </div>    
    <div class="row">    
        <div class="col-25">    
          <label for="email">Mail Id</label>    
        </div>    
        <div class="col-75">    
          <input type="email" id="email" name="fed_email" placeholder="Your mail id..">    
        </div>    
      </div>    
    <div class="row">    
      <div class="col-25">    
        <label for="country">Country</label>    
      </div>    
      <div class="col-75">    
        <select id="country" name="fed_country">    
            <option value="none">Select Country</option>    
          <option value="australia">Australia</option>    
          <option value="canada">Canada</option>    
          <option value="usa">USA</option>    
          <option value="russia">Russia</option>    
          <option value="japan">Japan</option>    
          <option value="india">India</option>    
          <option value="china">China</option>    
        </select>    
      </div>    
    </div>    
    <div class="row">    
      <div class="col-25">    
        <label for="feed_back">Feed Back</label>    
      </div>    
      <div class="col-75">    
        <textarea id="subject" name="fed_feedback" placeholder="Write something.." style="height:200px"></textarea>    
      </div>    
    </div>    
    <div class="row">    
      <input type="submit" value="Submit">    
    </div>    
  </form>    
</div>    
    
</body>    
</html>    