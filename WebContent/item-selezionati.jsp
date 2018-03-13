<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<div class="well span8 offset2">
	<div class="row-fluid user-row">
		<div class="span1">
			<img class="img-circle"
				src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"
				alt="User Pic">
		</div>
		<div class="span10">
			<strong>Modello</strong><br> <span class="text-muted">
				Marca</span>
		</div>
		<div class="span1 dropdown-user" data-for=".cyruxx">
			<i class="icon-chevron-down text-muted"></i>
		</div>
	</div>
	<div class="row-fluid user-infos cyruxx">
		<table class="table table-hover">
			<tbody>
				<tr>
					<td colspan="2">Ammortizzatori</td>
					<td><span class="pull-right">
							<div class="input-group">
								<input type="TextBox" ID="datebox" Class="form-control" disabled></input>
								<div class="input-group-btn">
									<button type="button" class="btn dropdown-toggle"
										data-toggle="dropdown">
										<span class="caret"></span>
									</button>
									<ul id="demolist" class="dropdown-menu">
										<li><a href="#">Gulp</a></li>
										<li><a  href="#">&#8203</a></li>
									</ul>
								</div>
					</span></td>
				</tr>
				<tr>
					<td colspan="2">Carburatori</td>
					<td><span class="pull-right">
							<div class="input-group">
								<input type="TextBox" ID="datebox2" Class="form-control"
									disabled></input>
								<div class="input-group-btn">
									<button type="button" class="btn dropdown-toggle"
										data-toggle="dropdown">
										<span class="caret"></span>
									</button>
									<ul id="demolist2" class="dropdown-menu">
										<li><a href="#">Racing</a></li>
										<li><a  href="#">&#8203</a></li>
									</ul>
								</div>
					</span></td>
				</tr>
				<tr>
					<td colspan="2">Marmitte</td>
					<td><span class="pull-right">
							<div class="input-group">
								<input type="TextBox" ID="datebox3" Class="form-control"
									disabled></input>
								<div class="input-group-btn">
									<button type="button" class="btn dropdown-toggle"
										data-toggle="dropdown">
										<span class="caret"></span>
									</button>
									<ul id="demolist3" class="dropdown-menu">
										<li><a href="#">Racing</a></li>
										<li><a  href="#">&#8203</a></li>
									</ul>
								</div>
					</span></td>
				</tr>
				<tr>
					<td colspan="2">Variatori</td>
					<td><span class="pull-right">
							<div class="input-group">
								<input type="TextBox" ID="datebox4" Class="form-control"
									disabled></input>
								<div class="input-group-btn">
									<button type="button" class="btn dropdown-toggle"
										data-toggle="dropdown">
										<span class="caret"></span>
									</button>
									<ul id="demolist4" class="dropdown-menu">
										<li><a href="#">Racing</a></li>
										<li><a  href="#">&#8203</a></li>
									</ul>
								</div>
					</span></td>
				</tr>
				<tr>
					<td colspan="2">Cilindri</td>
					<td><span class="pull-right">
							<div class="input-group">
								<input type="TextBox" ID="datebox5" Class="form-control"
									disabled></input>
								<div class="input-group-btn">
									<button type="button" class="btn dropdown-toggle"
										data-toggle="dropdown">
										<span class="caret"></span>
									</button>
									<ul id="demolist5" class="dropdown-menu">
										<li><a href="#">Racing</a></li>
										<li><a  href="#">&#8203</a></li>
									</ul>
								</div>
					</span></td>
				</tr>
				<tr>
					<td colspan="2"></td>
					<td><span class="pull-right">
							<button class="btn-sel-piu" type="button" data-toggle="tooltip"
								data-original-title="">
								<a href="#" class=""> <span class="inviaBtn">Invia</span>
								</a>
							</button>
					</span></td>
				</tr>

				<tr>
					<td colspan="2">Accelerazione : </td>
					<td>Velocità : </td>
				</tr>
				<tr>
					<td colspan="2">Manovrabilità : </td>
					<td colspan="2">Frenata : </td>
				</tr>
				<tr>
					<td colspan="2">Antifurto : </td>
					<td style="text-align:right; text-transform:none;">Tot.: 1500 &euro;</td>
				</tr>
				<tr>
					<td colspan="2"></td>
					<td><span class="pull-right">
							<button style="background:#4294bb!important;" class="btn-sel-piu" type="button" data-toggle="tooltip"
								data-original-title="">
								<a href="#" class=""> <span class="inviaBtn">Compra</span>
								</a>
							</button>
					</span></td>
				</tr>
			</tbody>
		</table>

	</div>
</div>
<script>
	$('#demolist li a').on('click', function() {
		$('#datebox').val($(this).html());
	});
	$('#demolist2 li a').on('click', function() {
		$('#datebox2').val($(this).html());
	});
	$('#demolist3 li a').on('click', function() {
		$('#datebox3').val($(this).html());
	});
	$('#demolist4 li a').on('click', function() {
		$('#datebox4').val($(this).html());
	});
	$('#demolist5 li a').on('click', function() {
		$('#datebox5').val($(this).html());
	});
</script>