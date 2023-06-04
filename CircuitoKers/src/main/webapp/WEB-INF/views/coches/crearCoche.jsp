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
					<h2 class="text-center">CREA TU COCHE DE F1</h2>
					<!-- FORMULARIO COCHE -->
					<form:form modelAttribute="cocheCommand" action="/circuitokers/crearCoche" name="cocheCommand" id="form-coche" method="post" autocomplete="off" cssClass="form-horizontal bg-platino">
					<form:hidden path="id"/>
						
						<!-- Nombre del coche -->
						<div class="form-group">
							<label for="nombre" class="negrita">Nombre coche</label>
	                   		<form:input type="text" path="nombre" id="nombre" title="Nombre del coche" cssClass="form-control" />
	                      	<form:errors path="nombre" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Escuderia -->
						<div class="form-group">
							<label for="escuderia" class="negrita">Escuderia</label>
							<form:input type="text" path="escuderia" id="escuderia" title="Escuderia del coche" cssClass="form-control" />
							<form:errors path="escuderia" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Potencia -->
						<div class="form-group">
							<label for="potencia" class="negrita">Potencia</label>
							<form:input type="number" path="potencia" id="potencia" cssClass="form-control" title="Potencia del coche" />
							<form:errors path="potencia" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
						</div>
						
						<!-- Ganancia por curva -->
						<div class="form-group">
							<label for="gananciaCurva" class="negrita">Ganancia por curva</label>
							<form:input type="number" path="gananciaCurva" id="gananciaCurva" cssClass="form-control" title="Ganancia por curva del coche" />
							<form:errors path="gananciaCurva" cssClass="errorInput" cssStyle="color: red !important;" element="div" />
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