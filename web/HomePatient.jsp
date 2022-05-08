<%-- 
    Document   : HomePatient
    Created on : 3 may 2022, 11:48:20
    Author     : XPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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
                <a href="home">
                    <i class="fas fa-home"></i>
                    <span class="nav-item">Pagina Principal</span>
                </a>    
            </li>

            <li>
                <a href="doctors">
                    <i class="fas fa-user"></i>
                    <span class="nav-item">Doctores</span>
                </a>    
            </li>

            <li>
                <a href="cita">
                    <i class="fas fa-envelope"></i>
                    <span class="nav-item">Agendar Citas</span>
                </a>    
            </li>

            <li>
                <a href="login" class="logout">
                    <i class="fas fa-sign-out-alt"></i>
                    <span class="nav-item">Cerrar Sesión</span>
                </a>    
            </li>

        </ul>
    </nav>

     <div>
        <br><br>
        <h2 class="header-txt-1">Bienvenido al sistema de gestion de citas</h2>
        <h3 class="header-txt-2">Recorda llevar mascarilla y alcohol en gel</h3>
        <br><br>
        <img class="header-pic-1" src="Pictures/vacunacion.jpg" alt="">
     </div>

     
</body>
</html>
