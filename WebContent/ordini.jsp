<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="it.consoft.nameless.model.User"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="head.jsp"%>
<title>Profilo</title>
</head>
<body>

	<%@ include file="navbar.jsp"%>
	<div class="container">
		<%@ include file="item-selezionati.jsp"%>
	</div>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							var panels = $('.user-infos');
							var panelsButton = $('.dropdown-user');
							panels.hide();

							//Click dropdown
							panelsButton
									.click(function() {
										//get data-for attribute
										var dataFor = $(this).attr('data-for');
										var idFor = $(dataFor);

										//current button
										var currentButton = $(this);
										idFor
												.slideToggle(
														400,
														function() {
															//Completed slidetoggle
															if (idFor
																	.is(':visible')) {
																currentButton
																		.html('<i class="icon-chevron-up text-muted"></i>');
															} else {
																currentButton
																		.html('<i class="icon-chevron-down text-muted"></i>');
															}
														})
									});

							$('[data-toggle="tooltip"]').tooltip();

							$('button').click(function(e) {
								e.preventDefault();
								alert("This is a demo.\n :-)");
							});
						});
	</script>

</body>
</html>