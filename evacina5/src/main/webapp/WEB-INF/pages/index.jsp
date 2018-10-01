<%-- 
    Document   : index
    Created on : 15/09/2018, 14:49:54
    Author     : gustav0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix="s" uri="/struts-tags" %>--%>

<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE-edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="icon" href="../../resources/static/img/logo-p.png">
	<title>E-Vacina</title>

	<!--CSS PATH INICIO -->
	<link href="../../resources/static/css/bootstrap.min.css" rel="stylesheet">
	<link href="../../resources/static/css/style.css" rel="stylesheet">
  <link href="../../resources/static/css/modal.css" rel="stylesheet">
	<!--CSS PATH FIM -->

</head>



<body>
  <!--TOPO INICIO -->
  <nav class="navbar navbar-expand-lg navbar-primary bg-white">

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
    </button>


        <a class="navbar-brand" href="/">
            <img src="../../resources/static/img/logo-topo2.png" alt="">
        </a>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="index.html">Início
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">E-Vacina</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/consulta">Consulta</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Campanhas</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Calendário</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">FAQ </a>
            </li>
          </ul>
        </div>
        

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
        <a href="/login"><button class="btn btn-outline-primary my-2 my-sm-0" type="submit">
          <i class="fas fa-user-circle"></i> Login
        </button></a>
        </ul>
</div>

    </nav>
    <!--TOPO FIM -->



	<!--JAVASCRIPT PATH INICIO -->
	<script src="../../resources/static/js/jquery.js"></script>
	<script src="../../resources/static/js/bootstrap.min.js"></script>
        <script defer src="../../resources/static/js/fontawesome-all.js"></script>
	<!--JAVASCRIPT PATH FIM -->

</body>
</html>
</html>
