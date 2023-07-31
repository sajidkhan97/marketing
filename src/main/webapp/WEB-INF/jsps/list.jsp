<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
<h1>List</h1>

<table>
        <thead>
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Action</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${leads}" var="data">
                <tr>
                	<td>${data.id}</td>
                    <td>${data.firstName}</td>
                    <td>${data.lastName}</td>
                    <td>${data.email}</td>
                    <td>${data.mobile}</td>
                    <td>
          		
               	<a href="delete?id=${data.id}">Delete</a>
               	<a href="update?id=${data.id}">Update</a>
        </td>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <br>

<form action="create" method="post">
<input type="submit" value="back">
</form>
</body>
</html>