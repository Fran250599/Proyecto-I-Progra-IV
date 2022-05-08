
<%@page import="model.Paciente"%>
<%@page import="model.Doctor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.*"%>
<%@ page import="view.CitaServlet"%>
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

       <form action="citados">
        <div>
            <br><br>
            <h1 class="txt-1">Agendar una cita</h1>
            <br><br>
            </div>
    
           <div class="input-container">
    
            <div class="input-field input-schedule">
                <label for="name">Nombre completo:  </label>
                <input type="text" id="name" value="<%
                       ArrayList<String> names = (ArrayList<String>) request.getAttribute("doctorsNames");
                       Paciente p = (Paciente) request.getAttribute("pacient");
                       out.print(p.getName());
                       %>" readonly>
                
            </div>
    
            <div class="input-field input-schedule">
                <label for="name">Identificación:</label>
                <input type="text" id="name" value="<%
                       out.print(p.getId());
                       
                       %>" readonly>
            </div>
    
            <div class="input-field input-schedule">
                <label for="name">Nombre del doctor: </label>
                
                <select name="doctorName">
                    <%
                        for(String name : names){
                            out.print("<option>");
                            out.print(name);
                            out.print("</option>");
                        }
                    %>
                    
                </select>
                
            </div>
    
            <button class="btn-send">Siguente</button>
       </form>

     </div>

     
</body>
</html>