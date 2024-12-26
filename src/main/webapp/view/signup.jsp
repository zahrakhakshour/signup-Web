<%--
  Created by IntelliJ IDEA.
  User: Zahra
  Date: 12/25/2024
  Time: 1:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Sign Up</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>




<div class="container">
    <p> sign up </p>


        <form id="sign-up" action="/home/userSignup" method="post" >
            <div class="mb-3">
                <label for="UserName" class="form-label">UserName</label>
                <input name="username" type="text" class="form-control" id="UserName" aria-describedby="emailHelp">
                <div id="userNmeHelp" class="form-text"> Your Username must have 8 characters.</div>
            </div>
            <div class="mb-3">
                <label for="Password" class="form-label">Password</label>
                <input name="password" type="password" class="form-control" id="Password">
                <div id="passwordHelp" class="form-text">Password must have 8-16 characters.</div>
            </div>

            <button type="submit" class="btn btn-primary" form="sign-up">Sign Up </button>
        </form>


</div>

<script>
    <% Object userResponse = request.getAttribute("userResponse");
    if (userResponse != null) {
    %>
    alert("User saved")
    <%
    }
    else
   %>
    alert("Username already exists")
</script>

</body>
</html>
