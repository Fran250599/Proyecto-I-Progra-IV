<%-- 
    Document   : newjsp
    Created on : 7 may 2022, 20:34:16
    Author     : XPC
--%>

<%@page import="model.Cita"%>
<%@page import="java.util.ArrayList"%>
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
        <link rel="stylesheet" href="css/Doctor.css">
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
                    <a href="userSelection">
                        <i class="fas fa-user"></i>
                        <span class="nav-item">Perfil</span>
                    </a>    
                </li>

                <li>
                    <a href="citasActivas">
                        <i class="fas fa-envelope"></i>
                        <span class="nav-item">Gestion Citas</span>
                    </a>    
                </li>

                <li>
                    <a href="login" class="login">
                        <i class="fas fa-sign-out-alt"></i>
                        <span class="nav-item">Cerrar Sesión</span>
                    </a>    
                </li>

            </ul>
        </nav>

        <div>

            <div>
                <br><br>
                <h1 class="txt-1">Gestion de citas agendadas</h1>
                <h2 class="txt-2">Estado de la cita</h2>
                <h3 class="txt-2">Muestra como se veria, no esta funcionando por completo</h3>
            </div>

        </div>
        <form action="home">
            <div>
                <div class="tabla-doctor">
                    <table class="content-table">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Dia</th>
                                <th>Hora</th>
                                <th>Estado</th>
                                <th>Anotaciones</th>

                            </tr>
                        </thead>

                        <tbody>
   
                            
                            <tr>
                                <td>Paciente 1</td>
                                <td>05/05/2022</td>
                                <td>3:00pm</td>
                                <td><select class="tabla-combo-estado" name="select">
                                        <option value="pendiente">Pendiente</option>
                                        <option value="finalizada">Finalizada</option>
                                    </select>
                                </td>
                                <th><textarea id="bio" rows="4" cols="50"></textarea></th>

                            </tr>
                        </tbody>
                    </table>



                    <div>
                        <button class="btn-send">Actualizar info</button>
                    </div>
                </div>
            </div>
        </form>

    </div>





</body>
</html>
