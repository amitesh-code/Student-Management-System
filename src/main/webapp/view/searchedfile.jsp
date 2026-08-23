<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Searched Students</title>


<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}


body{

    background:#f4f6f9;

}


/* Navbar */

.navbar{

    background:#2c3e50;
    padding:18px;
    text-align:center;

}


.navbar a{

    color:white;
    text-decoration:none;
    margin:0 20px;
    font-size:17px;

}


.navbar a:hover{

    color:#3498db;

}



/* Heading */

h2{

    text-align:center;
    margin-top:40px;
    color:#2c3e50;
    font-size:32px;

}



/* Table container */

.table-container{

    width:90%;
    margin:40px auto;
    background:white;
    padding:25px;
    border-radius:15px;
    box-shadow:0px 5px 20px rgba(0,0,0,0.15);

}



/* Table */

table{

    width:100%;
    border-collapse:collapse;

}


th{

    background:#3498db;
    color:white;
    padding:15px;
    font-size:17px;

}



td{

    padding:12px;
    text-align:center;
    border-bottom:1px solid #ddd;

}



tr:hover{

    background:#f1f7ff;

}



/* Buttons */

.btn{

    text-decoration:none;
    padding:8px 15px;
    border-radius:6px;
    color:white;
    margin:3px;
    display:inline-block;

}


/* update button */

.update{

    background:#27ae60;

}


.update:hover{

    background:#1e8449;

}



/* delete button */

.delete{

    background:#e74c3c;

}


.delete:hover{

    background:#c0392b;

}



/* No result message */

.message{

    text-align:center;
    color:red;
    margin-top:40px;
    font-size:22px;

}



</style>


</head>


<body>


<div class="navbar">


<a href="${pageContext.request.contextPath}/home">
Home
</a>


<a href="${pageContext.request.contextPath}/addstudent">
Add Student
</a>


<a href="${pageContext.request.contextPath}/getinfo">
View Students
</a>


<a href="${pageContext.request.contextPath}/search">
Search
</a>


</div>



<h2>
Searched Students
</h2>



<c:if test="${empty student}">
    <div class="message">
        <h3>No Student Found</h3>
    </div>
</c:if>>



<c:if test="${not empty student}">


<div class="table-container">


<table>


<tr>

<th>ID</th>

<th>Name</th>

<th>Email</th>

<th>Course</th>

<th>Age</th>

<th>Action</th>

</tr>



<c:forEach var="student" items="${student}">


<tr>


<td>${student.id}</td>

<td>${student.name}</td>

<td>${student.email}</td>

<td>${student.course}</td>

<td>${student.age}</td>



<td>


<a class="btn update"
href="${pageContext.request.contextPath}/update/${student.id}">

Update

</a>



<a class="btn delete"
href="${pageContext.request.contextPath}/delete?id=${student.id}">

Delete

</a>


</td>


</tr>


</c:forEach>



</table>


</div>


</c:if>



</body>


</html>