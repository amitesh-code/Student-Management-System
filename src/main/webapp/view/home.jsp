<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Student Management</title>


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


.navbar{

    background:#2c3e50;
    padding:20px;
    text-align:center;

}


.navbar a{

    color:white;
    text-decoration:none;
    margin:0 20px;
    font-size:18px;

}


.navbar a:hover{

    color:#3498db;

}


.container{

    text-align:center;
    margin-top:100px;

}


.container h1{

    font-size:40px;
    color:#2c3e50;

}


.card-container{

    display:flex;
    justify-content:center;
    gap:30px;
    margin-top:50px;

}



.card{

    background:white;
    width:250px;
    padding:30px;
    border-radius:15px;
    box-shadow:0px 5px 15px gray;

}



.card h2{

    margin-bottom:20px;

}



.btn{

    display:inline-block;
    background:#3498db;
    color:white;
    padding:12px 25px;
    border-radius:8px;
    text-decoration:none;

}


.btn:hover{

    background:#2980b9;

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



<div class="container">


<h1>
Student Management System
</h1>



<div class="card-container">


<div class="card">

<h2>
Add Student
</h2>

<p>
Register new students
</p>

<br>

<a class="btn"
href="${pageContext.request.contextPath}/addstudent">
Add
</a>


</div>



<div class="card">

<h2>
View Students
</h2>

<p>
See all student records
</p>

<br>

<a class="btn"
href="${pageContext.request.contextPath}/getinfo">
View
</a>


</div>



<div class="card">

<h2>
Search Student
</h2>

<p>
Find student details
</p>

<br>

<a class="btn"
href="${pageContext.request.contextPath}/search">
Search
</a>


</div>



</div>


</div>


</body>

</html>