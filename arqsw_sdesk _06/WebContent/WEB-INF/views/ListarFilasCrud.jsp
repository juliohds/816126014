
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Filas</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

</head>

<body>
	<!-- Barra superior com os menus de navegação -->
	<c:import url="Menu.jsp" />
	<!-- Container Principal -->
	<div id="main" class="container">
		<div class="container">
			<div class="row centered mt mb">
				<div class="col-lg-8 col-lg-offset-2">
					<div class="cadastro">
						<h1>Filas</h1>
						<table class="table table-condensed" border="1">
							<TR>
								<td>Mostrar</td>
								<td>Nome</td>
								<td>Imagem</td>
								<td>Alterar</td>
								<td>Excluir</td>
							</tr>
							<c:forEach var="fila" items="${filas}">
								<tr style="font-size: 10">
									<td class="actions"><a class="btn btn-success"
										href="mostrar_fila?id=${fila.id }">Exibir</a></td>
									<td>${fila.nome}</td>
									<td><img alt="?" src="img/${fila.imagem}" height="48"
										width="48" class="img-circle"></td>
									<td>
										<form action="tela_atualizar_fila" method=post>
											<button type="submit" class="btn btn-primary"
												name="btnAlterar" value="${fila.id}">Alterar</button>
										</form>
									</td>
									<td>
										<form action="deletar_fila" method=post>
											<button type="submit" class="btn btn-danger"
												name="btnExcluir" value="${fila.id}">Excluir</button>
										</form>
									</td>
								</tr>
							</c:forEach>
						</table>
						<div id="actions" class="row"></div>
					</div>
					<h3>
						<a href="tela_cadastrar_fila">Cadastrar Fila</a>
					</h3>
				</div>

			</div>
		</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>