
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
                <div class="full-box dashboard-sideBar-UserInfo">
                    <figure class="full-box">
                        <img src="./assets/img/users.png" alt="UserIcon">
                        <figcaption class="text-center text-titles">Bienvenido</figcaption>
                    </figure>
                    <ul class="full-box list-unstyled text-center">
                        <li>  <form action="svCerrarSesion" method="POST">
                                <button type="submit" class="btn-danger">Cerrar Sesión</button>                                    
                              </form>                                                    
                        </li>
                    </ul>
                </div>
                <!-- SideBar Menu -->
                <ul class="list-unstyled full-box dashboard-sideBar-Menu">
                    <li>
                        <a href="empleado.jsp">
                            Empleados
                        </a>
                    </li>
                    <li>
                        <a href="cliente.jsp">
                            Clientes
                        </a>
                    </li>
                    <li>
                        <a href="servicio.jsp">
                            Servicios
                        </a>
                    </li>
                    <li>
                        <a href="paquete.jsp">
                            Paquetes
                        </a>
                    </li>
                    <li>
                        <a href="venta.jsp">
                            Venta de Servicio
                        </a>
                    </li>
                    <li>
                        <a href="ventaPaquete.jsp">
                            Venta de Paquete
                        </a>
                    </li>

                </ul>
            </div>
        </section>

        <!-- Content page-->


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