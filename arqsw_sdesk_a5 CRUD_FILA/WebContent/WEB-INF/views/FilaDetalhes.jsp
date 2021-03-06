<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Fila</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Barra superior com os menus de navegação -->
	<c:import url="Menu.jsp" />
	<!-- Container Principal -->
	<div id="main" class="container">
		<h3 class="page-header">Consultar Chamados</h3>
		<form action="modificarFila">
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						
						<input class="form-control" type="hidden" name="id_fila" value="${fila.id}" required/>
						<label for="comment">Nome Fila:</label>
						<input class="form-control" name="nome" value="${fila.nome}" disabled/>
					</div>
				</div>
			</div>
			<a href="listar_filas" class="btn btn-default">Voltar</a>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>