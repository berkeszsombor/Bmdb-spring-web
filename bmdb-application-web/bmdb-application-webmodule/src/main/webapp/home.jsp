<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<title>Home</title>
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Media Review</a>
  <ul class="navbar-nav">
     <li class="nav-item active">
       <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
     </li>
     <li class="nav-item">
       <a class="nav-link" href="#">Media</a>
     </li>
     <li class="nav-item dropdown">
       <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         Language
       </a>
       <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
         <a class="dropdown-item" href="#">Hungarian</a>
         <a class="dropdown-item" href="#">Ugandan</a>
         <a class="dropdown-item" href="#">A random wierd language</a>
       </div>
      </li>
   </ul>
</nav>

<form:form method="post" action="home">
	<p>User Credentials</p>
    	<div class="form-group">
    		<label for="InputEmail">Email</label>
    		<input type="email" name="email" class="form-control" id="InputEmail" aria-describedby="emailHelp" placeholder="Email">
  		</div>
    	<div class="form-group">
    		<label for="InputName">Name</label>
    		<input type="name" name="name" class="form-control" id="InputName" placeholder="Name">
  		</div>
  			<button type="submit" class="btn btn-primary">Modify</button>
</form:form>

<table class="table">
	<thead>
		<tr>
			<th>#</th>
			<th>Review text</th>
			<th>Creator</th>
			<th>Associated Media</th>
			<th>Rating</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${reviews}" var="item" varStatus="loop">
			<tr>
				<td><c:out value="${loop.index}"/></td>
				<td><c:out value="${item.getText()}"/></td>
				<td><c:out value="${item.getCreator()}"/></td>
				<td><c:out value="${item.getMedia().getTitle()}"/></td>
				<td><c:out value="${item.getRating()}"/></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>