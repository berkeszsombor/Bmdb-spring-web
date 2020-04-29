<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<title>Register</title>
</head>
<body>
	<form:form method="post" action="register">
            <p>Register</p>
            <div class="form-group">
    				<label for="InputEmail">Email</label>
    				<input type="email" name="email" class="form-control" id="InputEmail" aria-describedby="emailHelp" placeholder="Enter email">
  			</div>
            <div class="form-group">
    				<label for="InputName">Name</label>
    				<input type="name" name="name" class="form-control" id="InputName" placeholder="Name">
  			</div>
  			<div class="form-group">
    				<label for="InputPassword">Password</label>
    				<input type="password" name="password" class="form-control" id="InputPassword" placeholder="Password">
  			</div>
  			<button type="submit" class="btn btn-primary">Register</button>
        </form:form>
</body>
</html>