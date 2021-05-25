<%-- 
    Document   : Vista_Lector
    Created on : 20-may-2021, 11:50:24
    Author     : Documentos
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Entidad.Lector"%>
<%@page import="Modelo.Modelo_Lector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <a href="Controlador_Lector?op=2" class="btn btn-success">Nuevo Lector</a>
            <table class="table" id="MiTabla">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>DNI</th>
                        <th>Fecha de Registro</th>
                        <th>Distrito</th>
                        <th>Estado</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%

                        Modelo_Lector data = new Modelo_Lector();
                        List<Lector> listado = data.ListadoLector();

                        //Crear un iterador que recorre todos los registros
                        Iterator<Lector> itera = listado.iterator();
                        Lector lec;
                        while (itera.hasNext()){
                            lec = itera.next();

                    %>
                    <tr>
                        <td><%=lec.getId()%></td>
                        <td><%=lec.getNom()%></td>
                        <td><%=lec.getApe()%></td>
                        <td><%=lec.getDni()%></td>
                        <td><%=lec.getFec()%></td>
                        <td><%=lec.getNomDis()%></td> 
                        <td><%=lec.getEst() %></td>
                        <td><a class="btn btn-warning" href="Controlador_Lector?op=3&id=<%=lec.getId()%>">Editar</button></a
                        <td><a class="btn btn-danger" href="Controlador_Lector?op=4&id=<%=lec.getId()%>">Eliminar</a></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>            
    </body>
</html>

