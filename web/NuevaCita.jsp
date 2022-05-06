
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.*"%>
<%@ page import="view.CitaServlet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

            <div>
                <br><br>
                <h1 class="txt-1">Agendar una cita</h1>
                <br><br>
            </div>

            <div class="input-container">

                <div class="input-field input-schedule">

                    <label for="name">Nombre completo:  </label>

                </div>

                <div class="input-field input-schedule">
                    <label for="name">Identificación:</label>
                    <input type="text" id="name">
                </div>

                <div class="input-field input-schedule">
                    <form action="cita">
                        <label for="name">Nombre del doctor: </label>
                        <select  name="doctors">
                            <%

                                ArrayList<String> names = (ArrayList<String>) request.getAttribute("doctorsNames");

                                // print the information about every category of the list
                                for (String name : names) {
                                    out.println("<option>");
                                    out.println(name);
                                    out.println("</option>");
                                }

                            %>


                        </select>

                    </form>
                    <input type="text" id="name">
                </div>

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
                    <input type="name" id="name">
                </div>

                <div class="input-field input-schedule">
                    <label for="name">Costo consulta: </label>
                    <input type="text" id="name">
                </div>

                <button class="btn-send">Enviar</button>

            </div>


    </body>


</html>
