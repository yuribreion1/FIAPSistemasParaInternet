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
	<h1 class="display-4">PAON - Cadastro de endereço</h1>
	<hr>
	<form action="cadastra-endereco" method="POST">
		<div class="form-group">
			<label for="logradouro">Logradouro</label> 
			<input type="text" class="form-control" id="logradouro" name="logradouro" required
				placeholder="Rua Tutoia, 1157">
		</div>
		<div class="form-group">
			<label for="cidade">Cidade</label> <input
				type="text" class="form-control" id="cidade" name="cidade" required
				placeholder="São Paulo">
		</div>
		<div class="form-group">
			<label for="estado">Estado</label> <input
				type="text" class="form-control" id="estado" name="estado" required
				placeholder="SP">
		</div>
		<div class="form-group">
			<label for="cep">CEP</label> <input
				type="text" class="form-control" id="cep" name="cep" required
				placeholder="03174-000">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		<a href="index.jsp"><button type="button" class="btn btn-secondary">Voltar</button></a>
	</form>
</body>
</html>