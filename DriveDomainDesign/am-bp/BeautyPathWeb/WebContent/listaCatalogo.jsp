<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>Beauty Path - Listagem de Catalogos</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
	$(function() {

		var count = 0;
		$("td[name^='catalogo_']").each(function(index) {
			count++;
		});

		if (count == 0) {
			$("#listar").click();
		}

	})
</script>

</head>
<body class="container">
	<h1 class="display-4">PAON - Listage de profissional</h1>
	<hr>
	<ul>

		<form method="post" action="lista-catalogo">
			<button id="listar" hidden="true">Listar</button>

			<div class="row">
				<div class="col-12">
					<div class="card">
						<table class="table table-striped table-horvered">
							<thead>
								<tr>
									<th>ID</th>
									<th>Descricaoo</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="catalogo" items="${catalogos}">
									<tr>
										<td name="catalogo_${catalogo.getIdCatalogo()}">${catalogo.getIdCatalogo()}</td>
										<td>${catalogo.getDescricao()}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</form>
		<br>
		<a href="index.jsp"><button type="button"
				class="btn btn-secondary">Voltar</button></a>
	</ul>
</body>
</html>