<?php include("header.php") ?>
<?php 
    if (isset($_POST['enviar'])) {
        $connect = mysqli_connect('localhost','root','','desafio');
    
    if (!$connect) {
        echo "Houve um erro na conexão";
    }

    $user = $_POST['user'];
    $password = $_POST['password'];
    $email = $_POST['email'];

    $query = "INSERT INTO desafio_8_usuarios(username, password, email) values ('$user','$password','$email')"; 

    $result = mysqli_query($connect, $query);

    if($result){
        ?>
<script>
    UIkit.notification({
        message: 'Usuário cadastrado com sucesso!',
        status: 'primary',
        pos: 'top-right',
        timeout: 5000
    });
</script>
<?php
    } else {
        ?>
<script>
    UIkit.notification({
        message: 'Usuário não cadastrado, há erros!',
        status: 'danger',
        pos: 'top-right',
        timeout: 5000
    });
</script>
<?php
    }
}
?>

<?php include("footer.php") ?>