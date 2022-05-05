<%-- 
    Document   : SignUp
    Created on : 3 may 2022, 11:26:10
    Author     : XPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous"/>
        
        <link rel="stylesheet" href="css/SignIn.css">
        <title>SignUp</title>
    </head>
    <body>
    <div class="container">
        
        <div class="forms-container">
           
            <div class="signup-signup">
                <form action="userSelection" class="sign-up-form">
                    <h2 class="title"> Registro </h2>

                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" placeholder="Nombre completo" name="nombre" >
                    </div>

                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" placeholder="Identificación" name="id">
                    </div>

                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" placeholder="Contraseña" name="password">
                    </div>

                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" placeholder=" Confirmar contraseña" name="passwordConfirm">
                    </div>
                    
                    <div>
                        <label for="dog-names">Tipo de usuario:</label>
                        <select  name="typeOfUser">
                            <option value="Doctor">Doctor</option>
                            <option value="Paciente">Paciente</option>
                            
                        </select>
                        
                    </div>

                    <div class="link">
                        <a href="homePatient">Registrarme mas tarde</a>
                       </div>

                   <input type="submit" class="btn solid" value="Registrarme">
                    
                </form>
            </div>    
        </div>
        
           <!---->
        <div class="panels-container">

            <ul>

                <li>
                    <div class="content">
                        
                        <div class="panel right-panel">
                            <h3>¿Ya tienes una cuenta?</h3>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia deleniti quidem eligendi alias unde aliquam! Temporibus, nihil maxime quasi odit ex voluptatum ut unde cumque itaque rem? Quis, voluptculpaatum .</p>
                            
                            <a href="login">
                            <button class="btn transparent" id="sign-in-button">Iniciar sesión</button>                                 
                            </a>

                            <br>
                            <img src="Pictures/img_02.svg" alt="" class="image">
                        </div>

                </li>

            </ul>

        </div>

    </div>

</body>
</html>
