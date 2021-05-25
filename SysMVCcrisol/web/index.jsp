<%-- 
    Document   : index
    Created on : 20-may-2021, 11:39:06
    Author     : Documentos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <title>Ferretería | RHSOFTPERU</title>
        <style>

            footer{
                text-align: center;
                background:black;
                color: white;
                padding-bottom: 20px;
                width: 100%;
                margin-top: 30px;
            }
              
        </style>
    </head>
    <body style="background-color: #FAFAFA">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">FerreSoft</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                      <a class="nav-link" href="Controlador_Lector?op=1">Clientes</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="Controlador/controlador_clientes.php?op=1">Productos</a>
                    </li>
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Estadística
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                      </div>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Seguridad</a>
                    </li>
                  </ul>
                  <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                  </form>
                </div>
              </nav>
             
           
            <img src="img/ferreteria.jpg" class="img-responsive" style="width: 100%">
        
        
        
        
        <div class="container">
        <h2 style="text-align:center; margin-bottom:30px;margin-top:30px">Nuestros productos</h2>
        <div class="row">
            <div class="col">
                <div>
                    <img src="img/pro/martillo.jpg" class="img-fluid" style="width:300px;height:200px">
                </div>
                <div>
                    <p>
                        Solicite un cita con nuestra bot Margarita, que lo atenderá calidamente
                        <br>
                        Las 24 horas
                        </p>
                </div>
                <div>
                    <a class="btn btn-primary btn-block" href="Mantenimiento/tablas.aspx" >Tablas</a>
                </div>
            </div>
            <div class="col">
                <div>
                    <img src="img/pro/caja.jpg" class="img-fluid" style="width:300px;height:200px">
                </div>
                <div>
                    <p>
                        Solicite un plan ajustado a sus requerimiento de salud, tenemos varios planes: económico, futuras mamá, edad dorada
                        </p>
                </div>
                <div>

                     <a class="btn btn-primary btn-block" href="Mantenimiento/tablas.aspx" >Tablas</a>

                </div>
            </div>
            <div class="col">
                <div>
                    <img src="img/pro/atornillador.jpg" class="img-fluid" style="width:300px;height:200px">
                </div>
                <div>
                    <p>
                        Puede llamarnos para atenderlo en su domicilio al 569-632 500<br>
                        Estamos a su disposición
                        </p>
                </div>
                <div>
                    <a class="btn btn-primary btn-block" href="Mantenimiento/WFdistrito.aspx" >Ver Info</a>
                </div>
            </div>
        </div>
    </div>
      <footer>
            <br>
            Todos los derechos reservados de RHSOFTPERU - 2021 | Desarrollado por: Fabiola Huarcaya
    </footer>
    </body>
</html>
