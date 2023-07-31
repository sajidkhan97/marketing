<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Create</title>
</head>
<body>
<h2>Create Lead</h2>
<form action="save" method="post"><pre>
Email:       <input type ="text" name="email"/>
First Name:  <input type ="text" name="firstName"/>
Last Name:   <input type ="text" name="lastName"/>
Mobile:      <input type ="text" name="mobile"/><br>
<input type="submit" value ="save">

</pre>
</form>

<p>${successMessage}</p>


</body>
</html>