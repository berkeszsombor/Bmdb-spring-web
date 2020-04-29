<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="<spring:theme code='style'/>" type="text/css" media="all">
</head>
<body>
  <div>
    <div>
      <div id="header">
        <h1>Welcome to BMDB</h1>
        <h3>A media rating interface for reviewing and checking out details of series and movies</h3>
      </div>
      <div id="content">       
        <form:form method="post" action="login">
            <p>Login</p>
            <div class="form-group">
    				<label for="InputEmail">Email</label>
    				<input type="email" name="email" class="form-control" id="InputEmail" aria-describedby="emailHelp" placeholder="Enter email">
  			</div>
            <div class="form-group">
    				<label for="InputPassword">Password</label>
    				<input type="password" name="password" class="form-control" id="InputPassword" placeholder="Password">
  			</div>
  			<button type="submit" class="btn btn-primary">Login</button>
        </form:form>
      </div>
    </div>
  </div>
</body>
</html>