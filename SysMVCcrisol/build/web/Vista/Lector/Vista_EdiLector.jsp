<%-- 
    Document   : Vista_EdiLector
    Created on : 21-may-2021, 12:11:24
    Author     : Documentos
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Modelo_Lector"%>
<%@page import="Entidad.Lector"%>
<%@page import="Entidad.Distrito"%>
<%@page import="Entidad.Distrito"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Modelo_Distrito"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
    </head>
    <body>
                    <%
                        int xid_lec = Integer.parseInt(request.getAttribute("idLector").toString()); 
                        Modelo_Lector obj = new Modelo_Lector();
                        Lector regLec = new Lector();
                        regLec = obj.BuscarLector(xid_lec);
                        

                    %>
        
        <h1>Hello World!</h1>
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    
                </div>
                <div class="col-sm-6">
                    <form method="post" action="Controlador_Lector">
                        <div class="form-group">
                            <label>Nombres</label>
                            <input type="text" name="txtNom" value="<%=regLec.getNom() %>" class="form-control"> 
                        </div>
                        <div class="form-group">
                            <label>Apellidos</label>
                            <input type="text" name="txtApe" value="<%=regLec.getApe() %>" class="form-control"> 
                        </div>
                        <div class="form-group">
                            <label>DNI: </label>
                            <input type="text" name="txtDni" value="<%=regLec.getDni()%>" class="form-control"> 
                        </div>
                        <div class="form-group">
                            <label>Distrito</label>
                            <select name="txtIdDis" class="form-control">
                             
                            <!-- Muestra de distrito -->
                            <%

                        Modelo_Distrito data = new Modelo_Distrito();
                        List<Distrito> listado = data.ListadoDistrito();

                        //Crear un iterador que recorre todos los registros
                        Iterator<Distrito> itera = listado.iterator();
                        Distrito dis;
                        while (itera.hasNext()){
                            dis = itera.next();

                    %>
                    <option value="<%=dis.getId()%>"><%=dis.getNom()%></option>
                    <%
                        }
                    %>
                        </select>
                        </div>
                        <div class="form-group">
                            <label>Fecha</label>
                            <input type="date" name="txtFec" value="<%=regLec.getFec()%>" class="form-control"> 
                        </div>
                        <div class="form-group">
                            <label>Estado</label>
                            <select name="txtEst" class="form-control"> 
                                <option value="A">Activado</option>
                                <option value="D">Desactivado</option>    
                            </select>
                        </div>
                        <div>
                            <button class="btn btn-success" type="submit" name="op" value="Grabar">Enviar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>  
                       
    </body>
</html>
