<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/main.css" type="text/css" media="screen" />
        <title>Login Ayala</title>
    </head>
    <body>
    <center>
         <h1>Bienvenido Usuario</h1>
         <img src="css/images/balon.png"> 
         <div id="login">
            <form id="form-login" action="login.do" method="POST">
                <p><label> user:</label>
                <input type="text" name="user" value="" placeholder="Ingresa Usuario" required="" class="inputogin" />
                <br/>
                <br/>
                <p><label>pass:</label>
                <input type="password" name="pass" value="" placeholder="Ingresa Password" required="" class="inputogin"/>
                <br/>
                <br/>
                <input type="submit" value="Ingresar" id="loginboton" />
            </form>
        </div>                    
    </body>
</html>
