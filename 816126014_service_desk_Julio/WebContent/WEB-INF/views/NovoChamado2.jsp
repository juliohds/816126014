<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Novo Chamado</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    
</head>

<body>
    <!-- Barra superior com os menus de navegação -->
    <c:import url="Menu.jsp" />
    <!-- Container Principal -->
    <div id="main" class="container">
        <h3 class="page-header">Criar Novo Chamado</h3>
        <form action="novo_chamado" method="post">
            <div class="row">
                <div class="form-group col-md-4">
                    <label for="fila">Escolha a Fila do chamado:</label>
                    <form:errors path="fila.id" cssStyle="color:red"/><br>
                    <select class="form-control" name="fila.id">
                        <option value="0"></option>
                        <c:forEach var="fila" items="${filas}">
                            <option value="${fila.id}">${fila.nome}</option>
                        </c:forEach>
                    </select>  
                    <br>
                    
                    <label for="status">Satus do chamado:</label>
	            	<select class="form-control" name="Status">                                                
	                    <option value="ATIVO" selected>Ativo</option>
	                    <option value="INATIVO">Inátivo</option>
	                    <option value="DESATIVADO">Desativado</option>                        
	                </select>                                  		                  
                </div>
                
                <div class="form-group col-md-8">
                	<!--<form:errors path="fila.id" cssStyle="color:red"/><br>-->
                    <label for="chamado">Descrição do Chamado:</label>   
                    <form:errors path="chamado.Descricao" cssStyle="color:red"/><br>                                    
                    <input type='text' class='form-control' value='' name='Descricao' id='Descricao' placeholder='inseria uma descrição'>                    
                    <br>
                    
                    <div class='form-group col-md-4'>
                    	<label for="fila">Data Abertura:</label>                    
		                <input type='date' class='form-control' value='' name='DT_ABERTURA' id='DT_ABERTURA' placeholder='inseria uma descrição'>                                        
                    </div>                    
                      
                    <div class='form-group col-md-4'>
                       <label for="fila">Data fechamento:</label>                    
		               <input type='date' class='form-control' value='' name='DT_FECHAMENTO' id='DT_FECHAMENTO' placeholder='inseria uma descrição'>                                        
                    </div> 
                                   
                </div>
                
            </div>
            
            <div class='row'>
            	
            </div>
            
            <div id="actions" class="row">
                <div class="col-md-12">
                    <button type="submit" class="btn btn-primary" >Salvar Chamado</button>
                    <a href="index" class="btn btn-default">Cancelar</a>
                </div>
            </div>
        </form>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>