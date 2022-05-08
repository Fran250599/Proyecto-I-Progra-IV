<%-- 
    Document   : NuevaCita2
    Created on : 7 may 2022, 13:03:40
    Author     : XPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous"/>
        <link rel="stylesheet" href="css/Home.css">
        <link rel="stylesheet" href="css/Pacient.css">
        <title>Agendar cita</title>
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

            <form action="citaAgendada">
                <div>
                    <br><br>
                    <h1 class="txt-1">Agendar una cita</h1>
                    <br><br>
                </div>

                <div class="input-container">

                    <div class="input-field input-schedule">
                        <label for="name">Fecha:</label>
                        <input type="date" id="name">
                    </div>

                    <div class="input-field input-schedule">
                        <label for="name">Hora:</label>
                        <input type="time" id="name">
                    </div>

                    <div class="input-field input-schedule">
                        <label for="name">Localidad: </label>
                        <input type="name" id="name" value="<%
                            String localidad = (String) request.getAttribute("localidad");

                            out.print(localidad);

                               %>" readonly>
                    </div>

                    <div class="input-field input-schedule">
                        <label for="name">Costo consulta: </label>
                        <input type="text" id="name" value="<%                    String costo = (String) request.getAttribute("costo");

                            out.print(costo);
                               %>" readonly>
                    </div>

                    <button class="btn-send">Enviar</button>


                </div>
            </form>


    </body>
</html>