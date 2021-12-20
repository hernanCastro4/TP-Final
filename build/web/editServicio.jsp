<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="logica.Controlador"%>
<%@page import="java.util.List"%>
<%@page import="logica.Servicio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Inicio</title>
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
                    <h1 class="text-titles">Modificar Servicios</h1>
                </div>

            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                        <ul class="nav nav-tabs" style="margin-bottom: 15px;">
                            <li class="active"><a data-toggle="tab"></a></li>
                            <li><a data-toggle="tab"></a></li>
                        </ul>
                        <div id="myTabContent" class="tab-content">
                            <div class="tab-pane fade active in" id="new">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-xs-12 col-md-10 col-md-offset-1">
                                            <form action="svEditarServ" method="get">
                                                <% HttpSession misession = request.getSession();
                                                    Servicio serv = (Servicio) misession.getAttribute("servicio");
                                                    {%> 
                                                <p>Nombre</p>
                                                <div class="form-group label-floating">                                                  
                                                    <input class="form-control" type="text" name="nombre" value="<%=serv.getNombre()%>">
                                                </div>
                                                <p>Descripción</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="descripcion" value="<%=serv.getDescripcion_breve()%>">
                                                </div>
                                                <p>Destino</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="destino" value="<%=serv.getDestino_servicio()%>">
                                                </div>
                                                <p>Fecha Servicio</p>
                                                <div class="form-group label-floating">
                                                    <label>DD/MM/YYYY</label>
                                                <%Date fec=serv.getFecha_servicio();
                                                    SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");%>
                                                <% String fecha=sdf.format(fec);%>
                                                    <input class="form-control" type="datetime" name="fechaServicio" value="<%=fecha%>">
                                                </div>
                                                <p>Costo</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="costo" value="<%=serv.getCosto_servicio()%>">
                                                </div>
                                                <input type="hidden" name="id" value="<%=serv.getCodigo_servicio()%>"
                                                <p class="text-center">
                                                    <button type="submit" class="btn btn-info btn-raised btn-sm">Modificar</button>
                                                </p>
                                                  <%}%>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane fade" id="list">
                                <div class="table-responsive">
                                    <p>Buscar</p>
                                    <div class="form-group label-floating">
                                        <input class="form-control" type="text" name="busquedaServicio">
                                    </div>
                                    <p class="text-right">
                                        <button type="submit" class="btn btn-info btn-raised btn-sm">Buscar</button>
                                    </p>


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