
<%@page import="javax.sql.rowset.serial.SerialArray"%>
<%@page import="logica.Paquete"%>
<%@page import="logica.Cliente"%>
<%@page import="logica.Ventas"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="logica.Controlador"%>
<%@page import="java.util.List"%>
<%@page import="logica.Servicio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Ventas</title>
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
                    <h1 class="text-titles">Venta de Paquete</h1>
                </div>

            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                        <ul class="nav nav-tabs" style="margin-bottom: 15px;">
                            <li class="active" ><a href="#new" data-toggle="tab">Nueva Venta</a></li>
                            <li><a href="#list" data-toggle="tab">Mostrar Todos</a></li>
                        </ul>
                        <div id="myTabContent" class="tab-content">
                            <div class="tab-pane fade active in" id="new">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-xs-12 col-md-10 col-md-offset-1">
                                            <form action="svVentaPaquete" method="POST">
                                                <hr>
                                                <h2>Venta de Paquetes de Servicio</h2>
                                                <br>
                                                <p>Medio de Pago</p>
                                                <div class="form-group label-floating">                                                  
                                                    <input class="form-control" type="text" name="medio">
                                                </div>

                                                <p>Fecha Venta</p>
                                                <div class="form-group label-floating">
                                                    <label>DD/MM/YYYY</label>
                                                    <input class="form-control" type="datetime" name="fecha">
                                                </div>

                                                <h3>Seleccione el Paquete</h3>
                                                <hr>
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
                                                            Ventas vent = (Ventas) misession.getAttribute("venta");
                                                           // int idVenta = vent.getNum_ventas();
                                                           Controlador cont=new Controlador();
                                                            List<Paquete> listaPaquetes = cont.traerPaquetes();
                                                            for (Paquete p : listaPaquetes) {
                                                                for (Servicio s : p.getServicios()) {

                                                        %>
                                                        <tr>
                                                            <%int idPaquete = p.getCodigo_paquete();%>
                                                            <td><%=idPaquete%></td>

                                                            <%double costoPaquete = p.getCosto();%>
                                                            <td><%=costoPaquete%></td>

                                                            <%String nomSer = s.getNombre();%>
                                                            <td><%=nomSer%></td>

                                                            <%String descSer = s.getDescripcion_breve();%>
                                                            <td><%=descSer%></td>

                                                            <%String dest = s.getDestino_servicio();%>
                                                            <td><%=dest%></td>

                                                            <% Date fech = s.getFecha_servicio();
                                                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");%>
                                                            <% String fechaSer = sdf.format(fech);%>
                                                            <td><%=fechaSer%></td>

                                                            <%double costoSer = s.getCosto_servicio();%>
                                                            <td><%=costoSer%></td>

                                                            <%int codigoSer = s.getCodigo_servicio();%>
                                                            <td> 
                                                                <input type="checkbox" name="seleccionado" value="<%=idPaquete%>">

                                                            </td>

                                                        </tr>

                                                    </tbody>
                                                    <%}
                                                        }%>
                                                </table>
                                                <hr>
                                                <br>
                                                <h3 > Seleccione el Cliente</h3>
                                                
                                                
                                                <hr>
                                                
                                                <table class="table table-hover text-center">
                                                    <thead>
                                                        <tr>
                                                            <th class="text-center">Id</th>
                                                            <th class="text-center">Nombre</th>
                                                            <th class="text-center">Apellido</th>
                                                            <th class="text-center">Dni</th>
                                                            <th class="text-center">Direccion</th>
                                                            <th class="text-center">Nacionalidad</th>
                                                            <th class="text-center">Fecha de Nacimiento</th>
                                                            <th class="text-center">Celular</th>
                                                            <th class="text-center">Email</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% 
                                                            List<Cliente> listaClientes = cont.traerClientes();
                                                            for (Cliente clie : listaClientes) {

                                                        %>
                                                        <tr>
                                                            <%int id = clie.getId();%>
                                                            <td><%=id%></td>

                                                            <%String nom = clie.getNombre();%>
                                                            <td><%=nom%></td>

                                                            <%String ape = clie.getApellido();%>
                                                            <td><%=ape%></td>

                                                            <%String dni = clie.getDni();%>
                                                            <td><%=dni%></td>

                                                            <%String dir = clie.getDireccion();%>
                                                            <td><%=dir%></td>

                                                            <%String nac = clie.getNacionalidad();%>
                                                            <td><%=nac%></td>

                                                            <% Date fec = clie.getFecha_nacimiento();
                                                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");%>
                                                            <% String fecha = sdf.format(fec);%>

                                                            <td><%=fecha%></td>

                                                            <%String cel = clie.getCelular();%>
                                                            <td><%=cel%></td>

                                                            <%String mail = clie.getEmail();%>
                                                            <td><%=mail%></td>

                                                            <td>
                                                                <input type="hidden" name="idCliente" value="<%=id%>">
                                                                <button type="submit" class="btn-primary" data-title="edit">Seleccionar</button>                                                               
                                                            </td>

                                                        </tr>

                                                    </tbody>

                                                    <%}%>
                                                </table>

                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane fade" id="list">
                                <div class="table-responsive">
                                    
                                    <table class="table table-hover text-center">
                                        <thead>
                                     
                                            <tr>
                                                <th class="text-center">Codigo de Paquete</th>
                                                <th class="text-center">Costo Paquete</th>
                                                <th class="text-center">Nombre Servicio</th>
                                                <th class="text-center">Descripción</th>
                                                <th class="text-center">Costo Servicio</th>
                                                <th class="text-center">Destino</th>   
                                                <th class="text-center">Fecha</th>
                                                <th class="text-center">Borrar Venta</th>
                                                                                              
                                                  
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                Controlador c=new Controlador();
                                                List<Paquete> listaPaque = c.traerPaquetes();
                                                
                                                for (Paquete paquete : listaPaque) {
                                                     for (Servicio serv : paquete.getServicios()) {
                                                        for (Ventas ve : paquete.getVentas()) {
                                                                
                                                            int idVe = ve.getNum_ventas();
     
                                                         
   
                                            %>
                                            <tr>
                                                <%int id = paquete.getCodigo_paquete();%>
                                                 
                                                <td><%=id%></td>

                                                <%double costo = paquete.getCosto();%>
                                                <td><%=costo%></td>
                                                
                                                 <%String nom=serv.getNombre();%>
                                                <td><%=nom%></td>
                                                
                                                <%String desc=serv.getDescripcion_breve();%>
                                                <td><%=desc%></td>
                                                
                                                 <%double costoServ = serv.getCosto_servicio();%>
                                                <td><%=costoServ%></td>
                                                
                                                <%String des=serv.getDestino_servicio();%>
                                                <td><%=des%></td>
                                                
                                                <% Date fec=serv.getFecha_servicio();
                                                SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");%>
                                                <% String fecha=sdf.format(fec); %>
                                                 <td><%=fecha%></td>
                                                 <%int codigo = serv.getCodigo_servicio();%>
                                               
                                                
                                                <td>
                                                    <form name="formBorrarPaquete" action="svBorrarVenta" method="POST">
                                                        <input type="hidden" name="idVenta" value="<%=idVe%>">
                                                        <button type="submit" class="btn-danger" data-title="delete">Borrar</button>
                                                    </form>
                                                </td>

                                            </tr>

                                        </tbody>
                                        <%} } }%>
                                    </table>

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