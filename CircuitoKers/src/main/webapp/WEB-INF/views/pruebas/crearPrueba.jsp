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
					<h2 class="text-center">CÁLCULO DE GANANCIA DE POTENCIA</h2>
					<!-- FORMULARIO PRUEBA -->
					<form:form modelAttribute="pruebaCommand" action="/circuitokers/calcularPrueba" name="pruebaCommand" id="form-circuito" method="post" autocomplete="off" cssClass="form-horizontal">
						
						<!-- Nombre del circuito -->
						<div class="form-group">
							<label for="nombreCircuito" class="negrita">Nombre circuito</label>
	                        <form:input type="text" list="listaCircuitosDto" path="nombreCircuito" id="nombreCircuito" title="Nombre del circuito" cssClass="form-control" />
	                        <datalist id="listaCircuitosDto">
							  <c:forEach var="circuito" items="${circuitosDto}">
							        <option value="${circuito.nombre}">${circuito.nombre}(${circuito.ciudad})</option>
							   </c:forEach>
							</datalist>
	                        <form:errors path="nombreCircuito" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Nombre del coche --> 
						<div class="form-group">
							<label for="nombreCoche" class="negrita">Nombre coche</label>
	                        <form:input type="text" list="listaCochesDto" path="nombreCoche" id="nombreCoche" title="Nombre del coche" cssClass="form-control" />
	                        <datalist id="listaCochesDto">
							  <c:forEach var="coche" items="${cochesDto}">
							        <option value="${coche.nombre}">${coche.nombre}(${coche.escuderia})</option>
							   </c:forEach>
							</datalist>
	                        <form:errors path="nombreCoche" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
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
	
	<script type="text/javascript">

//


	</script>
</body>
</html>