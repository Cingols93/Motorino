
<nav class="navbar navbar-default" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#navbar-brand-centered">
				<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<div class="navbar-brand navbar-brand-centered">Brand</div>
		</div>
		<div class="collapse navbar-collapse" id="navbar-brand-centered">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Acquista</a></li>
				<li><a href="#">Account</a></li>
				<li><a href="logout">Logout</a></li>
			</ul>
		</div>
	</div>
</nav>

<!-- Ho rimosso l'intestazione che %@ page language="java" ... %> e altri tag che andavano a compromettere la struttura
 dell'html completo della pagina dove si importava la navbar, in quanto si arrivava ad avere due tag html e head 
 Qui la vecchia navbar https://github.com/nameless24/Motorino/blob/e3d8becfffa003be42eea0fa43cebebdf09a71f3/WebContent/navbar.jsp
 
 Aggiunta anche la funzione di logout al pulsante. Non vi è il bisogno di un file logout.jsp, si occupa del tutto la servlet LogoutServlet
 -->