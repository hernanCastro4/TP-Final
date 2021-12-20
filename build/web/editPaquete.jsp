
<%@page import="logica.Paquete"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="logica.Controlador"%>
<%@page import="java.util.List"%>
<%@page import="logica.Servicio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Paquetes de Servicios</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" href="./css/main.css">
    </head>
    <body>
        <!-- SideBar -->
        <section class="full-box cover dashboard-sideBar">
            <div class="full-box dashboard-sideBar-bg btn-menu-dashboard"></div>
            <div class="full-box dashboard-sideBar-ct">
                <!--SideBar Title -->
                <div class="full-box text-uppercase text-center text-titles dashboard-sideBar-title">
                    Empresa de Turismo <i class="zmdi zmdi-close btn-menu-dashboard visible-xs"></i>
                </div>


                <!-- SideBar Menu -->
                <ul class="list-unstyled full-box dashboard-sideBar-Menu">
                    <li>
                        <a href="home.jsp">
                            Regresar
                        </a>
                    </li>
                </ul>
            </div>
        </section>

        <!-- Content page-->
        <section class="full-box dashboard-contentPage">

            <!-- Content page -->
            <div class="container-fluid">
                <div class="page-header">
                    <h1 class="text-titles">Paquetes de Servicios</h1>
                </div>

            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                        <ul class="nav nav-tabs" style="margin-bottom: 15px;">
                            <li class="active"><a  data-toggle="tab"></a></li>
                            <li><a data-toggle="tab"></a></li>
                        </ul>
                        <div id="myTabContent" class="tab-content">
                            <div class="tab-pane fade active in" id="new">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-xs-12 col-md-10 col-md-offset-1">
                                            <form action="svEditarPaquete" method="get">
                                                <p class="center-block"><h3>Servicios actuales que posee el paquete</h3></p>
                                            <br>
                                                <table class="table table-hover text-center">
                                                    <thead>
                                                        <tr>
                                                            <th class="text-center">Codigo Paquete</th>
                                                            <th class="text-center">Costo de Paquete</th>
                                                            <th class="text-center">Servicio</th>
                                                            <th class="text-center">Descripción</th>
                                                            <th class="text-center">Destino</th>
                                                            <th class="text-center">Fecha</th>
                                                            <th class="text-center">Costo Servicio</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%
                                                            HttpSession misession = request.getSession();
                                                            Paquete pa = (Paquete) misession.getAttribute("paquete");

                                                            Controlador cont = new Controlador();
                                                            for (Servicio s : pa.getServicios()) {
                                                        %>
                                                        <tr>
                                                            <%int idPa = pa.getCodigo_paquete();%>
                                                            <td><%=idPa%></td>

                                                            <%double costo = pa.getCosto();%>
                                                            <td><%=costo%></td>

                                                            <%String nom = s.getNombre();%>
                                                            <td><%=nom%></td>

                                                            <%String desc = s.getDescripcion_breve();%>
                                                            <td><%=desc%></td>

                                                            <%String des = s.getDestino_servicio();%>
                                                            <td><%=des%></td>

                                                            <% Date fec = s.getFecha_servicio();
                                                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");%>
                                                            <% String fecha = sdf.format(fec);%>
                                                            <td><%=fecha%></td>

                                                            <%double costoSer = s.getCosto_servicio();%>
                                                            <td><%=costo%></td>

                                                            <%int codigo = s.getCodigo_servicio();%>

                                                        </tr>

                                                    </tbody>
                                                    <%}%>
                                                </table>
                                                <br>
                                                <h3>Elija los servicios que desea agregar</h3>
                                                <hr>
                                                
                                                <table class="table table-hover text-center">                                                    
                                                    <thead>
                                                        <tr>
                                                            <th class="text-center">Codigo</th>
                                                            <th class="text-center">Nombre</th>
                                                            <th class="text-center">Descripción</th>
                                                            <th class="text-center">Destino</th>
                                                            <th class="text-center">Fecha</th>
                                                            <th class="text-center">Costo</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%
                                                             
                                                            Paquete paq = (Paquete) misession.getAttribute("paquete");
                                                            int idP=paq.getCodigo_paquete();
                                                            Controlador control = new Controlador();
                                                            List<Servicio> listaServ = control.traerServicios();
                                                            for (Servicio serv : listaServ) {

                                                        %>
                                                        <tr>
                                                            <%int ids = serv.getCodigo_servicio();%>
                                                            <td><%=ids%></td>

                                                            <%String nom = serv.getNombre();%>
                                                            <td><%=nom%></td>

                                                            <%String desc = serv.getDescripcion_breve();%>
                                                            <td><%=desc%></td>

                                                            <%String des = serv.getDestino_servicio();%>
                                                            <td><%=des%></td>

                                                            <% Date fec = serv.getFecha_servicio();
                                                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");%>
                                                            <% String fecha = sdf.format(fec);%>
                                                            <td><%=fecha%></td>

                                                            <%double costo = serv.getCosto_servicio();%>
                                                            <td><%=costo%></td>

                                                            <%int codigo = serv.getCodigo_servicio();%>

                                                            <td>   
                                                                <input type="hidden"  name="idPa" value="<%=idP%>"> 
                                                                <input type="checkbox" id="cbox2" name="servicio" value="<%=codigo%>">                                                                 
                                                            </td>                                                           
                                                        </tr>

                                                    </tbody>
                                                    <%}%>
                                                </table>
                                                <button type="submit" class="btn-primary" data-title="select">Agregar</button>

                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>

        </section>


    </div>
</section>




<!--====== Scripts -->
<script src="./js/jquery-3.1.1.min.js"></script>
<script src="./js/sweetalert2.min.js"></script>
<script src="./js/bootstrap.min.js"></script>
<script src="./js/material.min.js"></script>
<script src="./js/ripples.min.js"></script>
<script src="./js/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="./js/main.js"></script>
<script>
    $.material.init();
</script>
</body>
</html>