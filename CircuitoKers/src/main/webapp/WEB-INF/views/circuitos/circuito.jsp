<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/tlds.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="../includes/head.jsp" %>
</head>
<body>
	<!-- NAVBAR -->
	<%@ include file="../includes/navbar.jsp" %>
	
	<!-- CONTENIDO -->
	<section class="container-fluid">
		<div class="container col-12 mt-5 mb-5 main bg-light">
			<div class="col-12">
				<div class="row form-group">
					<div class="col-12 mt-3 mb-2 text-center">
						<h3>Circuito</h3>
					</div>
					<div class="col-12">
						<div class="card">
							<div class="card-body">
								<ul class="list-group list-group-flush">
								
									<li class="list-group-item">
										<div class="row">
											<div class="col-12 col-sm-12 col-md-6 col-lg-3">
												<span class="negrita">Nombre</span><br>
												<c:if test="${not empty circuito and not empty circuito.nombre}">
										        	<span>${circuito.nombre}</span>
										        </c:if>
											</div>
										</div>
									</li>
									<li class="list-group-item">
										<div class="row">
											<div class="col-12 col-sm-12 col-md-6 col-lg-3">
												<span class="negrita">Ciudad</span><br>
												<c:if test="${not empty circuito and not empty circuito.ciudad}">
										        	<span>${circuito.ciudad}</span>
										        </c:if>
											</div>
										</div>
									</li>
									
									<li class="list-group-item">
										<div class="row">
											<div class="col-12 col-sm-12 col-md-6 col-lg-3">
												<span class="negrita">País</span><br>
												<c:if test="${not empty circuito and not empty circuito.pais}">
										        	<span>${circuito.pais}</span>
										        </c:if>
											</div>
										</div>
									</li>
									
									<li class="list-group-item">
										<div class="row">
											<div class="col-12 col-sm-12 col-md-6 col-lg-3">
												<span class="negrita">Nº vueltas</span><br>
												<c:if test="${not empty circuito and not empty circuito.numVueltas}">
													<span>${circuito.numVueltas}</span>
												</c:if>
											</div>
										</div>
									</li>
									
									<li class="list-group-item">
										<div class="row">
											<div class="col-12 col-sm-12 col-md-6 col-lg-3">
												<span class="negrita">Longitud vuelta</span><br>
												<c:if test="${not empty circuito and not empty circuito.longVuelta}">
													<span>${circuito.longVuelta}</span>
												</c:if>
											</div>
										</div>
									</li>
									
									<li class="list-group-item">
										<div class="row">
											<div class="col-12 col-sm-12 col-md-6 col-lg-3">
												<span class="negrita">Nº curvas</span><br>
												<c:if test="${not empty circuito and not empty circuito.numCurvas}">
													<span>${circuito.numCurvas}</span>
												</c:if>
											</div>
										</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<!-- BOTON EDITAR -->
				    <div class="col-6 mt-3 text-left">
				    	<a class="btn btn-success btn-lg" href="/circuitokers/editarCircuito/${circuito.id}">Editar</a>
				    </div>
				    <!-- BOTON LISTADO -->
				    <div class="col-6 mt-3 text-right">
				    	<a class="btn btn-danger btn-lg" href="/circuitokers/circuitos">Volver</a>
				    </div>
				</div>
			</div>
		</div>
	</section>

	<%@ include file="../includes/footer.jsp" %>
</body>
</html>