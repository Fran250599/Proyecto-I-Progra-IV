<%-- 
    Document   : Profile
    Created on : 3 may 2022, 11:49:12
    Author     : XPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Profile.css">
    <title>Información personal</title>
    </head>
    <body>
    <div class="container">

        <div class="forms-container">

             <form action="profile" class="complete-info">
                <br>
                <h1>Administración de datos</h1>

                <div id="old-photo">
                    <input type="file" id="myFile" name="filename">
                </div>

                <div id="new-photo"></div>

                <div class="input-field d1">
                    <label for="bio">Biografia</label>
                    <textarea id="bio" rows="4" cols="50"></textarea>
                </div>

               
                <div class="input-field">
                    <label for="name">Nombre </label>
                    <input type="text" id="name">
                </div>

                <div class="input-field">
                    <label for="specialty" >Especialidad </label>
                    <input type="text" id="specialty">
                </div>

                <div class="input-field">
                    <label for="price" >Costo</label>
                    <input type="number" id="price">
                </div>

            
                <div class="input-field">
                    <label for="frequency ">Frecuencia</label>
                    <input type="number" id="frequency">
                </div>

                <input type="submit" class="btn solid" value="Aceptar">
                
                 
             </form>
           
            
        </div>

    </div>
</body>
</html>