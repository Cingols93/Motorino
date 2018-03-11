<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="head.jsp"%>
<title>Ticket Support</title>
</head>
<body>
	<%@ include file="session.jsp"%>
	<%@ include file="navbar.jsp"%>
	<div class="container">
		<div class="row">
			<form action="" method="post" class="smart-green">
				<h1>
					Support Ticket <span>Manda un ticket ai nostri amministratori</span>
				</h1>
				<label> <span>Nome :</span> <input id="name" type="text" name="name" placeholder="Nome" />
				</label> <label> <span>Email :</span> <input id="email" type="email" name="email"
					placeholder="Indirizzo Email" />
				</label> <label> <span>Num. Telefonico :</span> <input id="Phone" type="tel" name="Phone"
					placeholder="Num. Telefonico" />
				</label> <label> <span>Titolo :</span> <input id="Subject" type="text" name="Subject"
					placeholder="Titolo" />
				</label> <label> <span>Messaggio :</span> <textarea id="message" name="message"
						placeholder="Scrivi qui il messaggio"></textarea>
				</label> <label> <span> </span> <input type="button" class="button" value="Invia" />
				</label>
			</form>
		</div>
	</div>