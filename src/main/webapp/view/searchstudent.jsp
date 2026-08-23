<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Search Student</title>


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

h1{

    text-align:center;
    margin-top:40px;
    color:#2c3e50;

}



/* Main container */

.container{

    width:500px;
    margin:40px auto;

}



/* Search cards */

.search-card{

    background:white;
    padding:25px;
    margin-bottom:25px;
    border-radius:15px;
    box-shadow:0px 5px 15px rgba(0,0,0,0.15);

}



.search-card h2{

    color:#2c3e50;
    margin-bottom:20px;

}



/* Input */

input[type="text"],
input[type="number"]{

    width:70%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:15px;

}



input:focus{

    outline:none;
    border-color:#3498db;

}



/* Button */

button{

    padding:12px 20px;
    background:#3498db;
    color:white;
    border:none;
    border-radius:8px;
    cursor:pointer;

}


button:hover{

    background:#2980b9;

}



/* Back button */

.back{

    text-align:center;
    margin-top:30px;

}


.back a{

    text-decoration:none;
    color:#3498db;
    font-size:18px;

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




<h1>
Search Students
</h1>




<div class="container">



<!-- Search By Name -->

<div class="search-card">


<h2>
Search By Name
</h2>


<form action="${pageContext.request.contextPath}/searchbyname"
      method="get">


<input type="text"
       name="name"
       placeholder="Enter student name"
       required>


<button type="submit">
Search
</button>


</form>


</div>





<!-- Search By Course -->

<div class="search-card">


<h2>
Search By Course
</h2>


<form action="${pageContext.request.contextPath}/searchbycourse"
      method="get">


<input type="text"
       name="course"
       placeholder="Enter course"
       required>


<button type="submit">
Search
</button>


</form>


</div>





<!-- Search By Age -->

<div class="search-card">


<h2>
Search Age Greater Than
</h2>


<form action="${pageContext.request.contextPath}/searchbyagegreater"
      method="get">


<input type="number"
       name="age"
       placeholder="Enter age"
       required>


<button type="submit">
Search
</button>


</form>


</div>








</div>



</body>

</html>