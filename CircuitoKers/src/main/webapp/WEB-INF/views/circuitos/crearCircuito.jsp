<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/tlds.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="../includes/head.jsp" %>
</head>
<body>
	<%@ include file="../includes/navbar.jsp" %>
	
	<!-- CONTENIDO -->
	<section class="container-fluid">
		<div class="row">
			<div class="container main-form mt-5">
				<div class="col-12 bg-platino">
					<h2 class="text-center">CREA TU CIRCUITO DE F1</h2>
					<!-- FORMULARIO CIRCUITO -->
					<form:form modelAttribute="circuitoCommand" action="/circuitokers/crearCircuito" id="form-circuito" method="post" autocomplete="off" cssClass="form-horizontal">
					<form:hidden path="id"/>
						
						<!-- Nombre del circuito -->
						<div class="form-group">
							<label for="nombre" class="negrita">Nombre circuito</label>
							<form:input type="text" path="nombre" id="nombrecircuito" title="Nombre del circuito" cssClass="form-control" aria-describedby="emailHelp" />
						    <form:errors path="nombre" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Ciudad --> 
						<div class="form-group">
							<label for="ciudad" class="negrita">Ciudad:</label>
							<form:input type="text" path="ciudad" id="ciudad" cssClass="form-control" title="Nombre de la ciudad del circuito" />
							<form:errors path="ciudad" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Pais -->
						<div class="form-group">
							<label for="pais" class="negrita">País</label>
						    <form:input type="text" path="pais" id="pais" title="Pais del circuito" cssClass="form-control"  />
						    <form:errors path="pais" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						
						<!-- Numero de vueltas al circuito (minimo 40 y maximo 80 -->
						<div class="form-group">
							<label for="numVueltas" class="negrita">Número vueltas</label>
					    	<form:input type="number" path="numVueltas" id="num-vueltas" cssClass="form-control" title="Número de vueltas del circuito"  />
					    	<form:errors path="numVueltas" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Distancia en metros de cada vuelta (minimo 3000 m y maximo 9000 m  -->
						<div class="form-group">
							<label for="longVuelta" class="negrita">Longitud vuelta</label>
							<form:input type="number" path="longVuelta" id="long-vuelta" cssClass="form-control" title="Longitud por cada vuelta(m)" />
							<form:errors path="longVuelta" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Numero de curvas por vuelta (minimo 6 curvas y maximo 20 curvas) -->
						<div class="form-group">
							<label for="numCurvas" class="negrita">Número curvas</label>
					    	<form:input type="number" path="numCurvas" id="num-curvas" cssClass="form-control" title="Número de curvas del circuito" />
					    	<form:errors path="numCurvas" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Botones -->
				    	<div class="row form-group">
						    <div class="col-md-8 text-center">
						    	<button type="submit" class="btn btn-primary btn-lg">Crear</button>
						    </div>
						    <div class="col-md-4 text-left">
						    	<button type="reset" class="btn btn-danger btn-lg">Reset</button>
						    </div>
					    </div>
					</form:form>
				</div>
			</div>
	    </div>
    </section>

	<%@ include file="../includes/footer.jsp" %>
</body>
</html>