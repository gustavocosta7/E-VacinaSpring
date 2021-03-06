<%-- 
    Document   : adm-vacinas-listar
    Created on : 15/09/2018, 20:10:37
    Author     : gustav0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@taglib prefix="s" uri="/struts-tags" %>--%>
<!DOCTYPE html>
<html>
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

    <div class="collapse navbar-collapse" id="">
        <ul class="navbar-nav ml-auto">
            <h4 class="text-light">
                Console de Administração
            </h4>
        </ul>
    </div>



    <div class="collapse navbar-collapse" id="">
        <ul class="navbar-nav ml-auto">

            <li class="nav-item">
                <a href="#" title="Usuário">
                    <button class="btn btn-outline-light my-2 my-sm-0">
                        <i class="far fa-user-circle"></i>
                        <i> Nome Usuário </i>
                    </button>
                </a>
            </li>

            <li>&nbsp</li>

            <li class="nav-item">
                <a href="#" title="Sair">
                    <button class="btn btn-outline-light my-2 my-sm-0">
                        <i class="fas fa-sign-out-alt"></i>
                    </button>
                </a>
            </li>

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
                        <a class="nav-link active text-secondary" href="/admin_index">
                            <i class="fas fa-home"></i>
                            &nbspInício <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-secondary" href="/pac_listar">
                            <i class="fas fa-users"></i>
                            Pacientes
                        </a>
                    <li class="nav-item">
                        <a class="nav-link text-secondary" href="/vac_listar">
                            <i class="fas fa-syringe"></i>
                            &nbspVacinas
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-secondary" href="/local_listar">
                            <i class="far fa-hospital"></i>
                            &nbspLocais de Vacina
                        </a>
                    </li>
                    <%--<li class="nav-item">--%>
                    <%--<a class="nav-link text-secondary" href="#">--%>
                    <%--<i class="fas fa-chart-line"></i>--%>
                    <%--Estatísticas--%>
                    <%--</a>--%>
                    <%--</li>--%>
                    <li class="nav-item">
                        <a class="nav-link text-secondary" href="/aten_cadastrar">
                            <i class="fas fa-user-circle"></i>
                            Usuários
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-secondary" href="/sair">
                            <i class="fas fa-sign-out-alt"></i>
                            Sair
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
        <!--MENU LATERAL FIM -->




        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
                    <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                        <h1 class="h2">Vacinas</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">
                            <div class="btn-group mr-2">



                                <input class="form-control mr-sm-2" type="search" size="50" placeholder="Pesquisar Local de Vacinação" aria-label="Search" autofocus maxlength="120">
                                <button class="btn my-2 btn-outline-secondary my-sm-0" type="submit"><i class="fas fa-search"></i></button>
                                <span>&nbsp</span>


                                <a class="btn btn-sm btn-outline-secondary" href="/vac_cadastrar">Nova Vacina</a>
                            </div>
                        </div>
                    </div>
                    <div>

                        <div class="table-responsive">
                            <table class="table table-striped table-sm">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nome da Vacina</th>
                                        <th>Descrição</th>
                                        <th>Funções</th>
                                    </tr>
                                </thead>
                                <tbody>
									<c:forEach var="vac" items="${lista}">									
	                                    <tr>
	                                        <td>${vac.id }</td>
	                                        <td>${vac.nome }</td>
	                                        <td>${vac.descricao }</td>
	                                        <td>
	                                            <a href="/vac_alterar?id=${vac.id }">
	                                            	<button type="button" class="btn btn-outline-info btn-sm"><i class="fas fa-edit"></i></button>
	                                            </a>
	                                            <a href="/vac_apagar?id=${vac.id }">	                                            
	                                            <button type="button" class="btn btn-outline-danger btn-sm" onclick="alert('Deseja apagar?')"><i class="fas fa-trash-alt"></i></button>
	                                            </a>
	                                        </td>
	                                    </tr>
									</c:forEach>
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
