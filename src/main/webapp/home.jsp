<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <link rel="stylesheet" href="main.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script src="main.js"></script>
    <title>CRUD</title>
</head>
<body>
<form action="addEmployee" id="addForm">
    <h1>Add employee details :-</h1>
    <label>Enter Id -</label>
    <input type="text" name="empId"><br>
    <label>Enter name -</label>
    <input type="text" name="empName"><br>
    <label>Enter Mobile No. -</label>
    <input type="text" name="mobile"><br>
    <label>Enter Team -</label>
    <input type="text" name="team">
    <input type="submit">
</form><br>

<form action="getEmployee">
        <h1>Search Employee</h1>
        <label>Enter Id -</label>
        <input type="text" name="empId" id="search">
        <input type="submit" value="Search">
</form>
<button id="test1">View Employees</button>
<button id="test2">View Employees after sorting</button>
<button id="test3">Delete Employees</button>

</body>
</html>