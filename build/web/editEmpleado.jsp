
<%@page import="logica.Usuario"%>
<%@page import="logica.Empleado"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="logica.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="logica.Controlador"%>
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
                <!-- SideBar User info -->

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
                    <h1 class="text-titles">Editar Empleados</h1>
                </div>

            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                        <ul class="nav nav-tabs" style="margin-bottom: 15px;">
                            <li class="active"><a type="hidden"  data-toggle="tab"></a></li>
                            <li><a type="hidden"  data-toggle="tab"></a></li>
                        </ul>
                        <div id="myTabContent" class="tab-content">
                            <div class="tab-pane fade active in" id="new">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-xs-12 col-md-10 col-md-offset-1">
                                            <form action="svEditarEmpleado" method="get">

                                                <% HttpSession misession = request.getSession();
                                                    Empleado emp = (Empleado) misession.getAttribute("empleado");
                                                   
                                                    {%> 

                                                <p>Nombre</p>
                                                <div class="form-group label-floating">                                                  
                                                    <input class="form-control" type="text" name="nombre" value="<%=emp.getNombre()%>">
                                                </div>
                                                <p>Apellido</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="apellido" value="<%=emp.getApellido()%>">
                                                </div>
                                                <p>Dni</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="dni" value="<%=emp.getDni()%>">
                                                </div>
                                                <p>Direccion</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="direccion" value="<%=emp.getDireccion()%>">
                                                </div>
                                                <p>Nacionalidad</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="nacionalidad" value="<%=emp.getNacionalidad()%>">
                                                </div>
                                                <p>Fecha de Nacimiento</p>
                                                <div class="form-group label-floating">
                                                    <%Date fec = emp.getFecha_nacimiento();
                                                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");%>
                                                    <% String fecha = sdf.format(fec);%>

                                                    <label>DD/MM/YYYY</label>
                                                    <input class="form-control" type="datetime" name="fechaNacimiento" value="<%=fecha%>">
                                                </div>
                                                <p>Celular</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="celular" value="<%=emp.getCelular()%>">
                                                </div>

                                                <p>Email</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="email" value="<%=emp.getEmail()%>">
                                                </div>

                                                <p>Cargo</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="cargo" value="<%=emp.getCargo()%>">
                                                </div>

                                                <p>Sueldo</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="sueldo" value="<%=emp.getSueldo()%>">
                                                </div>
                                                <p>Usuario</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="user" value="<%=emp.getUsuario().getUser()%>">
                                                </div>

                                                <p>Contraseña</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="pass" value="<%=emp.getUsuario().getPass()%>">
                                                </div>

                                                <input type="hidden" name="id" value="<%=emp.getId()%>"
                                                
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
                                        <input class="form-control" type="text" name="busquedaCliente">
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