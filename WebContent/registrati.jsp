<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="head.jsp"%>
<title>Insert title here</title>
</head>
<body>
<%@ include file="navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<h1 class="text-center login-title">Collegati a Nameless</h1>
				<div class="account-wall">
					<img class="profile-img"
						src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120"
						alt="">
					<form class="form-signin">
						<input type="text" class="form-control" placeholder="Nickname" name ="nickname"> 
						<input type="text" class="form-control" placeholder="Nome" name ="nome">
						<input type="text" class="form-control" placeholder="Cognome" name ="cognome">
						<input type="text" class="form-control" placeholder="Età" name ="eta">
						<input type="text" class="form-control" placeholder="Indirizzo" name ="indirizzo">
						<input type="text" class="form-control" placeholder="E-mail" name ="username">
						<input type="password" class="form-control" placeholder="Password" name ="password">
						<button class="btn btn-lg btn-primary btn-block" type="submit"> Registrati</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>