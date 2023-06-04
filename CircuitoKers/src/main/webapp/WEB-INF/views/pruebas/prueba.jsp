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
			<div class="container main-form mt-5 pt-5">
				<h2 class="text-center">GANACIAS DE POTENCIA (KW)</h2>
				<!-- RESULTADO PRUEBA -->
					<div class="card card-center" style="margin-top: 50px !important;">
						<div class="card-header">
							<span class="negrita">Resultado</span>
						</div>
						<div class="card-body">
							<ul class="list-group list-group-flush">
								<li class="list-group-item">
									<div class="row">
										<div class="col-12 col-sm-12 col-md-4 col-lg-4">
											<span class="negrita">Nombre circuito</span><br>
											<c:if test="${not empty pruebaCommand and not empty pruebaCommand.nombreCircuito}">
					                        	<span>${pruebaCommand.nombreCircuito}</span>
					                        </c:if>
										</div>
										<div class="col-12 col-sm-12 col-md-4 col-lg-4">
											<span class="negrita">Nombre coche</span><br>
											<c:if test="${not empty pruebaCommand and not empty pruebaCommand.nombreCoche}">
					                        	<span>${pruebaCommand.nombreCoche}</span>
					                        </c:if>
										</div>
										<div class="col-12 col-sm-12 col-md-4 col-lg-4">
											<span class="negrita">Ganancia total</span><br>
											<c:if test="${not empty pruebaCommand and not empty pruebaCommand.gananciaTotal}">
												<span>${pruebaCommand.gananciaTotal}</span>
											</c:if>
										</div>
									</div>
								</li>
							</ul>
						</div>
					</div>

					<!-- BOTONES -->
			    	<div class="row form-group mt-5">
                        <div class="col-md-12 text-center">
                           	<a class="btn btn-danger btn-lg" href="/inicio">Ir a inicio</a>
                        </div>
                    </div>
			</div>
	    </div>
    </section>

	<%@ include file="../includes/footer.jsp" %>
</body>
</html>