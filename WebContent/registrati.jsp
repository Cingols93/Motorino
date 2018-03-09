<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="it.consoft.nameless.servlet.RegisterServlet"%>
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
					<script
						src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
					<div id="profile-container">
						<image id="profileImage"
							src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120" />
					</div>
					<input id="imageUpload" type="file" name="profile_photo"
						placeholder="Photo" required="" capture>
					<div class="istruzioni-pic">
						<p>Clicca l'immagine per impostare la foto profilo</p>
					</div>
					<form class="form-signin" method="POST" action="registrati">
						<input type="text" class="form-control" placeholder="Nickname" name="nickname">
						<input type="text" class="form-control" placeholder="Nome" name="nome">
						<input type="text" class="form-control" placeholder="Cognome" name="cognome">
						<input type="text" class="form-control" placeholder="Età" name="eta">
						<input type="text" class="form-control" placeholder="Indirizzo" name="indirizzo">
						<input type="email" class="form-control" placeholder="E-mail" name="username">
						<input type="password" class="form-control" placeholder="Password" name="password">
						<div class="reg-button">
							<button class="btn btn-lg btn-primary btn-block" type="submit">
								Registrati</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$("#profileImage").click(function(e) {
			$("#imageUpload").click();
		});
		function fasterPreview(uploader) {
			if (uploader.files && uploader.files[0]) {
				$('#profileImage').attr('src',
						window.URL.createObjectURL(uploader.files[0]));
			}
		}
		$("#imageUpload").change(function() {
			fasterPreview(this);
		});
	</script>
</body>
</html>