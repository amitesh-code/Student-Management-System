<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Add Student</title>


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



/* Form container */

.form-container{

    width:450px;
    margin:50px auto;
    background:white;
    padding:35px;
    border-radius:15px;
    box-shadow:0px 5px 20px rgba(0,0,0,0.15);

}



h2{

    text-align:center;
    color:#2c3e50;
    margin-bottom:30px;

}



/* Labels */

label{

    font-size:16px;
    font-weight:bold;

}



/* Input fields */

input[type="text"],
input[type="number"]{

    width:100%;
    padding:12px;
    margin-top:8px;
    margin-bottom:20px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:15px;

}



input:focus{

    outline:none;
    border-color:#3498db;

}



/* Submit button */

input[type="submit"]{

    width:100%;
    padding:12px;
    background:#3498db;
    color:white;
    border:none;
    border-radius:8px;
    font-size:17px;
    cursor:pointer;

}


input[type="submit"]:hover{

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




<div class="form-container">


<h2>
Add New Student
</h2>



<form:form 
    action="${pageContext.request.contextPath}/savestudent"
    method="post"
    modelAttribute="student">



    <!-- Important for update also -->
    <form:hidden path="id"/>



    <label>Name</label>

    <form:input path="name"/>



    <label>Email</label>

    <form:input path="email"/>



    <label>Course</label>

    <form:input path="course"/>



    <label>Age</label>

    <form:input path="age"/>



    <input type="submit" value="Save Student">



</form:form>



</div>



</body>

</html>