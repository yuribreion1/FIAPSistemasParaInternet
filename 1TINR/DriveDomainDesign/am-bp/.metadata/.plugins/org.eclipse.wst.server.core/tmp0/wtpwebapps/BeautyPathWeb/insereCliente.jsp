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
	<h1 class="display-4">PAON - Cadastro de cliente</h1>
	<hr>
	<form action="cadastra-cliente" method="POST">
		<div class="form-group">
			<label for="nome">Nome</label> 
			<input type="text" class="form-control" id="nome" name="nome" required
				placeholder="Insira o nome...">
		</div>
		<div class="form-group">
			<label for="telefone">Telefone</label> <input
				type="text" class="form-control" id="telefone" name="telefone" required
				placeholder="Insira o telefone...">
		</div>
		<div class="form-group">
			<label for="email">E-mail</label> <input
				type="email" class="form-control" id="email" name="email" required
				placeholder="joao@silva.com.br">
		</div>
		<div class="form-group">
			<label for="socialUrl">Rede social</label> <input
				type="text" class="form-control" id="socialUrl" name="socialUrl" required
				placeholder="@joaodasilva">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>