<%-- 
    Document   : HomePatient
    Created on : 3 may 2022, 11:48:20
    Author     : XPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous"/>
    <link rel="stylesheet" href="css/Home.css">
    </head>
    <body>
    
    <nav>
        
        
        <ul>
            <br>
            <li>
                <a href="#">
                    <i class="fas fa-home"></i>
                    <span class="nav-item">Pagina Principal</span>
                </a>    
            </li>

            <li>
                <a href="#">
                    <i class="fas fa-user"></i>
                    <span class="nav-item">Doctores</span>
                </a>    
            </li>

            <li>
                <form action="cita">
            
                    <a href="cita">
                    <i class="fas fa-envelope"></i>
                    <span class="nav-item">Agendar Citas</span>
                </a> 
            
                </form>
                   
            </li>

            <li>
                <a href="login" class="logout">
                    <i class="fas fa-sign-out-alt"></i>
                    <span class="nav-item">Cerrar Sesión</span>
                </a>    
            </li>

        </ul>
    </nav>


</body>
</html>
