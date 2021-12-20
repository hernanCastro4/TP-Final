
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="logica.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="logica.Controlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Empleados</title>
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
                    <h1 class="text-titles">Empleados</h1>
                </div>

            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                        <ul class="nav nav-tabs" style="margin-bottom: 15px;">
                            <li class="active"><a href="#new" data-toggle="tab">Nuevo Empleado</a></li>
                            <li><a href="#list" data-toggle="tab">Mostrar Todos</a></li>
                        </ul>
                        <div id="myTabContent" class="tab-content">
                            <div class="tab-pane fade active in" id="new">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-xs-12 col-md-10 col-md-offset-1">
                                            <form action="svEmpleado" method="POST">
                                                <p>Nombre</p>
                                                <div class="form-group label-floating">                                                  
                                                    <input class="form-control" type="text" name="nombre">
                                                </div>
                                                <p>Apellido</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="apellido">
                                                </div>
                                                <p>Dni</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="dni">
                                                </div>
                                                <p>Direccion</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="direccion">
                                                </div>
                                                <p>Nacionalidad</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="nacionalidad">
                                                </div>
                                                <p>Fecha de Nacimiento</p>
                                                <div class="form-group label-floating">
                                                    <label>DD/MM/YYYY</label>
                                                    <input class="form-control" type="datetime" name="fechaNacimiento">
                                                </div>
                                                <p>Celular</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="celular">
                                                </div>
                                                <p>Email</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="email">
                                                </div>
                                                <p>Cargo</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="cargo">
                                                </div>
                                                <p>Sueldo</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="sueldo">
                                                </div>
                                                <p>Usuario</p>
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="usuario">
                                                </div>
                                                <p>Contraseña</p>    
                                                <div class="form-group label-floating">
                                                    <input class="form-control" type="text" name="pass">
                                                </div>

                                                <p class="text-center">
                                                    <button type="submit" class="btn btn-info btn-raised btn-sm">Guardar</button>
                                                </p>

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
                                                <th class="text-center">Id</th>
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">Apellido</th>
                                                <th class="text-center">Dni</th>
                                                <th class="text-center">Direccion</th>
                                                <th class="text-center">Nacionalidad</th>
                                                <th class="text-center">Fecha de Nacimiento</th>
                                                <th class="text-center">Celular</th>
                                                <th class="text-center">Email</th>
                                                <th class="text-center">Cargo</th>
                                                <th class="text-center">Sueldo</th>
                                                <th class="text-center">Borrar</th>
                                                <th class="text-center">Editar</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <% Controlador cont=new Controlador();
                                            List<Empleado> listaEmp=cont.traerEmpleados();
                                            for(Empleado emp : listaEmp){
                                              int idUsu=emp.getUsuario().getId_usuario();
                                            %>
                                            <tr>
                                                <%int id=emp.getId();%>
                                                <td><%=id%></td>
                                                
                                                <%String nom=emp.getNombre();%>
                                                <td><%=nom%></td>
                                                
                                                <%String ape=emp.getApellido();%>
                                                <td><%=ape%></td>
                                                
                                                <%String dni=emp.getDni();%>
                                                <td><%=dni%></td>
                                                
                                                <%String dir=emp.getDireccion();%>
                                                <td><%=dir%></td>
                                                
                                                <%String nac=emp.getNacionalidad();%>
                                                <td><%=nac%></td>
                                                
                                                <% Date fec=emp.getFecha_nacimiento();
                                                SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");%>
                                                <% String fecha=sdf.format(fec); %>
                                                                                                       
                                                <td><%=fecha%></td>
                                                
                                                
                                                <%String cel=emp.getCelular();%>
                                                <td><%=cel%></td>
                                                
                                                <%String mail=emp.getEmail();%>
                                                <td><%=mail%></td>
                                                
                                                <%String car=emp.getCargo();%>
                                                <td><%=car%></td>
                                                
                                                <%double sue=emp.getSueldo();%>
                                                <td><%=sue%></td>
                                                
                                                <td>
                                                    <form name="formBorrarEmp" action="svBorrarEmpleado" method="POST">
                                                        <input type="hidden" name="id" value="<%=id%>">
                                                        <input type="hidden" name="idUsu" value="<%=idUsu%>">
                                                        <button type="submit" class="btn-danger" data-title="delete">Borrar</button>
                                                    </form>
                                                </td>
                                                
                                                <td>
                                                    <form name="formModifEmp" action="svEditarEmpleado" method="post">
                                                        <input type="hidden" name="id" value="<%=id%>">
                                                        <button type="submit" class="btn-primary" data-title="edit">Editar</button>
                                                    </form>
                                                </td>
                                                
                                            </tr>
                                            
                                        </tbody>
                                        
                                        <%}%>
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