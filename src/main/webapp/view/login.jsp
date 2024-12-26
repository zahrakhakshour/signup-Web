<%--
  Created by IntelliJ IDEA.
  User: Zahra
  Date: 12/25/2024
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Login</title>
</head>
<body>

<div class="container">
    <form id="sign-up" action="/home/userLogin" method="post" >
        <div class="mb-3">
            <label for="UserName" class="form-label">Enter Your UserName</label>
            <input name="username" type="text" class="form-control" id="UserName" aria-describedby="emailHelp">

        </div>
        <div class="mb-3">
            <label for="Password" class="form-label">Enter Your Password</label>
            <input name="password" type="password" class="form-control" id="Password">
        </div>

        <button type="submit" class="btn btn-primary" form="sign-up"> Login </button>
    </form>
</div>



</body>
</html>
