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
	<h1 class="display-4">PAON - Remover endereço</h1>
	<hr>
	<form action="remove-endereco" method="POST">
		<div class="form-group">
			<label for="codigo">Código do endereço:</label> 
			<input type="number" class="form-control" id="codigo" name="codigo" required >
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		<a href="index.jsp"><button type="button" class="btn btn-secondary">Voltar</button></a>
	</form>
</body>
</html>