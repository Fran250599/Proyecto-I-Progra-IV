<%@page import="model.Doctor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
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
        <title>Buscar Doctor</title>
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
                    <a href="citados">
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

            <div>
                <br><br>
                <h1 class="txt-1">Busqueda de doctores</h1>
                <h2 class="txt-2">*Se mostrarán solo los doctores que llenaron el formulario de registro correctamente*</h2>
            </div>


        </div>

        <div class="tabla-doctor">
            <table class="content-table">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Especialidad</th>
                        <th>Localidad</th>
                    </tr>
                </thead>

                <%
                    ArrayList<Doctor> doctors = (ArrayList<Doctor>) request.getAttribute("doctorsInfo");
                %>

                
                    <tbody>
                    
                        <%
                            
                            for (Doctor d : doctors) {
                                out.print("<tr>");

                                out.print("<td>");

                                out.print(d.getName());

                                out.print("</td>");
                                out.print("<td>");

                                out.print(d.getEspecialidad());

                                out.print("</td>");
                                out.print("<td>");

                                out.print(d.getUbicacion());

                                out.print("</td>");

                                out.print("</tr>");

                            }


                        %>

                    </tbody>

            </table>
        </div>
                        
                        <form action="cita">
                             <button class="btn-send">Agendar</button>
                            
                        </form>
       



    </body>
</html>
