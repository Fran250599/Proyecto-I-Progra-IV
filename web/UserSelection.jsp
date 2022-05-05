<%-- 
    Document   : TypeOfUser
    Created on : 5 may 2022, 2:22:56
    Author     : XPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Elegir tipo de usuario</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous"/>
        <link rel="stylesheet" href="css/SignIn.css">
    </head>
    <body>
        <div>
            <form action="paciente" class="sign-in-form">
                <input type="submit" class="btn solid" value="Paciente" name="Paciente">
                
            </form>  
            <form action="doctor" class="sign-in-form">
                <input type="submit" class="btn solid" value="Doctor" name="Doctor">               
            </form>  
        </div>
    </body>
</html>
