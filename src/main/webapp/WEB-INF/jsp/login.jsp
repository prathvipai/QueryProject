<html>
<head>
<title>Login Page</title>
</head>

<body style="background-color: lightpink;">
    <font color="red">${errorMessage}</font>
    <form method="get" action="/verifyLoginDetails">
        Name : <input type="text" name="username" />
        Password : <input type="password" name="password" /> 
        <input type="submit"  name="VERIFY"/>
    </form>
    <br><br>
    <a href="./userRegistration">Not a User??Register here!</a>  
    
</body>
</html>