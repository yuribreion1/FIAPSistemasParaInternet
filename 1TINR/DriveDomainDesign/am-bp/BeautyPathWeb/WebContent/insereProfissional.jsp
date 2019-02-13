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
	<h1 class="display-4">PAON - Cadastro de profissional</h1>
	<hr>
	<form action="cadastra-profissional" method="POST">
		<div class="form-group">
			<label for="nome">Nome</label> 
			<input type="text" class="form-control" id="nome" name="nome" required
				placeholder="Ex. João da Silva">
		</div>
		<div class="form-group">
			<label for="registro">Registro</label> <input
				type="text" class="form-control" id="registro" name="registro" required
				placeholder="Ex. RM79935">
		</div>
		<div class="form-group">
			<label for="telefone">Telefone</label> <input
				type="text" class="form-control" id="telefone" name="telefone" required
				placeholder="11998065815">
		</div>
		<div class="form-group">
			<label for="socialUrl">Rede social</label> <input
				type="text" class="form-control" id="socialUrl" name="socialUrl" required
				placeholder="@joaodasilva">
		</div>
		<div class="form-group">
			<label for="socialUrl1">Rede social 1</label> <input
				type="text" class="form-control" id="socialUrl1" name="socialUrl1"
				placeholder="@joaodasilvasauro">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		<a href="index.jsp"><button type="button" class="btn btn-secondary">Voltar</button></a>
	</form>
</body>
</html>