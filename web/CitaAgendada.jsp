
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous"/>
    <link rel="stylesheet" href="css//Home.css">
    <link rel="stylesheet" href="css/Pacient.css">
    <title>Cita agendada</title>
</head>
<body>
    
    <nav>
        <ul>
            <br>
            <li>
                <a href="/Home/HomePacient.html">
                    <i class="fas fa-home"></i>
                    <span class="nav-item">Pagina Principal</span>
                </a>    
            </li>

            <li>
                <a href="SearchDoctor.html">
                    <i class="fas fa-user"></i>
                    <span class="nav-item">Doctores</span>
                </a>    
            </li>

            <li>
                <a href="Schedule.html">
                    <i class="fas fa-envelope"></i>
                    <span class="nav-item">Agendar Citas</span>
                </a>    
            </li>

            <li>
                <a href="#" class="logout">
                    <i class="fas fa-sign-out-alt"></i>
                    <span class="nav-item">Cerrar SesiÃ³n</span>
                </a>    
            </li>

        </ul>
    </nav>

    <div>

      <form action="home">
        <div>
            <br><br>
            <h1 class="txt-1">Cita agendada</h1>
            <h2 class="txt-2">El doctor elegido recibirá tu solicitud. </h2>
            
            <br><br>
            <button class="btn-send" type="submit">Volver</button>
            </div>
    
           
    </form>

     
</body>
</html>
