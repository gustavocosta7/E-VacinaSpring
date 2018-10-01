<%-- 
    Document   : pac-consultar-vacinas
    Created on : 15/09/2018, 20:22:02
    Author     : gustav0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix="s" uri="/struts-tags" %>--%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="icon" href="../../../resources/static/img/logo-p.png">
        <title>E-Vacina</title>

        <!--CSS PATH INICIO -->
        <link href="../../../resources/static/css/bootstrap.min.css" rel="stylesheet">
        <link href="../../../resources/static/css/style.css" rel="stylesheet">
        <link href="../../../resources/static/css/upload-img-exibir.css.css" rel="stylesheet">
        <!--CSS PATH FIM -->

    </head>

    <body>

        <nav class="navbar navbar-expand-lg navbar-white bg-primary">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>


            <a class="navbar-brand" href="/">
                <img src="../../../resources/static/img/logo-topo.png"  alt="">
            </a>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <h4 class="text-light">
                        Consulta de Vacinas
                    </h4>
                </ul>
            </div>





        </nav>




        <!--MENU LATERAL INICIO -->
        <div class="container-fluid">
            <div class="row">
                <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                    <div class="sidebar-sticky">

                        <ul class="nav flex-column">

                            <li class="nav-item">
                                <a class="nav-link text-secondary" href="/">
                                    <i class="fas fa-sign-out-alt"></i>
                                    Sair
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>
                <!--MENU LATERAL FIM -->

                <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">

                    <div class="d-flex flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                        <h1 class="h2">Digite seu nº do SUS</h1>
                        <div class="btn-toolbar">
                            <div class="btn-group">
                                <input class="form-control" type="search" size="60" placeholder="Digite seu nº do SUS" aria-label="Search" autofocus maxlength="120">
                                <button class="btn my-2 btn-outline-secondary my-sm-0" type="submit"><i class="fas fa-search"></i></button>

                            </div>
                        </div>
                    </div>
                    <div>


                        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                            <h1 class="h2">Dados do Paciente</h1>
                        </div>
                        <div>

                            <h6> Nome:</h6>
                            <h6> Nº da Carteirinha do SUS:</h6>
                            <h6> Sexo:</h6>
                            <h6> Data de Nascimento:</h6>
                            <BR>
                            <H3> Registro de Vacinação</H3>
                            <BR>
                            <div class="table-responsive">
                                <table class="table table-striped table-sm">
                                    <thead>
                                        <tr>
                                            <th>Nome da Vacina</th>
                                            <th>Dose</th>
                                            <th>Data da Vacina</th>
                                        </tr>
                                    </thead>
                                    <tbody>
<%-- VACINAS E REGISTROS --%>
                                    </tbody>
                                </table>
                            </div>
                        </div>

                </main>


            </div>
        </div>
        <!--JAVASCRIPT PATH INICIO -->
        <script src="../../../resources/static/js/jquery.js"></script>
        <script src="../../../resources/static/js/bootstrap.min.js"></script>
        <script src="../../../resources/static/js/upload-img-exibir.js"></script>
        <script defer src="../../../resources/static/js/fontawesome-all.js"></script>
        <!--JAVASCRIPT PATH FIM -->

    </body>
</html>
