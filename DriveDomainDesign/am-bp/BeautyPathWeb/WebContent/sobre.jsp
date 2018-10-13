<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<title>PAON - Beauty Path</title>
</head>
<body class="container">
	<h1 class="display-4">PAON - Sobre nós</h1>
	<hr>
		<ul class="nav nav-pills">
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
			aria-expanded="false">Cadastros</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="insereEndereco.jsp">Endereço</a> 
				<a class="dropdown-item" href="insereCliente.jsp">Cliente</a> 
				<a class="dropdown-item" href="insereCatalogo.jsp">Catalogo</a>
				<a class="dropdown-item" href="insereProfissional.jsp">Profissional</a>
				<!-- <div class="dropdown-divider"></div>
				<a class="dropdown-item" href="#">Separated link</a> -->
			</div></li>
			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
			aria-expanded="false">Listagem</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="listaCatalogo.jsp">Catalogo</a>
				<a class="dropdown-item" href="listaEndereco.jsp">Endereço</a> 
				<a class="dropdown-item" href="listaCliente.jsp">Cliente</a>
				<a class="dropdown-item" href="listaProfissional.jsp">Profissional</a>  
				<!-- <div class="dropdown-divider"></div>
				<a class="dropdown-item" href="#">Separated link</a> -->
			</div></li>
			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
			aria-expanded="false">Remoção</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="removerEndereco.jsp">Endereço</a> 
				<a class="dropdown-item" href="removerCliente.jsp">Cliente</a> 
				<a class="dropdown-item" href="removerCatalogo.jsp">Catalogo</a>
				<a class="dropdown-item" href="removerProfissional.jsp">Profissional</a>
				<!-- <div class="dropdown-divider"></div>
				<a class="dropdown-item" href="#">Separated link</a> -->
			</div></li>
			
		<li class="nav-item"><a class="nav-link" href="sobre.jsp">Sobre</a></li>
		<li class="nav-item"><a class="nav-link" href="#">Contato</a></li>
	</ul>

	<blockquote class="blockquote">
			<p class="mb-0">Lorem ipsum dolor sit amet, consectetur
				adipiscing elit. Integer posuere erat a ante.</p>
			<footer class="blockquote-footer">
				Someone famous in <cite title="Source Title">Source Title</cite>
			</footer>
		</blockquote>

</body>
</html>