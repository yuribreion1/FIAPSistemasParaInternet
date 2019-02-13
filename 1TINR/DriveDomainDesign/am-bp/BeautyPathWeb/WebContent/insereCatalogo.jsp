<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>PAON - Beauty Path</title>
</head>
<body class="container">
	<h1 class="display-4">PAON - Cadastro de catalogo</h1>
	<hr>
	<form action="cadastra-catalogo" method="POST">
		<div class="form-group">
			<label for="descricao">Descrição</label> 
			<input type="text" class="form-control" id="descricao" name="descricao" required
				placeholder="Corte masculino">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		<a href="index.jsp"><button type="button" class="btn btn-secondary">Voltar</button></a>
	</form>
</body>
</html>