<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="it.consoft.nameless.model.User"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="head.jsp"%>
<title>Profilo</title>
</head>
<body>
	<%@ include file="session.jsp"%>
	<%
		User user = (User) session.getAttribute("user");
		String nickname = user.getNickname();
	%>
	<%@ include file="navbar.jsp"%>
	<div class="container">
		<div class="well span8 offset2">
			<div class="row-fluid user-row">
				<div class="span1">
					<img class="img-circle"
						src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"
						alt="User Pic">
				</div>
				<div class="span10">
					<strong><%=nickname%></strong><br> <span class="text-muted">User level:
						Administrator</span>
				</div>
				<div class="span1 dropdown-user" data-for=".cyruxx">
					<i class="icon-chevron-down text-muted"></i>
				</div>
			</div>
			<div class="row-fluid user-infos cyruxx">
				<div class="span10 offset1">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<h3 class="panel-title">User information</h3>
						</div>
						<div class="panel-body">
							<div class="row-fluid">
								<div class="span3">
									<img class="img-circle"
										src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100"
										alt="User Pic">
								</div>
								<div class="span6">
									<strong>Cyruxx</strong><br>
									<table class="table table-condensed table-responsive table-user-information">
										<tbody>
											<tr>
												<td>User level:</td>
												<td>Administrator</td>
											</tr>
											<tr>
												<td>Registered since:</td>
												<td>11/12/2013</td>
											</tr>
											<tr>
												<td>Topics</td>
												<td>15</td>
											</tr>
											<tr>
												<td>Warnings</td>
												<td>0</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="panel-footer">
							<button class="btn  btn-primary" type="button" data-toggle="tooltip"
								data-original-title="Send message to user">
								<i class="icon-envelope icon-white"></i>
							</button>
							<span class="pull-right">
								<button class="btn btn-warning" type="button" data-toggle="tooltip"
									data-original-title="Edit this user">
									<i class="icon-edit icon-white"></i>
								</button>
								<button class="btn btn-danger" type="button" data-toggle="tooltip"
									data-original-title="Remove this user">
									<i class="icon-remove icon-white"></i>
								</button>
							</span>
						</div>
					</div>
				</div>
			</div>


		</div>
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