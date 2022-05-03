<%-- 
    Document   : index
    Created on : 3 may 2022, 11:20:16
    Author     : XPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous"/>
        <link rel="stylesheet" href="css/SignIn.css">
        <title>Login</title>
    </head>
    <body>
        <div class="container">
        
        <div class="forms-container">
           
            <div class="signin-signin">
                <form action="homeDoctor" class="sign-in-form">
                    <h2 class="title"> Inicio de sesión </h2>

                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" placeholder="Identificación" >
                    </div>

                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" placeholder="Contraseña" >
                    </div>

                   <input type="submit" class="btn solid" value="Iniciar sesión">
                    
                </form>
            </div>

        </div>
        
           <!---->
        <div class="panels-container">

            <form action="SignUp">

                <div class="panel left-panel">

                    <div class="content">
                        <h3>¿No tienes una cuenta?</h3>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia deleniti quidem eligendi alias unde aliquam! Temporibus, nihil maxime quasi odit ex voluptatum ut unde cumque itaque rem? Quis, voluptatum culpa.</p>
                        <button class="btn transparent" id="sign-up-button" >Registrarme</button>
                        <p></p>
                    </div>
                    <img src="/Pictures/img_01.svg" alt="" class="image">
    
                </div>
            </form>
        </div>

    </div>
    </body>
</html>
